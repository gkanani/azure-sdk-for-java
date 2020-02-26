/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SqlPoolOperations.
 */
public class SqlPoolOperationsInner {
    /** The Retrofit service to perform REST calls. */
    private SqlPoolOperationsService service;
    /** The service client containing this operation class. */
    private SynapseManagementClientImpl client;

    /**
     * Initializes an instance of SqlPoolOperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SqlPoolOperationsInner(Retrofit retrofit, SynapseManagementClientImpl client) {
        this.service = retrofit.create(SqlPoolOperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlPoolOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SqlPoolOperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolOperations list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces/{workspaceName}/sqlPools/{sqlPoolName}/operations")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("sqlPoolName") String sqlPoolName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.synapse.v2019_06_01_preview.SqlPoolOperations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of operations performed on the SQL pool.
     * Gets a list of operations performed on the SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SqlPoolOperationInner&gt; object if successful.
     */
    public PagedList<SqlPoolOperationInner> list(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        ServiceResponse<Page<SqlPoolOperationInner>> response = listSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName).toBlocking().single();
        return new PagedList<SqlPoolOperationInner>(response.body()) {
            @Override
            public Page<SqlPoolOperationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of operations performed on the SQL pool.
     * Gets a list of operations performed on the SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SqlPoolOperationInner>> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName, final ListOperationCallback<SqlPoolOperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName),
            new Func1<String, Observable<ServiceResponse<Page<SqlPoolOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolOperationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of operations performed on the SQL pool.
     * Gets a list of operations performed on the SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolOperationInner&gt; object
     */
    public Observable<Page<SqlPoolOperationInner>> listAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        return listWithServiceResponseAsync(resourceGroupName, workspaceName, sqlPoolName)
            .map(new Func1<ServiceResponse<Page<SqlPoolOperationInner>>, Page<SqlPoolOperationInner>>() {
                @Override
                public Page<SqlPoolOperationInner> call(ServiceResponse<Page<SqlPoolOperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of operations performed on the SQL pool.
     * Gets a list of operations performed on the SQL pool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolOperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<SqlPoolOperationInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        return listSinglePageAsync(resourceGroupName, workspaceName, sqlPoolName)
            .concatMap(new Func1<ServiceResponse<Page<SqlPoolOperationInner>>, Observable<ServiceResponse<Page<SqlPoolOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolOperationInner>>> call(ServiceResponse<Page<SqlPoolOperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of operations performed on the SQL pool.
     * Gets a list of operations performed on the SQL pool.
     *
    ServiceResponse<PageImpl<SqlPoolOperationInner>> * @param resourceGroupName The name of the resource group. The name is case insensitive.
    ServiceResponse<PageImpl<SqlPoolOperationInner>> * @param workspaceName The name of the workspace
    ServiceResponse<PageImpl<SqlPoolOperationInner>> * @param sqlPoolName SQL pool name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SqlPoolOperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SqlPoolOperationInner>>> listSinglePageAsync(final String resourceGroupName, final String workspaceName, final String sqlPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (sqlPoolName == null) {
            throw new IllegalArgumentException("Parameter sqlPoolName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), resourceGroupName, workspaceName, sqlPoolName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SqlPoolOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolOperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SqlPoolOperationInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SqlPoolOperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SqlPoolOperationInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SqlPoolOperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SqlPoolOperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a list of operations performed on the SQL pool.
     * Gets a list of operations performed on the SQL pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;SqlPoolOperationInner&gt; object if successful.
     */
    public PagedList<SqlPoolOperationInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<SqlPoolOperationInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<SqlPoolOperationInner>(response.body()) {
            @Override
            public Page<SqlPoolOperationInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets a list of operations performed on the SQL pool.
     * Gets a list of operations performed on the SQL pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SqlPoolOperationInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<SqlPoolOperationInner>> serviceFuture, final ListOperationCallback<SqlPoolOperationInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<SqlPoolOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolOperationInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets a list of operations performed on the SQL pool.
     * Gets a list of operations performed on the SQL pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolOperationInner&gt; object
     */
    public Observable<Page<SqlPoolOperationInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<SqlPoolOperationInner>>, Page<SqlPoolOperationInner>>() {
                @Override
                public Page<SqlPoolOperationInner> call(ServiceResponse<Page<SqlPoolOperationInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets a list of operations performed on the SQL pool.
     * Gets a list of operations performed on the SQL pool.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;SqlPoolOperationInner&gt; object
     */
    public Observable<ServiceResponse<Page<SqlPoolOperationInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<SqlPoolOperationInner>>, Observable<ServiceResponse<Page<SqlPoolOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolOperationInner>>> call(ServiceResponse<Page<SqlPoolOperationInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets a list of operations performed on the SQL pool.
     * Gets a list of operations performed on the SQL pool.
     *
    ServiceResponse<PageImpl<SqlPoolOperationInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;SqlPoolOperationInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<SqlPoolOperationInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<SqlPoolOperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<SqlPoolOperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SqlPoolOperationInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<SqlPoolOperationInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SqlPoolOperationInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SqlPoolOperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SqlPoolOperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Oracle source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = OracleSource.class)
@JsonTypeName("OracleSource")
public class OracleSource extends CopySource {
    /**
     * Oracle reader query. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "oracleReaderQuery")
    private Object oracleReaderQuery;

    /**
     * Query timeout. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     */
    @JsonProperty(value = "queryTimeout")
    private Object queryTimeout;

    /**
     * The partition mechanism that will be used for Oracle read in parallel.
     * Possible values include: 'None', 'PhysicalPartitionsOfTable',
     * 'DynamicRange'.
     */
    @JsonProperty(value = "partitionOption")
    private OraclePartitionOption partitionOption;

    /**
     * The settings that will be leveraged for Oracle source partitioning.
     */
    @JsonProperty(value = "partitionSettings")
    private OraclePartitionSettings partitionSettings;

    /**
     * Get oracle reader query. Type: string (or Expression with resultType string).
     *
     * @return the oracleReaderQuery value
     */
    public Object oracleReaderQuery() {
        return this.oracleReaderQuery;
    }

    /**
     * Set oracle reader query. Type: string (or Expression with resultType string).
     *
     * @param oracleReaderQuery the oracleReaderQuery value to set
     * @return the OracleSource object itself.
     */
    public OracleSource withOracleReaderQuery(Object oracleReaderQuery) {
        this.oracleReaderQuery = oracleReaderQuery;
        return this;
    }

    /**
     * Get query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the queryTimeout value
     */
    public Object queryTimeout() {
        return this.queryTimeout;
    }

    /**
     * Set query timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param queryTimeout the queryTimeout value to set
     * @return the OracleSource object itself.
     */
    public OracleSource withQueryTimeout(Object queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }

    /**
     * Get the partition mechanism that will be used for Oracle read in parallel. Possible values include: 'None', 'PhysicalPartitionsOfTable', 'DynamicRange'.
     *
     * @return the partitionOption value
     */
    public OraclePartitionOption partitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partition mechanism that will be used for Oracle read in parallel. Possible values include: 'None', 'PhysicalPartitionsOfTable', 'DynamicRange'.
     *
     * @param partitionOption the partitionOption value to set
     * @return the OracleSource object itself.
     */
    public OracleSource withPartitionOption(OraclePartitionOption partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the settings that will be leveraged for Oracle source partitioning.
     *
     * @return the partitionSettings value
     */
    public OraclePartitionSettings partitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the settings that will be leveraged for Oracle source partitioning.
     *
     * @param partitionSettings the partitionSettings value to set
     * @return the OracleSource object itself.
     */
    public OracleSource withPartitionSettings(OraclePartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

}
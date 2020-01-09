/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.policy.v2019_09_01.implementation;

import com.microsoft.azure.management.policy.v2019_09_01.PolicySetDefinition;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.policy.v2019_09_01.PolicyType;
import java.util.Map;
import com.microsoft.azure.management.policy.v2019_09_01.ParameterDefinitionsValue;
import java.util.List;
import com.microsoft.azure.management.policy.v2019_09_01.PolicyDefinitionReference;
import com.microsoft.azure.management.policy.v2019_09_01.PolicyDefinitionGroup;

class PolicySetDefinitionImpl extends CreatableUpdatableImpl<PolicySetDefinition, PolicySetDefinitionInner, PolicySetDefinitionImpl> implements PolicySetDefinition, PolicySetDefinition.Definition, PolicySetDefinition.Update {
    private String policySetDefinitionName;
    private final PolicyManager manager;

    PolicySetDefinitionImpl(String name, PolicyManager manager) {
        super(name, new PolicySetDefinitionInner());
        this.manager = manager;
        // Set resource name
        this.policySetDefinitionName = name;
        //
    }

    PolicySetDefinitionImpl(PolicySetDefinitionInner inner, PolicyManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.policySetDefinitionName = inner.name();
        // set resource ancestor and positional variables
        this.policySetDefinitionName = IdParsingUtils.getValueFromIdByName(inner.id(), "policySetDefinitions");
        // set other parameters for create and update
    }

    @Override
    public PolicyManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PolicySetDefinition> createResourceAsync() {
        PolicySetDefinitionsInner client = this.manager().inner().policySetDefinitions();
        return client.createOrUpdateAsync(this.policySetDefinitionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PolicySetDefinition> updateResourceAsync() {
        PolicySetDefinitionsInner client = this.manager().inner().policySetDefinitions();
        return client.createOrUpdateAsync(this.policySetDefinitionName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PolicySetDefinitionInner> getInnerAsync() {
        PolicySetDefinitionsInner client = this.manager().inner().policySetDefinitions();
        return client.getAsync(this.policySetDefinitionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String displayName() {
        return this.inner().displayName();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Object metadata() {
        return this.inner().metadata();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, ParameterDefinitionsValue> parameters() {
        return this.inner().parameters();
    }

    @Override
    public List<PolicyDefinitionGroup> policyDefinitionGroups() {
        return this.inner().policyDefinitionGroups();
    }

    @Override
    public List<PolicyDefinitionReference> policyDefinitions() {
        return this.inner().policyDefinitions();
    }

    @Override
    public PolicyType policyType() {
        return this.inner().policyType();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PolicySetDefinitionImpl withPolicyDefinitions(List<PolicyDefinitionReference> policyDefinitions) {
        this.inner().withPolicyDefinitions(policyDefinitions);
        return this;
    }

    @Override
    public PolicySetDefinitionImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public PolicySetDefinitionImpl withDisplayName(String displayName) {
        this.inner().withDisplayName(displayName);
        return this;
    }

    @Override
    public PolicySetDefinitionImpl withMetadata(Object metadata) {
        this.inner().withMetadata(metadata);
        return this;
    }

    @Override
    public PolicySetDefinitionImpl withParameters(Map<String, ParameterDefinitionsValue> parameters) {
        this.inner().withParameters(parameters);
        return this;
    }

    @Override
    public PolicySetDefinitionImpl withPolicyDefinitionGroups(List<PolicyDefinitionGroup> policyDefinitionGroups) {
        this.inner().withPolicyDefinitionGroups(policyDefinitionGroups);
        return this;
    }

    @Override
    public PolicySetDefinitionImpl withPolicyType(PolicyType policyType) {
        this.inner().withPolicyType(policyType);
        return this;
    }

}
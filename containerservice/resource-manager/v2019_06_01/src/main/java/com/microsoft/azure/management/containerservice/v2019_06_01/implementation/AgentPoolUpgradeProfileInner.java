/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_06_01.implementation;

import com.microsoft.azure.management.containerservice.v2019_06_01.OSType;
import java.util.List;
import com.microsoft.azure.management.containerservice.v2019_06_01.AgentPoolUpgradeProfilePropertiesUpgradesItem;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The list of available upgrades for an agent pool.
 */
@JsonFlatten
public class AgentPoolUpgradeProfileInner {
    /**
     * Id of the agent pool upgrade profile.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Name of the agent pool upgrade profile.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Type of the agent pool upgrade profile.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Kubernetes version (major, minor, patch).
     */
    @JsonProperty(value = "properties.kubernetesVersion", required = true)
    private String kubernetesVersion;

    /**
     * OsType to be used to specify os type. Choose from Linux and Windows.
     * Default to Linux. Possible values include: 'Linux', 'Windows'.
     */
    @JsonProperty(value = "properties.osType", required = true)
    private OSType osType;

    /**
     * List of orchestrator types and versions available for upgrade.
     */
    @JsonProperty(value = "properties.upgrades")
    private List<AgentPoolUpgradeProfilePropertiesUpgradesItem> upgrades;

    /**
     * Get id of the agent pool upgrade profile.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get name of the agent pool upgrade profile.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get type of the agent pool upgrade profile.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get kubernetes version (major, minor, patch).
     *
     * @return the kubernetesVersion value
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Set kubernetes version (major, minor, patch).
     *
     * @param kubernetesVersion the kubernetesVersion value to set
     * @return the AgentPoolUpgradeProfileInner object itself.
     */
    public AgentPoolUpgradeProfileInner withKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

    /**
     * Get osType to be used to specify os type. Choose from Linux and Windows. Default to Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @return the osType value
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set osType to be used to specify os type. Choose from Linux and Windows. Default to Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @param osType the osType value to set
     * @return the AgentPoolUpgradeProfileInner object itself.
     */
    public AgentPoolUpgradeProfileInner withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get list of orchestrator types and versions available for upgrade.
     *
     * @return the upgrades value
     */
    public List<AgentPoolUpgradeProfilePropertiesUpgradesItem> upgrades() {
        return this.upgrades;
    }

    /**
     * Set list of orchestrator types and versions available for upgrade.
     *
     * @param upgrades the upgrades value to set
     * @return the AgentPoolUpgradeProfileInner object itself.
     */
    public AgentPoolUpgradeProfileInner withUpgrades(List<AgentPoolUpgradeProfilePropertiesUpgradesItem> upgrades) {
        this.upgrades = upgrades;
        return this;
    }

}
/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The class to specify one track property condition.
 */
public class FilterTrackPropertyCondition {
    /**
     * The track property type. Possible values include: 'Unknown', 'Type',
     * 'Name', 'Language', 'FourCC', 'Bitrate'.
     */
    @JsonProperty(value = "property", required = true)
    private FilterTrackPropertyType property;

    /**
     * The track property value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * The track property condition operation. Possible values include:
     * 'Equal', 'NotEqual'.
     */
    @JsonProperty(value = "operation", required = true)
    private FilterTrackPropertyCompareOperation operation;

    /**
     * Get the track property type. Possible values include: 'Unknown', 'Type', 'Name', 'Language', 'FourCC', 'Bitrate'.
     *
     * @return the property value
     */
    public FilterTrackPropertyType property() {
        return this.property;
    }

    /**
     * Set the track property type. Possible values include: 'Unknown', 'Type', 'Name', 'Language', 'FourCC', 'Bitrate'.
     *
     * @param property the property value to set
     * @return the FilterTrackPropertyCondition object itself.
     */
    public FilterTrackPropertyCondition withProperty(FilterTrackPropertyType property) {
        this.property = property;
        return this;
    }

    /**
     * Get the track property value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the track property value.
     *
     * @param value the value value to set
     * @return the FilterTrackPropertyCondition object itself.
     */
    public FilterTrackPropertyCondition withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the track property condition operation. Possible values include: 'Equal', 'NotEqual'.
     *
     * @return the operation value
     */
    public FilterTrackPropertyCompareOperation operation() {
        return this.operation;
    }

    /**
     * Set the track property condition operation. Possible values include: 'Equal', 'NotEqual'.
     *
     * @param operation the operation value to set
     * @return the FilterTrackPropertyCondition object itself.
     */
    public FilterTrackPropertyCondition withOperation(FilterTrackPropertyCompareOperation operation) {
        this.operation = operation;
        return this;
    }

}
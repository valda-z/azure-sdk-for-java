// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RecommendedElasticPoolListResult model. */
@Fluent
public final class RecommendedElasticPoolListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecommendedElasticPoolListResultInner.class);

    /*
     * The list of recommended elastic pools hosted in the server.
     */
    @JsonProperty(value = "value", required = true)
    private List<RecommendedElasticPoolInner> value;

    /**
     * Get the value property: The list of recommended elastic pools hosted in the server.
     *
     * @return the value value.
     */
    public List<RecommendedElasticPoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of recommended elastic pools hosted in the server.
     *
     * @param value the value value to set.
     * @return the RecommendedElasticPoolListResultInner object itself.
     */
    public RecommendedElasticPoolListResultInner withValue(List<RecommendedElasticPoolInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model RecommendedElasticPoolListResultInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
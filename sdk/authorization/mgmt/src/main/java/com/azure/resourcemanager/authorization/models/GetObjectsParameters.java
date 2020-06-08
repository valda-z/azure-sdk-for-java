// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** The GetObjectsParameters model. */
@Fluent
public final class GetObjectsParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GetObjectsParameters.class);

    /*
     * The requested object IDs.
     */
    @JsonProperty(value = "objectIds")
    private List<String> objectIds;

    /*
     * The requested object types.
     */
    @JsonProperty(value = "types")
    private List<String> types;

    /*
     * If true, also searches for object IDs in the partner tenant.
     */
    @JsonProperty(value = "includeDirectoryObjectReferences")
    private Boolean includeDirectoryObjectReferences;

    /*
     * Request parameters for the GetObjectsByObjectIds API.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the objectIds property: The requested object IDs.
     *
     * @return the objectIds value.
     */
    public List<String> objectIds() {
        return this.objectIds;
    }

    /**
     * Set the objectIds property: The requested object IDs.
     *
     * @param objectIds the objectIds value to set.
     * @return the GetObjectsParameters object itself.
     */
    public GetObjectsParameters withObjectIds(List<String> objectIds) {
        this.objectIds = objectIds;
        return this;
    }

    /**
     * Get the types property: The requested object types.
     *
     * @return the types value.
     */
    public List<String> types() {
        return this.types;
    }

    /**
     * Set the types property: The requested object types.
     *
     * @param types the types value to set.
     * @return the GetObjectsParameters object itself.
     */
    public GetObjectsParameters withTypes(List<String> types) {
        this.types = types;
        return this;
    }

    /**
     * Get the includeDirectoryObjectReferences property: If true, also searches for object IDs in the partner tenant.
     *
     * @return the includeDirectoryObjectReferences value.
     */
    public Boolean includeDirectoryObjectReferences() {
        return this.includeDirectoryObjectReferences;
    }

    /**
     * Set the includeDirectoryObjectReferences property: If true, also searches for object IDs in the partner tenant.
     *
     * @param includeDirectoryObjectReferences the includeDirectoryObjectReferences value to set.
     * @return the GetObjectsParameters object itself.
     */
    public GetObjectsParameters withIncludeDirectoryObjectReferences(Boolean includeDirectoryObjectReferences) {
        this.includeDirectoryObjectReferences = includeDirectoryObjectReferences;
        return this;
    }

    /**
     * Get the additionalProperties property: Request parameters for the GetObjectsByObjectIds API.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Request parameters for the GetObjectsByObjectIds API.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the GetObjectsParameters object itself.
     */
    public GetObjectsParameters withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
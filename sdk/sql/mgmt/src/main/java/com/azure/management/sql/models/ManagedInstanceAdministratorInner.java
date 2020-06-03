// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.sql.ManagedInstanceAdministratorType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The ManagedInstanceAdministrator model. */
@JsonFlatten
@Fluent
public class ManagedInstanceAdministratorInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedInstanceAdministratorInner.class);

    /*
     * Type of the managed instance administrator.
     */
    @JsonProperty(value = "properties.administratorType")
    private ManagedInstanceAdministratorType administratorType;

    /*
     * Login name of the managed instance administrator.
     */
    @JsonProperty(value = "properties.login")
    private String login;

    /*
     * SID (object ID) of the managed instance administrator.
     */
    @JsonProperty(value = "properties.sid")
    private UUID sid;

    /*
     * Tenant ID of the managed instance administrator.
     */
    @JsonProperty(value = "properties.tenantId")
    private UUID tenantId;

    /**
     * Get the administratorType property: Type of the managed instance administrator.
     *
     * @return the administratorType value.
     */
    public ManagedInstanceAdministratorType administratorType() {
        return this.administratorType;
    }

    /**
     * Set the administratorType property: Type of the managed instance administrator.
     *
     * @param administratorType the administratorType value to set.
     * @return the ManagedInstanceAdministratorInner object itself.
     */
    public ManagedInstanceAdministratorInner withAdministratorType(ManagedInstanceAdministratorType administratorType) {
        this.administratorType = administratorType;
        return this;
    }

    /**
     * Get the login property: Login name of the managed instance administrator.
     *
     * @return the login value.
     */
    public String login() {
        return this.login;
    }

    /**
     * Set the login property: Login name of the managed instance administrator.
     *
     * @param login the login value to set.
     * @return the ManagedInstanceAdministratorInner object itself.
     */
    public ManagedInstanceAdministratorInner withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get the sid property: SID (object ID) of the managed instance administrator.
     *
     * @return the sid value.
     */
    public UUID sid() {
        return this.sid;
    }

    /**
     * Set the sid property: SID (object ID) of the managed instance administrator.
     *
     * @param sid the sid value to set.
     * @return the ManagedInstanceAdministratorInner object itself.
     */
    public ManagedInstanceAdministratorInner withSid(UUID sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Get the tenantId property: Tenant ID of the managed instance administrator.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant ID of the managed instance administrator.
     *
     * @param tenantId the tenantId value to set.
     * @return the ManagedInstanceAdministratorInner object itself.
     */
    public ManagedInstanceAdministratorInner withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
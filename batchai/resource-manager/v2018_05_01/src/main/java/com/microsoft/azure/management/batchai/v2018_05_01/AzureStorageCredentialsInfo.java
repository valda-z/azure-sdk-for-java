/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure storage account credentials.
 */
public class AzureStorageCredentialsInfo {
    /**
     * Account key.
     * Storage account key. One of accountKey or accountKeySecretReference must
     * be specified.
     */
    @JsonProperty(value = "accountKey")
    private String accountKey;

    /**
     * Account key secret reference.
     * Information about KeyVault secret storing the storage account key. One
     * of accountKey or accountKeySecretReference must be specified.
     */
    @JsonProperty(value = "accountKeySecretReference")
    private KeyVaultSecretReference accountKeySecretReference;

    /**
     * Get storage account key. One of accountKey or accountKeySecretReference must be specified.
     *
     * @return the accountKey value
     */
    public String accountKey() {
        return this.accountKey;
    }

    /**
     * Set storage account key. One of accountKey or accountKeySecretReference must be specified.
     *
     * @param accountKey the accountKey value to set
     * @return the AzureStorageCredentialsInfo object itself.
     */
    public AzureStorageCredentialsInfo withAccountKey(String accountKey) {
        this.accountKey = accountKey;
        return this;
    }

    /**
     * Get information about KeyVault secret storing the storage account key. One of accountKey or accountKeySecretReference must be specified.
     *
     * @return the accountKeySecretReference value
     */
    public KeyVaultSecretReference accountKeySecretReference() {
        return this.accountKeySecretReference;
    }

    /**
     * Set information about KeyVault secret storing the storage account key. One of accountKey or accountKeySecretReference must be specified.
     *
     * @param accountKeySecretReference the accountKeySecretReference value to set
     * @return the AzureStorageCredentialsInfo object itself.
     */
    public AzureStorageCredentialsInfo withAccountKeySecretReference(KeyVaultSecretReference accountKeySecretReference) {
        this.accountKeySecretReference = accountKeySecretReference;
        return this;
    }

}

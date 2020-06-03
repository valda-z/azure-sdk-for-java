/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mixedreality.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Plan for the resource.
 */
public class Plan {
    /**
     * A user defined name of the 3rd Party Artifact that is being procured.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The publisher of the 3rd Party Artifact that is being bought. E.g.
     * NewRelic.
     */
    @JsonProperty(value = "publisher", required = true)
    private String publisher;

    /**
     * The 3rd Party artifact that is being procured. E.g. NewRelic. Product
     * maps to the OfferID specified for the artifact at the time of Data
     * Market onboarding.
     */
    @JsonProperty(value = "product", required = true)
    private String product;

    /**
     * A publisher provided promotion code as provisioned in Data Market for
     * the said product/artifact.
     */
    @JsonProperty(value = "promotionCode")
    private String promotionCode;

    /**
     * The version of the desired product/artifact.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get a user defined name of the 3rd Party Artifact that is being procured.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set a user defined name of the 3rd Party Artifact that is being procured.
     *
     * @param name the name value to set
     * @return the Plan object itself.
     */
    public Plan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the publisher of the 3rd Party Artifact that is being bought. E.g. NewRelic.
     *
     * @return the publisher value
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher of the 3rd Party Artifact that is being bought. E.g. NewRelic.
     *
     * @param publisher the publisher value to set
     * @return the Plan object itself.
     */
    public Plan withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the 3rd Party artifact that is being procured. E.g. NewRelic. Product maps to the OfferID specified for the artifact at the time of Data Market onboarding.
     *
     * @return the product value
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the 3rd Party artifact that is being procured. E.g. NewRelic. Product maps to the OfferID specified for the artifact at the time of Data Market onboarding.
     *
     * @param product the product value to set
     * @return the Plan object itself.
     */
    public Plan withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get a publisher provided promotion code as provisioned in Data Market for the said product/artifact.
     *
     * @return the promotionCode value
     */
    public String promotionCode() {
        return this.promotionCode;
    }

    /**
     * Set a publisher provided promotion code as provisioned in Data Market for the said product/artifact.
     *
     * @param promotionCode the promotionCode value to set
     * @return the Plan object itself.
     */
    public Plan withPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }

    /**
     * Get the version of the desired product/artifact.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version of the desired product/artifact.
     *
     * @param version the version value to set
     * @return the Plan object itself.
     */
    public Plan withVersion(String version) {
        this.version = version;
        return this;
    }

}
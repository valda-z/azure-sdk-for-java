// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for SettingNames. */
public enum SettingNames {
    /** Enum value AutoLogon. */
    AUTO_LOGON("AutoLogon"),

    /** Enum value FirstLogonCommands. */
    FIRST_LOGON_COMMANDS("FirstLogonCommands");

    /** The actual serialized value for a SettingNames instance. */
    private final String value;

    SettingNames(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SettingNames instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SettingNames object, or null if unable to parse.
     */
    @JsonCreator
    public static SettingNames fromString(String value) {
        SettingNames[] items = SettingNames.values();
        for (SettingNames item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
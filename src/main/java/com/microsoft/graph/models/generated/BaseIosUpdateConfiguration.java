// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DayOfWeek;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Ios Update Configuration.
 */
public class BaseIosUpdateConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Active Hours Start.
     * Active Hours Start (active hours mean the time window when updates install should not happen)
     */
    @SerializedName("activeHoursStart")
    @Expose
    public com.microsoft.graph.models.extensions.TimeOfDay activeHoursStart;

    /**
     * The Active Hours End.
     * Active Hours End (active hours mean the time window when updates install should not happen)
     */
    @SerializedName("activeHoursEnd")
    @Expose
    public com.microsoft.graph.models.extensions.TimeOfDay activeHoursEnd;

    /**
     * The Scheduled Install Days.
     * Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
     */
    @SerializedName("scheduledInstallDays")
    @Expose
    public java.util.List<DayOfWeek> scheduledInstallDays;

    /**
     * The Utc Time Offset In Minutes.
     * UTC Time Offset indicated in minutes
     */
    @SerializedName("utcTimeOffsetInMinutes")
    @Expose
    public Integer utcTimeOffsetInMinutes;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}

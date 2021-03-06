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
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.models.extensions.WorkbookNamedItem;
import com.microsoft.graph.models.extensions.WorkbookPivotTable;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtection;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.generated.BaseWorkbookChartCollectionResponse;
import com.microsoft.graph.requests.extensions.WorkbookChartCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookNamedItemCollectionResponse;
import com.microsoft.graph.requests.extensions.WorkbookNamedItemCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookPivotTableCollectionResponse;
import com.microsoft.graph.requests.extensions.WorkbookPivotTableCollectionPage;
import com.microsoft.graph.requests.generated.BaseWorkbookTableCollectionResponse;
import com.microsoft.graph.requests.extensions.WorkbookTableCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Worksheet.
 */
public class BaseWorkbookWorksheet extends Entity implements IJsonBackedObject {


    /**
     * The Name.
     * 
     */
    @SerializedName("name")
    @Expose
    public String name;

    /**
     * The Position.
     * 
     */
    @SerializedName("position")
    @Expose
    public Integer position;

    /**
     * The Visibility.
     * 
     */
    @SerializedName("visibility")
    @Expose
    public String visibility;

    /**
     * The Charts.
     * 
     */
    public WorkbookChartCollectionPage charts;

    /**
     * The Names.
     * 
     */
    public WorkbookNamedItemCollectionPage names;

    /**
     * The Pivot Tables.
     * 
     */
    public WorkbookPivotTableCollectionPage pivotTables;

    /**
     * The Protection.
     * 
     */
    @SerializedName("protection")
    @Expose
    public WorkbookWorksheetProtection protection;

    /**
     * The Tables.
     * 
     */
    public WorkbookTableCollectionPage tables;


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


        if (json.has("charts")) {
            final BaseWorkbookChartCollectionResponse response = new BaseWorkbookChartCollectionResponse();
            if (json.has("charts@odata.nextLink")) {
                response.nextLink = json.get("charts@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("charts").toString(), JsonObject[].class);
            final WorkbookChart[] array = new WorkbookChart[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookChart.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            charts = new WorkbookChartCollectionPage(response, null);
        }

        if (json.has("names")) {
            final BaseWorkbookNamedItemCollectionResponse response = new BaseWorkbookNamedItemCollectionResponse();
            if (json.has("names@odata.nextLink")) {
                response.nextLink = json.get("names@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("names").toString(), JsonObject[].class);
            final WorkbookNamedItem[] array = new WorkbookNamedItem[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookNamedItem.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            names = new WorkbookNamedItemCollectionPage(response, null);
        }

        if (json.has("pivotTables")) {
            final BaseWorkbookPivotTableCollectionResponse response = new BaseWorkbookPivotTableCollectionResponse();
            if (json.has("pivotTables@odata.nextLink")) {
                response.nextLink = json.get("pivotTables@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("pivotTables").toString(), JsonObject[].class);
            final WorkbookPivotTable[] array = new WorkbookPivotTable[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookPivotTable.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            pivotTables = new WorkbookPivotTableCollectionPage(response, null);
        }

        if (json.has("tables")) {
            final BaseWorkbookTableCollectionResponse response = new BaseWorkbookTableCollectionResponse();
            if (json.has("tables@odata.nextLink")) {
                response.nextLink = json.get("tables@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("tables").toString(), JsonObject[].class);
            final WorkbookTable[] array = new WorkbookTable[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookTable.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            tables = new WorkbookTableCollectionPage(response, null);
        }
    }
}

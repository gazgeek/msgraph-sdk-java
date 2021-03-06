// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.requests.extensions.IWorkbookChartCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Collection Page.
 */
public class BaseWorkbookChartCollectionPage extends BaseCollectionPage<WorkbookChart, IWorkbookChartCollectionRequestBuilder> implements IBaseWorkbookChartCollectionPage {

    /**
     * A collection page for WorkbookChart
     *
     * @param response the serialized BaseWorkbookChartCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseWorkbookChartCollectionPage(final BaseWorkbookChartCollectionResponse response, final IWorkbookChartCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}

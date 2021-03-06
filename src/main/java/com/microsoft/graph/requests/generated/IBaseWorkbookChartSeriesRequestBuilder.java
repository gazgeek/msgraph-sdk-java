// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Chart Series Request Builder.
 */
public interface IBaseWorkbookChartSeriesRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookChartSeriesRequest instance
     */
    IWorkbookChartSeriesRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartSeriesRequest instance
     */
    IWorkbookChartSeriesRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    /**
     * Gets the request builder for WorkbookChartSeriesFormat
     *
     * @return the IWorkbookChartSeriesFormatRequestBuilder instance
     */
    IWorkbookChartSeriesFormatRequestBuilder format();

    IWorkbookChartPointCollectionRequestBuilder points();

    IWorkbookChartPointRequestBuilder points(final String id);

}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookChartLegendRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartLegendRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartLegendFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartLegendFormatRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Legend Request Builder.
 */
public class BaseWorkbookChartLegendRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookChartLegendRequestBuilder {

    /**
     * The request builder for the WorkbookChartLegend
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BaseWorkbookChartLegendRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookChartLegendRequest instance
     */
    public IWorkbookChartLegendRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartLegendRequest instance
     */
    public IWorkbookChartLegendRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WorkbookChartLegendRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for WorkbookChartLegendFormat
     *
     * @return the IWorkbookChartLegendFormatRequestBuilder instance
     */
    public IWorkbookChartLegendFormatRequestBuilder format() {
        return new WorkbookChartLegendFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }
}


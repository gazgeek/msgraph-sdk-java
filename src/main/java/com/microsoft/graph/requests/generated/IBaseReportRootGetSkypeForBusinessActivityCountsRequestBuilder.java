// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Report Root Get Skype For Business Activity Counts Request Builder.
 */
public interface IBaseReportRootGetSkypeForBusinessActivityCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSkypeForBusinessActivityCountsRequest
     *
     * @return the IReportRootGetSkypeForBusinessActivityCountsRequest instance
     */
    IReportRootGetSkypeForBusinessActivityCountsRequest buildRequest();

    /**
     * Creates the IReportRootGetSkypeForBusinessActivityCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSkypeForBusinessActivityCountsRequest instance
     */
    IReportRootGetSkypeForBusinessActivityCountsRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}

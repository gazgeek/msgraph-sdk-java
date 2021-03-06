// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.requests.generated.BaseWorkbookFunctionsPercentRank_IncRequestBuilder;

// This file is available for extending, afterwards please submit a pull request.

/**
 * The class for the Workbook Functions Percent Rank_Inc Request Builder.
 */
public class WorkbookFunctionsPercentRank_IncRequestBuilder extends BaseWorkbookFunctionsPercentRank_IncRequestBuilder implements IWorkbookFunctionsPercentRank_IncRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPercentRank_Inc
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param array the array
     * @param x the x
     * @param significance the significance
     */
    public WorkbookFunctionsPercentRank_IncRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement array, final com.google.gson.JsonElement x, final com.google.gson.JsonElement significance) {
        super(requestUrl, client, requestOptions, array, x, significance);
    }
}

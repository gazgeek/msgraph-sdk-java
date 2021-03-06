// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsAndRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Functions And Request Builder.
 */
public interface IBaseWorkbookFunctionsAndRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsAndRequest
     *
     * @return the IWorkbookFunctionsAndRequest instance
     */
    IWorkbookFunctionsAndRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsAndRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsAndRequest instance
     */
    IWorkbookFunctionsAndRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}

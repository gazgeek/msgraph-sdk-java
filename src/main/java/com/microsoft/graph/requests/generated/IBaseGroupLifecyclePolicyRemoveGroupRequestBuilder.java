// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.requests.extensions.IGroupLifecyclePolicyRemoveGroupRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Group Lifecycle Policy Remove Group Request Builder.
 */
public interface IBaseGroupLifecyclePolicyRemoveGroupRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IGroupLifecyclePolicyRemoveGroupRequest
     *
     * @return the IGroupLifecyclePolicyRemoveGroupRequest instance
     */
    IGroupLifecyclePolicyRemoveGroupRequest buildRequest();

    /**
     * Creates the IGroupLifecyclePolicyRemoveGroupRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IGroupLifecyclePolicyRemoveGroupRequest instance
     */
    IGroupLifecyclePolicyRemoveGroupRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}

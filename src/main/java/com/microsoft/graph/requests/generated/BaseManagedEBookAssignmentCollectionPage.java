// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

// **NOTE** This file was generated by a tool and any changes will be overwritten.
package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import com.microsoft.graph.requests.extensions.IManagedEBookAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Managed EBook Assignment Collection Page.
 */
public class BaseManagedEBookAssignmentCollectionPage extends BaseCollectionPage<ManagedEBookAssignment, IManagedEBookAssignmentCollectionRequestBuilder> implements IBaseManagedEBookAssignmentCollectionPage {

    /**
     * A collection page for ManagedEBookAssignment
     *
     * @param response the serialized BaseManagedEBookAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BaseManagedEBookAssignmentCollectionPage(final BaseManagedEBookAssignmentCollectionResponse response, final IManagedEBookAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}

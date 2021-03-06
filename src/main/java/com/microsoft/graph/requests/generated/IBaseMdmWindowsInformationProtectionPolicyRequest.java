// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;
import com.microsoft.graph.models.extensions.MdmWindowsInformationProtectionPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Mdm Windows Information Protection Policy Request.
 */
public interface IBaseMdmWindowsInformationProtectionPolicyRequest extends IHttpRequest {

    /**
     * Gets the MdmWindowsInformationProtectionPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MdmWindowsInformationProtectionPolicy> callback);

    /**
     * Gets the MdmWindowsInformationProtectionPolicy from the service
     *
     * @return the MdmWindowsInformationProtectionPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MdmWindowsInformationProtectionPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MdmWindowsInformationProtectionPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MdmWindowsInformationProtectionPolicy with a source
     *
     * @param sourceMdmWindowsInformationProtectionPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MdmWindowsInformationProtectionPolicy sourceMdmWindowsInformationProtectionPolicy, final ICallback<MdmWindowsInformationProtectionPolicy> callback);

    /**
     * Patches this MdmWindowsInformationProtectionPolicy with a source
     *
     * @param sourceMdmWindowsInformationProtectionPolicy the source object with updates
     * @return the updated MdmWindowsInformationProtectionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MdmWindowsInformationProtectionPolicy patch(final MdmWindowsInformationProtectionPolicy sourceMdmWindowsInformationProtectionPolicy) throws ClientException;

    /**
     * Posts a MdmWindowsInformationProtectionPolicy with a new object
     *
     * @param newMdmWindowsInformationProtectionPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MdmWindowsInformationProtectionPolicy newMdmWindowsInformationProtectionPolicy, final ICallback<MdmWindowsInformationProtectionPolicy> callback);

    /**
     * Posts a MdmWindowsInformationProtectionPolicy with a new object
     *
     * @param newMdmWindowsInformationProtectionPolicy the new object to create
     * @return the created MdmWindowsInformationProtectionPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MdmWindowsInformationProtectionPolicy post(final MdmWindowsInformationProtectionPolicy newMdmWindowsInformationProtectionPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseMdmWindowsInformationProtectionPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseMdmWindowsInformationProtectionPolicyRequest expand(final String value);

}


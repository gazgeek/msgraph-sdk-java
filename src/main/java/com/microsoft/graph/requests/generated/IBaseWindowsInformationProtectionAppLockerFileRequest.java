// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Windows Information Protection App Locker File Request.
 */
public interface IBaseWindowsInformationProtectionAppLockerFileRequest extends IHttpRequest {

    /**
     * Gets the WindowsInformationProtectionAppLockerFile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsInformationProtectionAppLockerFile> callback);

    /**
     * Gets the WindowsInformationProtectionAppLockerFile from the service
     *
     * @return the WindowsInformationProtectionAppLockerFile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsInformationProtectionAppLockerFile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsInformationProtectionAppLockerFile with a source
     *
     * @param sourceWindowsInformationProtectionAppLockerFile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsInformationProtectionAppLockerFile sourceWindowsInformationProtectionAppLockerFile, final ICallback<WindowsInformationProtectionAppLockerFile> callback);

    /**
     * Patches this WindowsInformationProtectionAppLockerFile with a source
     *
     * @param sourceWindowsInformationProtectionAppLockerFile the source object with updates
     * @return the updated WindowsInformationProtectionAppLockerFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsInformationProtectionAppLockerFile patch(final WindowsInformationProtectionAppLockerFile sourceWindowsInformationProtectionAppLockerFile) throws ClientException;

    /**
     * Posts a WindowsInformationProtectionAppLockerFile with a new object
     *
     * @param newWindowsInformationProtectionAppLockerFile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsInformationProtectionAppLockerFile newWindowsInformationProtectionAppLockerFile, final ICallback<WindowsInformationProtectionAppLockerFile> callback);

    /**
     * Posts a WindowsInformationProtectionAppLockerFile with a new object
     *
     * @param newWindowsInformationProtectionAppLockerFile the new object to create
     * @return the created WindowsInformationProtectionAppLockerFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsInformationProtectionAppLockerFile post(final WindowsInformationProtectionAppLockerFile newWindowsInformationProtectionAppLockerFile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IBaseWindowsInformationProtectionAppLockerFileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IBaseWindowsInformationProtectionAppLockerFileRequest expand(final String value);

}

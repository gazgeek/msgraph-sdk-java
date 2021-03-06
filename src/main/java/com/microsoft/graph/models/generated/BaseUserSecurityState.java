// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.EmailRole;
import com.microsoft.graph.models.generated.LogonType;
import com.microsoft.graph.models.generated.UserAccountSecurityType;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base User Security State.
 */
public class BaseUserSecurityState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Aad User Id.
     * 
     */
    @SerializedName("aadUserId")
    @Expose
    public String aadUserId;

    /**
     * The Account Name.
     * 
     */
    @SerializedName("accountName")
    @Expose
    public String accountName;

    /**
     * The Domain Name.
     * 
     */
    @SerializedName("domainName")
    @Expose
    public String domainName;

    /**
     * The Email Role.
     * 
     */
    @SerializedName("emailRole")
    @Expose
    public EmailRole emailRole;

    /**
     * The Is Vpn.
     * 
     */
    @SerializedName("isVpn")
    @Expose
    public Boolean isVpn;

    /**
     * The Logon Date Time.
     * 
     */
    @SerializedName("logonDateTime")
    @Expose
    public java.util.Calendar logonDateTime;

    /**
     * The Logon Id.
     * 
     */
    @SerializedName("logonId")
    @Expose
    public String logonId;

    /**
     * The Logon Ip.
     * 
     */
    @SerializedName("logonIp")
    @Expose
    public String logonIp;

    /**
     * The Logon Location.
     * 
     */
    @SerializedName("logonLocation")
    @Expose
    public String logonLocation;

    /**
     * The Logon Type.
     * 
     */
    @SerializedName("logonType")
    @Expose
    public LogonType logonType;

    /**
     * The On Premises Security Identifier.
     * 
     */
    @SerializedName("onPremisesSecurityIdentifier")
    @Expose
    public String onPremisesSecurityIdentifier;

    /**
     * The Risk Score.
     * 
     */
    @SerializedName("riskScore")
    @Expose
    public String riskScore;

    /**
     * The User Account Type.
     * 
     */
    @SerializedName("userAccountType")
    @Expose
    public UserAccountSecurityType userAccountType;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}

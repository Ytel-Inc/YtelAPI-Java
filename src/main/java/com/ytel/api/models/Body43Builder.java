/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body43Builder {
    //the instance to build
    private Body43 body43;

    /**
     * Default constructor to initialize the instance
     */
    public Body43Builder() {
        body43 = new Body43();
    }

    /**
     * A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
     */
    public Body43Builder from(String from) {
        body43.setFrom(from);
        return this;
    }

    /**
     * A required secondary Caller ID for RVM to work.
     */
    public Body43Builder rVMCallerId(String rVMCallerId) {
        body43.setRVMCallerId(rVMCallerId);
        return this;
    }

    /**
     * A valid number (E.164 format) that will receive the phone call.
     */
    public Body43Builder to(String to) {
        body43.setTo(to);
        return this;
    }

    /**
     * The URL requested once the RVM connects. A set of default parameters will be sent here.
     */
    public Body43Builder voiceMailURL(String voiceMailURL) {
        body43.setVoiceMailURL(voiceMailURL);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    public Body43Builder method(String method) {
        body43.setMethod(method);
        return this;
    }

    /**
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     */
    public Body43Builder statusCallBackUrl(String statusCallBackUrl) {
        body43.setStatusCallBackUrl(statusCallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required StatusCallBackUrl once call connects.
     */
    public Body43Builder statsCallBackMethod(String statsCallBackMethod) {
        body43.setStatsCallBackMethod(statsCallBackMethod);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body43 build() {
        return body43;
    }
}
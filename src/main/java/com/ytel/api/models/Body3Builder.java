/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body3Builder {
    //the instance to build
    private Body3 body3;

    /**
     * Default constructor to initialize the instance
     */
    public Body3Builder() {
        body3 = new Body3();
    }

    /**
     * The unique identifier for the sms resource
     */
    public Body3Builder messageSid(String messageSid) {
        body3.setMessageSid(messageSid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body3 build() {
        return body3;
    }
}
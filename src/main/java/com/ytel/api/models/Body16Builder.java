/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body16Builder {
    //the instance to build
    private Body16 body16;

    /**
     * Default constructor to initialize the instance
     */
    public Body16Builder() {
        body16 = new Body16();
    }

    /**
     * A valid Ytel 10-digit phone number (E.164 format).
     */
    public Body16Builder phoneNumber(String phoneNumber) {
        body16.setPhoneNumber(phoneNumber);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body16 build() {
        return body16;
    }
}
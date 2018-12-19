/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body8Builder {
    //the instance to build
    private Body8 body8;

    /**
     * Default constructor to initialize the instance
     */
    public Body8Builder() {
        body8 = new Body8();
    }

    /**
     * A valid Ytel comma separated numbers (E.164 format).
     */
    public Body8Builder phoneNumber(String phoneNumber) {
        body8.setPhoneNumber(phoneNumber);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body8 build() {
        return body8;
    }
}
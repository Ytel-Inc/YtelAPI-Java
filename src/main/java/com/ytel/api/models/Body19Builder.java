/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body19Builder {
    //the instance to build
    private Body19 body19;

    /**
     * Default constructor to initialize the instance
     */
    public Body19Builder() {
        body19 = new Body19();
    }

    /**
     * A valid email address that is to be added to the unsubscribe list
     */
    public Body19Builder email(String email) {
        body19.setEmail(email);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body19 build() {
        return body19;
    }
}
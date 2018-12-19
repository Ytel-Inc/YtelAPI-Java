/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body30Builder {
    //the instance to build
    private Body30 body30;

    /**
     * Default constructor to initialize the instance
     */
    public Body30Builder() {
        body30 = new Body30();
    }

    /**
     * The email address to be remove from the bounced email list.
     */
    public Body30Builder email(String email) {
        body30.setEmail(email);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body30 build() {
        return body30;
    }
}
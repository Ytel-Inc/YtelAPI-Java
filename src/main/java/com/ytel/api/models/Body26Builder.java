/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body26Builder {
    //the instance to build
    private Body26 body26;

    /**
     * Default constructor to initialize the instance
     */
    public Body26Builder() {
        body26 = new Body26();
    }

    /**
     * The starting point of the list of unsubscribed emails that should be returned.
     */
    public Body26Builder offset(String offset) {
        body26.setOffset(offset);
        return this;
    }

    /**
     * The count of results that should be returned.
     */
    public Body26Builder limit(String limit) {
        body26.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body26 build() {
        return body26;
    }
}
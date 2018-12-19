/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body33Builder {
    //the instance to build
    private Body33 body33;

    /**
     * Default constructor to initialize the instance
     */
    public Body33Builder() {
        body33 = new Body33();
    }

    /**
     * The starting point of the list of blocked emails that should be returned.
     */
    public Body33Builder offset(String offset) {
        body33.setOffset(offset);
        return this;
    }

    /**
     * The count of results that should be returned.
     */
    public Body33Builder limit(String limit) {
        body33.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body33 build() {
        return body33;
    }
}
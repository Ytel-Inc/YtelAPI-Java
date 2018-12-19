/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body39Builder {
    //the instance to build
    private Body39 body39;

    /**
     * Default constructor to initialize the instance
     */
    public Body39Builder() {
        body39 = new Body39();
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public Body39Builder page(Integer page) {
        body39.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public Body39Builder pagesize(Integer pagesize) {
        body39.setPagesize(pagesize);
        return this;
    }

    /**
     * From Number to Inbound ShortCode
     */
    public Body39Builder from(String from) {
        body39.setFrom(from);
        return this;
    }

    /**
     * Only list messages sent to this Short Code
     */
    public Body39Builder shortcode(String shortcode) {
        body39.setShortcode(shortcode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body39 build() {
        return body39;
    }
}
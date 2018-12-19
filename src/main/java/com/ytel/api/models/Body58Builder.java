/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body58Builder {
    //the instance to build
    private Body58 body58;

    /**
     * Default constructor to initialize the instance
     */
    public Body58Builder() {
        body58 = new Body58();
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public Body58Builder page(Integer page) {
        body58.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public Body58Builder pagesize(Integer pagesize) {
        body58.setPagesize(pagesize);
        return this;
    }

    /**
     * Only list SMS messages sent from this number
     */
    public Body58Builder from(String from) {
        body58.setFrom(from);
        return this;
    }

    /**
     * Only list SMS messages sent to Shortcode
     */
    public Body58Builder shortcode(String shortcode) {
        body58.setShortcode(shortcode);
        return this;
    }

    /**
     * Only list SMS messages sent in the specified date MAKE REQUEST
     */
    public Body58Builder datecreated(String datecreated) {
        body58.setDatecreated(datecreated);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body58 build() {
        return body58;
    }
}
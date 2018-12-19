/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body41Builder {
    //the instance to build
    private Body41 body41;

    /**
     * Default constructor to initialize the instance
     */
    public Body41Builder() {
        body41 = new Body41();
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public Body41Builder page(Integer page) {
        body41.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public Body41Builder pageSize(Integer pageSize) {
        body41.setPageSize(pageSize);
        return this;
    }

    /**
     * Filter SMS message objects from this valid 10-digit phone number (E.164 format).
     */
    public Body41Builder from(String from) {
        body41.setFrom(from);
        return this;
    }

    /**
     * Filter SMS message objects to this valid 10-digit phone number (E.164 format).
     */
    public Body41Builder to(String to) {
        body41.setTo(to);
        return this;
    }

    /**
     * Only list SMS messages sent in the specified date range
     */
    public Body41Builder dateSent(String dateSent) {
        body41.setDateSent(dateSent);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body41 build() {
        return body41;
    }
}
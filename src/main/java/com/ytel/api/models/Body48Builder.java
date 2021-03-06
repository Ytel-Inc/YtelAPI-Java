/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body48Builder {
    //the instance to build
    private Body48 body48;

    /**
     * Default constructor to initialize the instance
     */
    public Body48Builder() {
        body48 = new Body48();
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public Body48Builder page(Integer page) {
        body48.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public Body48Builder pagesize(Integer pagesize) {
        body48.setPagesize(pagesize);
        return this;
    }

    /**
     * Filter results by creation date
     */
    public Body48Builder datecreated(String datecreated) {
        body48.setDatecreated(datecreated);
        return this;
    }

    /**
     * The unique identifier for a call.
     */
    public Body48Builder callsid(String callsid) {
        body48.setCallsid(callsid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body48 build() {
        return body48;
    }
}
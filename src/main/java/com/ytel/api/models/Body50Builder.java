/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body50Builder {
    //the instance to build
    private Body50 body50;

    /**
     * Default constructor to initialize the instance
     */
    public Body50Builder() {
        body50 = new Body50();
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public Body50Builder page(Integer page) {
        body50.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public Body50Builder pagesize(Integer pagesize) {
        body50.setPagesize(pagesize);
        return this;
    }

    /**
     * The state of the transcription.
     */
    public Body50Builder status(StatusEnum status) {
        body50.setStatus(status);
        return this;
    }

    /**
     * The date the transcription took place.
     */
    public Body50Builder dateTranscribed(String dateTranscribed) {
        body50.setDateTranscribed(dateTranscribed);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body50 build() {
        return body50;
    }
}
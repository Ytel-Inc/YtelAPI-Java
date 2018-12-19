/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body53Builder {
    //the instance to build
    private Body53 body53;

    /**
     * Default constructor to initialize the instance
     */
    public Body53Builder() {
        body53 = new Body53();
    }

    /**
     * The type (category) of template Valid values: marketing, authorization
     */
    public Body53Builder type(String type) {
        body53.setType(type);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public Body53Builder page(Integer page) {
        body53.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public Body53Builder pagesize(Integer pagesize) {
        body53.setPagesize(pagesize);
        return this;
    }

    /**
     * Only list templates of type
     */
    public Body53Builder shortcode(String shortcode) {
        body53.setShortcode(shortcode);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body53 build() {
        return body53;
    }
}
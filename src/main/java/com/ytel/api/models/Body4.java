/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body4 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2984544862962541934L;
    private Integer page;
    private Integer pageSize;
    /** GETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonGetter("Page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    @JsonSetter("Page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
    /** GETTER
     * The count of objects to return per page.
     */
    @JsonGetter("PageSize")
    public Integer getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * The count of objects to return per page.
     */
    @JsonSetter("PageSize")
    public void setPageSize (Integer value) { 
        this.pageSize = value;
    }
 
}

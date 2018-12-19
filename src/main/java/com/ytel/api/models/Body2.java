/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body2 
        implements java.io.Serializable {
    private static final long serialVersionUID = 116015406530581116L;
    private UUID templateId;
    /** GETTER
     * The unique identifier for a template object
     */
    @JsonGetter("TemplateId")
    public UUID getTemplateId ( ) { 
        return this.templateId;
    }
    
    /** SETTER
     * The unique identifier for a template object
     */
    @JsonSetter("TemplateId")
    public void setTemplateId (UUID value) { 
        this.templateId = value;
    }
 
}

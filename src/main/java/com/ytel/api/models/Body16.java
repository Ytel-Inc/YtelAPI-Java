/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body16 
        implements java.io.Serializable {
    private static final long serialVersionUID = 65617180289150363L;
    private String phoneNumber;
    /** GETTER
     * A valid Ytel 10-digit phone number (E.164 format).
     */
    @JsonGetter("PhoneNumber")
    public String getPhoneNumber ( ) { 
        return this.phoneNumber;
    }
    
    /** SETTER
     * A valid Ytel 10-digit phone number (E.164 format).
     */
    @JsonSetter("PhoneNumber")
    public void setPhoneNumber (String value) { 
        this.phoneNumber = value;
    }
 
}
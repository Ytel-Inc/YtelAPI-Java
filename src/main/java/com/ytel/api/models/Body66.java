/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body66 
        implements java.io.Serializable {
    private static final long serialVersionUID = 2902113006806070096L;
    private String phonenumber;
    private String fromaccountsid;
    private String toaccountsid;
    /** GETTER
     * A valid 10-digit Ytel number (E.164 format).
     */
    @JsonGetter("phonenumber")
    public String getPhonenumber ( ) { 
        return this.phonenumber;
    }
    
    /** SETTER
     * A valid 10-digit Ytel number (E.164 format).
     */
    @JsonSetter("phonenumber")
    public void setPhonenumber (String value) { 
        this.phonenumber = value;
    }
 
    /** GETTER
     * A specific Accountsid from where Number is getting transfer.
     */
    @JsonGetter("fromaccountsid")
    public String getFromaccountsid ( ) { 
        return this.fromaccountsid;
    }
    
    /** SETTER
     * A specific Accountsid from where Number is getting transfer.
     */
    @JsonSetter("fromaccountsid")
    public void setFromaccountsid (String value) { 
        this.fromaccountsid = value;
    }
 
    /** GETTER
     * A specific Accountsid to which Number is getting transfer.
     */
    @JsonGetter("toaccountsid")
    public String getToaccountsid ( ) { 
        return this.toaccountsid;
    }
    
    /** SETTER
     * A specific Accountsid to which Number is getting transfer.
     */
    @JsonSetter("toaccountsid")
    public void setToaccountsid (String value) { 
        this.toaccountsid = value;
    }
 
}
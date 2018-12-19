/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body7 
        implements java.io.Serializable {
    private static final long serialVersionUID = 1151469533513800696L;
    private String conferenceSid;
    private String participantSid;
    /** GETTER
     * The unique identifier for a conference object.
     */
    @JsonGetter("ConferenceSid")
    public String getConferenceSid ( ) { 
        return this.conferenceSid;
    }
    
    /** SETTER
     * The unique identifier for a conference object.
     */
    @JsonSetter("ConferenceSid")
    public void setConferenceSid (String value) { 
        this.conferenceSid = value;
    }
 
    /** GETTER
     * The unique identifier for a participant object.
     */
    @JsonGetter("ParticipantSid")
    public String getParticipantSid ( ) { 
        return this.participantSid;
    }
    
    /** SETTER
     * The unique identifier for a participant object.
     */
    @JsonSetter("ParticipantSid")
    public void setParticipantSid (String value) { 
        this.participantSid = value;
    }
 
}

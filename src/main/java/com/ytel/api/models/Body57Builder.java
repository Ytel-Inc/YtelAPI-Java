/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body57Builder {
    //the instance to build
    private Body57 body57;

    /**
     * Default constructor to initialize the instance
     */
    public Body57Builder() {
        body57 = new Body57();
    }

    /**
     * The unique identifier for a conference object.
     */
    public Body57Builder conferenceSid(String conferenceSid) {
        body57.setConferenceSid(conferenceSid);
        return this;
    }

    /**
     * The unique identifier for a participant object.
     */
    public Body57Builder participantSid(String participantSid) {
        body57.setParticipantSid(participantSid);
        return this;
    }

    /**
     * The URL for the audio file that is to be played during the conference. Multiple audio files can be chained by using a semicolon.
     */
    public Body57Builder audioUrl(AudioUrlEnum audioUrl) {
        body57.setAudioUrl(audioUrl);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body57 build() {
        return body57;
    }
}
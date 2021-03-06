/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body22Builder {
    //the instance to build
    private Body22 body22;

    /**
     * Default constructor to initialize the instance
     */
    public Body22Builder() {
        body22 = new Body22();
    }

    /**
     * The unique identifier of each call resource
     */
    public Body22Builder callSid(String callSid) {
        body22.setCallSid(callSid);
        return this;
    }

    /**
     * URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
     */
    public Body22Builder audioUrl(String audioUrl) {
        body22.setAudioUrl(audioUrl);
        return this;
    }

    /**
     * Valid alphanumeric string that should be played to the In-progress call.
     */
    public Body22Builder sayText(String sayText) {
        body22.setSayText(sayText);
        return this;
    }

    /**
     * Time limit in seconds for audio play back
     */
    public Body22Builder length(Integer length) {
        body22.setLength(length);
        return this;
    }

    /**
     * The leg of the call audio will be played to
     */
    public Body22Builder direction(Direction1Enum direction) {
        body22.setDirection(direction);
        return this;
    }

    /**
     * If false, all other audio will be muted
     */
    public Body22Builder mix(Boolean mix) {
        body22.setMix(mix);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body22 build() {
        return body22;
    }
}
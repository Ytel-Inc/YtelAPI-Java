/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class BodyBuilder {
    //the instance to build
    private Body body;

    /**
     * Default constructor to initialize the instance
     */
    public BodyBuilder() {
        body = new Body();
    }

    /**
     * A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
     */
    public BodyBuilder from(String from) {
        body.setFrom(from);
        return this;
    }

    /**
     * To number
     */
    public BodyBuilder to(String to) {
        body.setTo(to);
        return this;
    }

    /**
     * URL requested once the call connects
     */
    public BodyBuilder url(String url) {
        body.setUrl(url);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    public BodyBuilder method(String method) {
        body.setMethod(method);
        return this;
    }

    /**
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     */
    public BodyBuilder statusCallBackUrl(String statusCallBackUrl) {
        body.setStatusCallBackUrl(statusCallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    public BodyBuilder statusCallBackMethod(String statusCallBackMethod) {
        body.setStatusCallBackMethod(statusCallBackMethod);
        return this;
    }

    /**
     * URL requested if the initial Url parameter fails or encounters an error
     */
    public BodyBuilder fallBackUrl(String fallBackUrl) {
        body.setFallBackUrl(fallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    public BodyBuilder fallBackMethod(String fallBackMethod) {
        body.setFallBackMethod(fallBackMethod);
        return this;
    }

    /**
     * URL that can be requested every 60 seconds during the call to notify of elapsed tim
     */
    public BodyBuilder heartBeatUrl(String heartBeatUrl) {
        body.setHeartBeatUrl(heartBeatUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request HeartbeatUrl.
     */
    public BodyBuilder heartBeatMethod(String heartBeatMethod) {
        body.setHeartBeatMethod(heartBeatMethod);
        return this;
    }

    /**
     * Time (in seconds) Ytel should wait while the call is ringing before canceling the call
     */
    public BodyBuilder timeout(Integer timeout) {
        body.setTimeout(timeout);
        return this;
    }

    /**
     * DTMF Digits to play to the call once it connects. 0-9, #, or *
     */
    public BodyBuilder playDtmf(String playDtmf) {
        body.setPlayDtmf(playDtmf);
        return this;
    }

    /**
     * Specifies if the caller id will be hidden
     */
    public BodyBuilder hideCallerId(Boolean hideCallerId) {
        body.setHideCallerId(hideCallerId);
        return this;
    }

    /**
     * Specifies if the call should be recorded
     */
    public BodyBuilder record(Boolean record) {
        body.setRecord(record);
        return this;
    }

    /**
     * Recording parameters will be sent here upon completion
     */
    public BodyBuilder recordCallBackUrl(String recordCallBackUrl) {
        body.setRecordCallBackUrl(recordCallBackUrl);
        return this;
    }

    /**
     * Method used to request the RecordCallback URL.
     */
    public BodyBuilder recordCallBackMethod(String recordCallBackMethod) {
        body.setRecordCallBackMethod(recordCallBackMethod);
        return this;
    }

    /**
     * Specifies if the call recording should be transcribed
     */
    public BodyBuilder transcribe(Boolean transcribe) {
        body.setTranscribe(transcribe);
        return this;
    }

    /**
     * Transcription parameters will be sent here upon completion
     */
    public BodyBuilder transcribeCallBackUrl(String transcribeCallBackUrl) {
        body.setTranscribeCallBackUrl(transcribeCallBackUrl);
        return this;
    }

    /**
     * How Ytel should handle the receiving numbers voicemail machine
     */
    public BodyBuilder ifMachine(IfMachineEnum ifMachine) {
        body.setIfMachine(ifMachine);
        return this;
    }

    /**
     * URL requested when IfMachine=continue
     */
    public BodyBuilder ifMachineUrl(String ifMachineUrl) {
        body.setIfMachineUrl(ifMachineUrl);
        return this;
    }

    /**
     * Method used to request the IfMachineUrl.
     */
    public BodyBuilder ifMachineMethod(String ifMachineMethod) {
        body.setIfMachineMethod(ifMachineMethod);
        return this;
    }

    /**
     * Specify if survey should be enable or not
     */
    public BodyBuilder feedback(Boolean feedback) {
        body.setFeedback(feedback);
        return this;
    }

    /**
     * The unique identifier for the survey.
     */
    public BodyBuilder surveyId(String surveyId) {
        body.setSurveyId(surveyId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body build() {
        return body;
    }
}
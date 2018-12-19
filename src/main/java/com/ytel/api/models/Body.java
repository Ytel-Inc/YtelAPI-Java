/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body 
        implements java.io.Serializable {
    private static final long serialVersionUID = -283981948678169611L;
    private String from;
    private String to;
    private String url;
    private String method;
    private String statusCallBackUrl;
    private String statusCallBackMethod;
    private String fallBackUrl;
    private String fallBackMethod;
    private String heartBeatUrl;
    private String heartBeatMethod;
    private Integer timeout;
    private String playDtmf;
    private Boolean hideCallerId;
    private Boolean record;
    private String recordCallBackUrl;
    private String recordCallBackMethod;
    private Boolean transcribe;
    private String transcribeCallBackUrl;
    private IfMachineEnum ifMachine;
    private String ifMachineUrl;
    private String ifMachineMethod;
    private Boolean feedback;
    private String surveyId;
    /** GETTER
     * A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * A valid Ytel Voice enabled number (E.164 format) that will be initiating the phone call.
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * To number
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * To number
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * URL requested once the call connects
     */
    @JsonGetter("Url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * URL requested once the call connects
     */
    @JsonSetter("Url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    @JsonGetter("Method")
    public String getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    @JsonSetter("Method")
    public void setMethod (String value) { 
        this.method = value;
    }
 
    /** GETTER
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     */
    @JsonGetter("StatusCallBackUrl")
    public String getStatusCallBackUrl ( ) { 
        return this.statusCallBackUrl;
    }
    
    /** SETTER
     * URL that can be requested to receive notification when call has ended. A set of default parameters will be sent here once the call is finished.
     */
    @JsonSetter("StatusCallBackUrl")
    public void setStatusCallBackUrl (String value) { 
        this.statusCallBackUrl = value;
    }
 
    /** GETTER
     * Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    @JsonGetter("StatusCallBackMethod")
    public String getStatusCallBackMethod ( ) { 
        return this.statusCallBackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    @JsonSetter("StatusCallBackMethod")
    public void setStatusCallBackMethod (String value) { 
        this.statusCallBackMethod = value;
    }
 
    /** GETTER
     * URL requested if the initial Url parameter fails or encounters an error
     */
    @JsonGetter("FallBackUrl")
    public String getFallBackUrl ( ) { 
        return this.fallBackUrl;
    }
    
    /** SETTER
     * URL requested if the initial Url parameter fails or encounters an error
     */
    @JsonSetter("FallBackUrl")
    public void setFallBackUrl (String value) { 
        this.fallBackUrl = value;
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    @JsonGetter("FallBackMethod")
    public String getFallBackMethod ( ) { 
        return this.fallBackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    @JsonSetter("FallBackMethod")
    public void setFallBackMethod (String value) { 
        this.fallBackMethod = value;
    }
 
    /** GETTER
     * URL that can be requested every 60 seconds during the call to notify of elapsed tim
     */
    @JsonGetter("HeartBeatUrl")
    public String getHeartBeatUrl ( ) { 
        return this.heartBeatUrl;
    }
    
    /** SETTER
     * URL that can be requested every 60 seconds during the call to notify of elapsed tim
     */
    @JsonSetter("HeartBeatUrl")
    public void setHeartBeatUrl (String value) { 
        this.heartBeatUrl = value;
    }
 
    /** GETTER
     * Specifies the HTTP method used to request HeartbeatUrl.
     */
    @JsonGetter("HeartBeatMethod")
    public String getHeartBeatMethod ( ) { 
        return this.heartBeatMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request HeartbeatUrl.
     */
    @JsonSetter("HeartBeatMethod")
    public void setHeartBeatMethod (String value) { 
        this.heartBeatMethod = value;
    }
 
    /** GETTER
     * Time (in seconds) Ytel should wait while the call is ringing before canceling the call
     */
    @JsonGetter("Timeout")
    public Integer getTimeout ( ) { 
        return this.timeout;
    }
    
    /** SETTER
     * Time (in seconds) Ytel should wait while the call is ringing before canceling the call
     */
    @JsonSetter("Timeout")
    public void setTimeout (Integer value) { 
        this.timeout = value;
    }
 
    /** GETTER
     * DTMF Digits to play to the call once it connects. 0-9, #, or *
     */
    @JsonGetter("PlayDtmf")
    public String getPlayDtmf ( ) { 
        return this.playDtmf;
    }
    
    /** SETTER
     * DTMF Digits to play to the call once it connects. 0-9, #, or *
     */
    @JsonSetter("PlayDtmf")
    public void setPlayDtmf (String value) { 
        this.playDtmf = value;
    }
 
    /** GETTER
     * Specifies if the caller id will be hidden
     */
    @JsonGetter("HideCallerId")
    public Boolean getHideCallerId ( ) { 
        return this.hideCallerId;
    }
    
    /** SETTER
     * Specifies if the caller id will be hidden
     */
    @JsonSetter("HideCallerId")
    public void setHideCallerId (Boolean value) { 
        this.hideCallerId = value;
    }
 
    /** GETTER
     * Specifies if the call should be recorded
     */
    @JsonGetter("Record")
    public Boolean getRecord ( ) { 
        return this.record;
    }
    
    /** SETTER
     * Specifies if the call should be recorded
     */
    @JsonSetter("Record")
    public void setRecord (Boolean value) { 
        this.record = value;
    }
 
    /** GETTER
     * Recording parameters will be sent here upon completion
     */
    @JsonGetter("RecordCallBackUrl")
    public String getRecordCallBackUrl ( ) { 
        return this.recordCallBackUrl;
    }
    
    /** SETTER
     * Recording parameters will be sent here upon completion
     */
    @JsonSetter("RecordCallBackUrl")
    public void setRecordCallBackUrl (String value) { 
        this.recordCallBackUrl = value;
    }
 
    /** GETTER
     * Method used to request the RecordCallback URL.
     */
    @JsonGetter("RecordCallBackMethod")
    public String getRecordCallBackMethod ( ) { 
        return this.recordCallBackMethod;
    }
    
    /** SETTER
     * Method used to request the RecordCallback URL.
     */
    @JsonSetter("RecordCallBackMethod")
    public void setRecordCallBackMethod (String value) { 
        this.recordCallBackMethod = value;
    }
 
    /** GETTER
     * Specifies if the call recording should be transcribed
     */
    @JsonGetter("Transcribe")
    public Boolean getTranscribe ( ) { 
        return this.transcribe;
    }
    
    /** SETTER
     * Specifies if the call recording should be transcribed
     */
    @JsonSetter("Transcribe")
    public void setTranscribe (Boolean value) { 
        this.transcribe = value;
    }
 
    /** GETTER
     * Transcription parameters will be sent here upon completion
     */
    @JsonGetter("TranscribeCallBackUrl")
    public String getTranscribeCallBackUrl ( ) { 
        return this.transcribeCallBackUrl;
    }
    
    /** SETTER
     * Transcription parameters will be sent here upon completion
     */
    @JsonSetter("TranscribeCallBackUrl")
    public void setTranscribeCallBackUrl (String value) { 
        this.transcribeCallBackUrl = value;
    }
 
    /** GETTER
     * How Ytel should handle the receiving numbers voicemail machine
     */
    @JsonGetter("IfMachine")
    public IfMachineEnum getIfMachine ( ) { 
        return this.ifMachine;
    }
    
    /** SETTER
     * How Ytel should handle the receiving numbers voicemail machine
     */
    @JsonSetter("IfMachine")
    public void setIfMachine (IfMachineEnum value) { 
        this.ifMachine = value;
    }
 
    /** GETTER
     * URL requested when IfMachine=continue
     */
    @JsonGetter("IfMachineUrl")
    public String getIfMachineUrl ( ) { 
        return this.ifMachineUrl;
    }
    
    /** SETTER
     * URL requested when IfMachine=continue
     */
    @JsonSetter("IfMachineUrl")
    public void setIfMachineUrl (String value) { 
        this.ifMachineUrl = value;
    }
 
    /** GETTER
     * Method used to request the IfMachineUrl.
     */
    @JsonGetter("IfMachineMethod")
    public String getIfMachineMethod ( ) { 
        return this.ifMachineMethod;
    }
    
    /** SETTER
     * Method used to request the IfMachineUrl.
     */
    @JsonSetter("IfMachineMethod")
    public void setIfMachineMethod (String value) { 
        this.ifMachineMethod = value;
    }
 
    /** GETTER
     * Specify if survey should be enable or not
     */
    @JsonGetter("Feedback")
    public Boolean getFeedback ( ) { 
        return this.feedback;
    }
    
    /** SETTER
     * Specify if survey should be enable or not
     */
    @JsonSetter("Feedback")
    public void setFeedback (Boolean value) { 
        this.feedback = value;
    }
 
    /** GETTER
     * The unique identifier for the survey.
     */
    @JsonGetter("SurveyId")
    public String getSurveyId ( ) { 
        return this.surveyId;
    }
    
    /** SETTER
     * The unique identifier for the survey.
     */
    @JsonSetter("SurveyId")
    public void setSurveyId (String value) { 
        this.surveyId = value;
    }
 
}
/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Body77 
        implements java.io.Serializable {
    private static final long serialVersionUID = -4799813506993757208L;
    private String from;
    private String to;
    private String url;
    private String groupConfirmKey;
    private GroupConfirmFileEnum groupConfirmFile;
    private String method;
    private String statusCallBackUrl;
    private String statusCallBackMethod;
    private String fallBackUrl;
    private String fallBackMethod;
    private String heartBeatUrl;
    private String heartBeatMethod;
    private Integer timeout;
    private String playDtmf;
    private String hideCallerId;
    private Boolean record;
    private String recordCallBackUrl;
    private String recordCallBackMethod;
    private Boolean transcribe;
    private String transcribeCallBackUrl;
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
     * Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : +12223334444,+15556667777
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * Please enter multiple E164 number. You can add max 10 numbers. Add numbers separated with comma. e.g : +12223334444,+15556667777
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
     * Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
     */
    @JsonGetter("GroupConfirmKey")
    public String getGroupConfirmKey ( ) { 
        return this.groupConfirmKey;
    }
    
    /** SETTER
     * Define the DTMF that the called party should send to bridge the call. Allowed Values : 0-9, #, *
     */
    @JsonSetter("GroupConfirmKey")
    public void setGroupConfirmKey (String value) { 
        this.groupConfirmKey = value;
    }
 
    /** GETTER
     * Specify the audio file you want to play when the called party picks up the call
     */
    @JsonGetter("GroupConfirmFile")
    public GroupConfirmFileEnum getGroupConfirmFile ( ) { 
        return this.groupConfirmFile;
    }
    
    /** SETTER
     * Specify the audio file you want to play when the called party picks up the call
     */
    @JsonSetter("GroupConfirmFile")
    public void setGroupConfirmFile (GroupConfirmFileEnum value) { 
        this.groupConfirmFile = value;
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
     * URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information.
     */
    @JsonGetter("HeartBeatUrl")
    public String getHeartBeatUrl ( ) { 
        return this.heartBeatUrl;
    }
    
    /** SETTER
     * URL that can be requested every 60 seconds during the call to notify of elapsed time and pass other general information.
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
     * Time (in seconds) we should wait while the call is ringing before canceling the call
     */
    @JsonGetter("Timeout")
    public Integer getTimeout ( ) { 
        return this.timeout;
    }
    
    /** SETTER
     * Time (in seconds) we should wait while the call is ringing before canceling the call
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
    public String getHideCallerId ( ) { 
        return this.hideCallerId;
    }
    
    /** SETTER
     * Specifies if the caller id will be hidden
     */
    @JsonSetter("HideCallerId")
    public void setHideCallerId (String value) { 
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
 
}

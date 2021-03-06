/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.*;

public class Body35Builder {
    //the instance to build
    private Body35 body35;

    /**
     * Default constructor to initialize the instance
     */
    public Body35Builder() {
        body35 = new Body35();
    }

    /**
     * The SubaccountSid to be activated or suspended
     */
    public Body35Builder subAccountSID(String subAccountSID) {
        body35.setSubAccountSID(subAccountSID);
        return this;
    }

    /**
     * 0 to suspend or 1 to activate
     */
    public Body35Builder activate(ActivateEnum activate) {
        body35.setActivate(activate);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Body35 build() {
        return body35;
    }
}
/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.controllers;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ytel.api.models.*;
import com.ytel.api.exceptions.*;
import com.ytel.api.APIHelper;
import com.ytel.api.Configuration;
import com.ytel.api.testing.TestHelper;
import com.ytel.api.controllers.CarrierController;

import com.fasterxml.jackson.core.type.TypeReference;

public class CarrierControllerTest extends ControllerTestBase {
    
    /**
     * Controller instance (for all tests)
     */
    private static CarrierController controller;
    
    /**
     * Setup test class
     */
    @BeforeClass
    public static void setUpClass() {
        controller = getClient().getCarrier();
    }

    /**
     * Tear down test class
     * @throws IOException
     */
    @AfterClass
    public static void tearDownClass() throws IOException {
        controller = null;
    }

    /**
     * Retrieve a list of carrier lookup objects.
     * @throws Throwable
     */
    @Test
    public void testTestCarrierResults() throws Throwable {
        // Parameters for the API call
        Integer page = null;
        Integer pageSize = null;

        // Set callback and perform API call
        String result = null;
        controller.setHttpCallBack(httpResponse);
        try {
            result = controller.createCarrierResults(page, pageSize);
        } catch(APIException e) {};

       // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders(), true));

    }

}

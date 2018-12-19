/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum ActivateEnum {
    ENUM_1, //TODO: Write general description for this element
    ENUM_0; //TODO: Write general description for this element

    private static TreeMap<Integer, ActivateEnum> valueMap = new TreeMap<Integer, ActivateEnum>();
    private Integer value;

    static {
        ENUM_1.value = 1;
        ENUM_0.value = 0;

        valueMap.put(1, ENUM_1);
        valueMap.put(0, ENUM_0);
    }

    /**
     * Returns the enum member associated with the given integer value
     * @return The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ActivateEnum fromInteger(Integer toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the integer value associated with the enum member
     * @return The integer value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public Integer value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of ActivateEnum values to list of integer values
     * @param toConvert The list of ActivateEnum values to convert
     * @return List of representative integer values */
    public static List<Integer> toValue(List<ActivateEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<Integer> convertedValues = new ArrayList<Integer>();
        for (ActivateEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
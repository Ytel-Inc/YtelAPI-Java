/*
 * YtelAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum ProductCodeEnum {
    ENUM_0, //TODO: Write general description for this element
    ENUM_1, //TODO: Write general description for this element
    ENUM_2, //TODO: Write general description for this element
    ENUM_3, //TODO: Write general description for this element
    ENUM_4, //TODO: Write general description for this element
    ENUM_5, //TODO: Write general description for this element
    ENUM_6, //TODO: Write general description for this element
    ENUM_7, //TODO: Write general description for this element
    ENUM_8, //TODO: Write general description for this element
    ENUM_9, //TODO: Write general description for this element
    ENUM_10, //TODO: Write general description for this element
    ENUM_11, //TODO: Write general description for this element
    ENUM_12, //TODO: Write general description for this element
    ENUM_13; //TODO: Write general description for this element

    private static TreeMap<Integer, ProductCodeEnum> valueMap = new TreeMap<Integer, ProductCodeEnum>();
    private Integer value;

    static {
        ENUM_0.value = 0;
        ENUM_1.value = 1;
        ENUM_2.value = 2;
        ENUM_3.value = 3;
        ENUM_4.value = 4;
        ENUM_5.value = 5;
        ENUM_6.value = 6;
        ENUM_7.value = 7;
        ENUM_8.value = 8;
        ENUM_9.value = 9;
        ENUM_10.value = 10;
        ENUM_11.value = 11;
        ENUM_12.value = 12;
        ENUM_13.value = 13;

        valueMap.put(0, ENUM_0);
        valueMap.put(1, ENUM_1);
        valueMap.put(2, ENUM_2);
        valueMap.put(3, ENUM_3);
        valueMap.put(4, ENUM_4);
        valueMap.put(5, ENUM_5);
        valueMap.put(6, ENUM_6);
        valueMap.put(7, ENUM_7);
        valueMap.put(8, ENUM_8);
        valueMap.put(9, ENUM_9);
        valueMap.put(10, ENUM_10);
        valueMap.put(11, ENUM_11);
        valueMap.put(12, ENUM_12);
        valueMap.put(13, ENUM_13);
    }

    /**
     * Returns the enum member associated with the given integer value
     * @return The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ProductCodeEnum fromInteger(Integer toConvert) {
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
     * Convert list of ProductCodeEnum values to list of integer values
     * @param toConvert The list of ProductCodeEnum values to convert
     * @return List of representative integer values */
    public static List<Integer> toValue(List<ProductCodeEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<Integer> convertedValues = new ArrayList<Integer>();
        for (ProductCodeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 
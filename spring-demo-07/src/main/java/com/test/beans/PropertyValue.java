package com.test.beans;

/**
 * bean属性
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value){
        this.name = name;
        this.value = value;
    }

    public String getName(){return this.name;}

    public Object getValue() {
        return value;
    }
}

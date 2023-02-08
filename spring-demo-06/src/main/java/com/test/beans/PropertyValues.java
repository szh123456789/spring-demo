package com.test.beans;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues {

    private final List<PropertyValue> propertyValueArrayList = new ArrayList<>();

    public void  addPropertyValues(PropertyValue pv){
        this.propertyValueArrayList.add(pv);
    }

    public PropertyValue[] getPropertyValues(){
        return this.propertyValueArrayList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName){
        for (PropertyValue propertyValue : propertyValueArrayList){
            if (propertyValue.getName().equals(propertyName)){
                return propertyValue;
            }
        }
        return null;
    }
}

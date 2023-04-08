package com.fkp.spring.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MutablePropertyValues implements Iterable<PropertyValue>{

    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        this.propertyValueList = propertyValueList == null ? new ArrayList<>() : propertyValueList;
    }

    public PropertyValue[] getPropertyValues(){
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName){
        for (PropertyValue propertyValue : propertyValueList) {
            if(propertyValue.getName().equals(propertyName)){
                return propertyValue;
            }
        }
        return null;
    }

    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }

    public boolean isEmpty(){
        return propertyValueList.isEmpty();
    }

    public MutablePropertyValues addPropertyValue(PropertyValue propertyValue){
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue currProperty = propertyValueList.get(i);
            if(currProperty.getName().equals(propertyValue.getName())){
                propertyValueList.set(i, propertyValue);
                return this;
            }
        }
        propertyValueList.add(propertyValue);
        return this;
    }

    public boolean contains(String propertyName){
        return getPropertyValue(propertyName) != null;
    }
}

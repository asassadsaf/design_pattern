package com.fkp.spring.framework.beans.factory.support;

import com.fkp.spring.framework.beans.MutablePropertyValues;
import lombok.Data;

@Data
public class BeanDefinition {
    private String id;
    private String className;

    private MutablePropertyValues mutablePropertyValues;

    public BeanDefinition() {
        this.mutablePropertyValues = new MutablePropertyValues();
    }


}

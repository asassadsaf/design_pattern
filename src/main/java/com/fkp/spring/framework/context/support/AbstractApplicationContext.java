package com.fkp.spring.framework.context.support;

import com.fkp.spring.framework.beans.factory.support.BeanDefinition;
import com.fkp.spring.framework.beans.factory.support.BeanDefinitionReader;
import com.fkp.spring.framework.beans.factory.support.BeanDefinitionRegistry;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractApplicationContext implements ApplicationContext{

    protected BeanDefinitionReader beanDefinitionReader;
    protected Map<String, Object> singletonObjects = new HashMap<>();
    protected String configLocation;

    public void refresh() throws Exception {
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        finishBeanInitialization();
    }

    protected void finishBeanInitialization() throws Exception {
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = getBean(beanDefinitionName);
            singletonObjects.put(beanDefinitionName, bean);
        }
    }
}

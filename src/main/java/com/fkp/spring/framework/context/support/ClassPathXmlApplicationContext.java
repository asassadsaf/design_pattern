package com.fkp.spring.framework.context.support;

import com.fkp.spring.framework.beans.MutablePropertyValues;
import com.fkp.spring.framework.beans.PropertyValue;
import com.fkp.spring.framework.beans.factory.support.BeanDefinition;
import com.fkp.spring.framework.beans.factory.support.BeanDefinitionRegistry;
import com.fkp.spring.framework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;

public class ClassPathXmlApplicationContext extends AbstractApplicationContext{

    public ClassPathXmlApplicationContext(String configLocation) {
        super.beanDefinitionReader = new XmlBeanDefinitionReader();
        super.configLocation = configLocation;
        try {
            super.refresh();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String name) throws Exception {
        Object object = singletonObjects.get(name);
        if(object != null){
            return object;
        }
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(name);
        String id = beanDefinition.getId();
        String className = beanDefinition.getClassName();
        MutablePropertyValues mutablePropertyValues = beanDefinition.getMutablePropertyValues();
        Class<?> clazz = Class.forName(className);
        Object bean = clazz.newInstance();
        for (PropertyValue mutablePropertyValue : mutablePropertyValues) {
            String propertyValueName = mutablePropertyValue.getName();
            String ref = mutablePropertyValue.getRef();
            String value = mutablePropertyValue.getValue();
            String setterMethodNameByFieldName = com.fkp.spring.framework.context.util.StringUtils.getSetterMethodNameByFieldName(propertyValueName);
            if(StringUtils.hasText(ref)){
                Object refObject = getBean(ref);
                for (Method method : clazz.getMethods()) {
                    if (method.getName().equals(setterMethodNameByFieldName)) {
                        method.invoke(bean, refObject);
                        break;
                    }
                }
            }
            if(StringUtils.hasText(value)){
                Method method = clazz.getMethod(setterMethodNameByFieldName, String.class);
                method.invoke(bean, value);
            }
        }
        singletonObjects.put(id, bean);
        return bean;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if(bean != null){
            return clazz.cast(bean);
        }
        return null;
    }
}

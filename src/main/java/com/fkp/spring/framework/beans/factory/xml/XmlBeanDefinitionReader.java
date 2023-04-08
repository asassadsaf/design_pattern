package com.fkp.spring.framework.beans.factory.xml;

import com.fkp.spring.framework.beans.MutablePropertyValues;
import com.fkp.spring.framework.beans.PropertyValue;
import com.fkp.spring.framework.beans.factory.support.BeanDefinition;
import com.fkp.spring.framework.beans.factory.support.BeanDefinitionReader;
import com.fkp.spring.framework.beans.factory.support.BeanDefinitionRegistry;
import com.fkp.spring.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class XmlBeanDefinitionReader implements BeanDefinitionReader {

    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader() {
        this.registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return this.registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read(XmlBeanDefinitionReader.class.getClassLoader().getResourceAsStream(configLocation));
        Element rootElement = document.getRootElement();
        parseBean(rootElement);
    }

    private void parseBean(Element rootElement) {
        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            String id = element.attributeValue("id");
            String className = element.attributeValue("class");
            BeanDefinition beanDefinition = new BeanDefinition();
            beanDefinition.setId(id);
            beanDefinition.setClassName(className);
            List<Element> list = element.elements("property");
            MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
            for (Element element1 : list) {
                String name = element1.attributeValue("name");
                String ref = element1.attributeValue("ref");
                String value = element1.attributeValue("value");
                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                mutablePropertyValues.addPropertyValue(propertyValue);
            }
            beanDefinition.setMutablePropertyValues(mutablePropertyValues);
            registry.registerBeanDefinition(id, beanDefinition);

        }
    }
}

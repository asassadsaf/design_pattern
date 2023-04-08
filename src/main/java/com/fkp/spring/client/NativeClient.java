package com.fkp.spring.client;

import com.fkp.spring.demo.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;

import java.util.Objects;

/**
 * 原生spring创建Ioc容器并实现依赖注入
 */
public class NativeClient {
    public static void main(String[] args) {
//        //ApplicationContext实现立即创建bean并加入ioc容器
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = context.getBean("userService", UserService.class);
//        userService.func();

        //beanFactory实现延迟加载，等获取Bean时才创建该类的对象
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
        UserService userService = defaultListableBeanFactory.getBean("userService", UserService.class);
        userService.func();
    }
}

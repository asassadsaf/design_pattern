package com.fkp.spring.client;

import com.fkp.spring.demo.service.UserService;
import com.fkp.spring.framework.context.support.ApplicationContext;
import com.fkp.spring.framework.context.support.ClassPathXmlApplicationContext;

/**
 * 自定义springIoc容器加载bean的过程
 */
public class CustomClient {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.func();
    }
}

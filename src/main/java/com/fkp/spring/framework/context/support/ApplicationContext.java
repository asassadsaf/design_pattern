package com.fkp.spring.framework.context.support;

public interface ApplicationContext extends BeanFactory{

    //进行配置文件加载并进行对象创建
    void refresh() throws IllegalStateException, Exception;

}

package com.fkp.pattern.creator_mode.prototype.test2;

import cn.hutool.core.util.ObjectUtil;
import org.springframework.beans.BeanUtils;

/**
 * 浅克隆：创建新的对象，对象中属性若为引用类型，则新对象中属性指向的内存地址还是原来对象对应属性指向的内存地址
 * 深克隆：创建新的对象，对象中属性若为引用数据类型，则新对象中属性指向的内存地址和原来对象属性指向的内存地址不同。
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1.深克隆实现
        DeepCloneCitation citation = new DeepCloneCitation();
        Stu stu = new Stu();
        stu.setName("张三");
        citation.setStu(stu);
        DeepCloneCitation citation1 = citation.clone();
        citation1.getStu().setName("李四");
        citation.show();
        citation1.show();
        System.out.println("具体原型对象中属性指向的内存地址和复制出来的对象中属性指向的内存地址是否是同一个：" + (citation.getStu() == citation1.getStu()));



    }
}

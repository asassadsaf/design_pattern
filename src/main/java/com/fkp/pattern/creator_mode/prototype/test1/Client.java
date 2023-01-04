package com.fkp.pattern.creator_mode.prototype.test1;

/**
 * 浅克隆：创建新的对象，对象中属性若为引用类型，则新对象中属性指向的内存地址还是原来对象对应属性指向的内存地址
 * 深克隆：创建新的对象，对象中属性若为引用数据类型，则新对象中属性指向的内存地址和原来对象属性指向的内存地址不同。
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation citation1 = citation.clone();
        citation.setName("张三");
        citation1.setName("张三");
        citation.show();
        citation1.show();
    }
}

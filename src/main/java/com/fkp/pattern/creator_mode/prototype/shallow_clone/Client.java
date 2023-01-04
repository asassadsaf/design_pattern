package com.fkp.pattern.creator_mode.prototype.shallow_clone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = realizeType.clone();
        System.out.println("具体原型对象和复制出来的对象是否是同一个对象：" + (realizeType == clone));
    }
}

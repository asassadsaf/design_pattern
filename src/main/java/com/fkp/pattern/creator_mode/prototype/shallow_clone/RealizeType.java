package com.fkp.pattern.creator_mode.prototype.shallow_clone;

/**
 * 具体原型类，抽象原型类为Cloneable
 */
public class RealizeType implements Cloneable{

    public RealizeType() {
        System.out.println("具体的原型对象被创建了");
    }

    @Override
    protected RealizeType clone() throws CloneNotSupportedException {
        System.out.println("通过调用clone方法复制具体原型对象");
        return (RealizeType) super.clone();
    }
}

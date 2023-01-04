package com.fkp.pattern.creator_mode.prototype.test1;

/**
 * 奖状类，即具体的原型类
 */
public class Citation implements Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show(){
        System.out.println(name + "同学获得奖状！");
    }
}

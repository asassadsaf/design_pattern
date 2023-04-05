package com.fkp.pattern.struct_mode.combination;

import javax.naming.OperationNotSupportedException;

/**
 * 抽象根节点，定义树枝节点和叶子节点工共的属性和方法
 */
public abstract class MenuComponent {
    //菜单名称
    protected String name;
    //菜单级别，1：一级菜单，2：二级菜单。。。
    protected Integer level;

    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }

    public String getName(){
        return this.name;
    }

    public abstract void print();

}

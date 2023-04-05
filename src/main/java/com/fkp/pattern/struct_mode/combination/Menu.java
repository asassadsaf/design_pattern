package com.fkp.pattern.struct_mode.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点，继承抽象根节点，聚合抽象根节点
 */
public class Menu extends MenuComponent{
    private final List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, Integer level) {
        super.name = name;
        super.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        //打印菜单项
        for(int i=0;i<super.level;i++){
            System.out.print("-");
        }
        System.out.println(super.getName());
        //打印子菜单
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}

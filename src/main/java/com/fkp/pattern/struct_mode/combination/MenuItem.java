package com.fkp.pattern.struct_mode.combination;

/**
 * 叶子节点，继承抽象根节点
 */
public class MenuItem extends MenuComponent{
    public MenuItem(String name, Integer level) {
        super.name = name;
        super.level = level;
    }

    @Override
    public void print() {
        //打印菜单项
        for(int i=0;i<super.level;i++){
            System.out.print("-");
        }
        System.out.println(super.getName());
    }
}

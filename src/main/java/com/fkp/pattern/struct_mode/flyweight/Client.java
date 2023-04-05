package com.fkp.pattern.struct_mode.flyweight;

/**
 * 享元模式：运用共享技术来有效地支持大量细粒度对象的复用。它通过共享已经存在的对象来大幅度减少需要创建的对象数量、避免大量相似对象的开销，从而提高系统资源的利用率。
 * 享元（Flyweight ）模式中存在以下两种状态： 形状为内部状态，颜色为外部状态
 *      1. 内部状态，即不会随着环境的改变而改变的可共享部分。
 *      2. 外部状态，指随环境改变而改变的不可以共享的部分。享元模式的实现要领就是区分应用中的这两种状态，并将外部状态外部化。
 */
public class Client {
    public static void main(String[] args) {
        AbstractBox iBox = BoxFactory.getInstance().getBox("I");
        iBox.display("红色");
        AbstractBox oBox = BoxFactory.getInstance().getBox("O");
        oBox.display("红色");
        AbstractBox lBox = BoxFactory.getInstance().getBox("L");
        lBox.display("红色");
        AbstractBox iBox2 = BoxFactory.getInstance().getBox("I");
        iBox2.display("黄色");
        System.out.println("iBox和iBox2是否是同一个对象：" + (iBox == iBox2));
    }
}

package com.fkp.pattern.creator_mode.builder.demo2;

/**
 * 建造者模式扩展
 *      当一个实体有很多属性，如果使用构造方法创建这个实体就会传入非常多的参数，参数的顺序，个数在调用者使用时需要对照构造方法的参数列表进行构建，相对麻烦且容易出错
 *      使用构建者模式，使用构建器链式调用的方式创建对象，增加了可读性，创建对象时会像使用set方法一样可读且省去了重复使用变量调用set方法的麻烦
 */
public class Client {
    public static void main(String[] args) {
        //1.比使用构造方法可读性强，比使用set方法简便
        Computer computer = new Computer.AllBuilder()
                .mainboard("华硕")
                .memory("金士顿")
                .screen("三星")
                .cpu("英特尔")
                .build();
        System.out.println(computer);
        //2.若想只构造机箱等，即不包括显示器，若用构造方法则需要重载构造方法，或使用静态工厂方法增强可读性，也可使用构建者模式，如下
        Computer computer1 = new Computer.BoxBuilder()
                .cpu("AMD")
                .mainboard("技嘉")
                .memory("威刚")
                .build();
        System.out.println(computer1);
    }
}

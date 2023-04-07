package com.fkp.pattern.behavioral_mode.visitor.extend.static_dispatch;

/**
 * 静态分派： 发生在编译时期，分派根据静态类型信息发生。静态分派对于我们来说并不陌生，方法重载就是静态分派。
 *      重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了。
 */
public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        Execute exe = new Execute();
        exe.execute(animal);
        exe.execute(dog);
        exe.execute(cat);
    }
}

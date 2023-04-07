package com.fkp.pattern.behavioral_mode.visitor.extend.dynamic_dispatch;

/**
 * 动态分派（多态机制）： 发生在运行时期，动态分派动态地置换掉某个方法。Java通过方法的重写支持动态分派。
 *      Java编译器在编译时期并不总是知道哪些代码会被执行，因为编译器仅仅知道对象的静态类型，而不知道对象的真实类型；而方法的调用则是根据对象的真实类型，而不是静态类型。
 */
public class Client {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.execute();
        dog.execute();
        cat.execute();
    }
}

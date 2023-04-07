package com.fkp.pattern.behavioral_mode.visitor.demo;

/**
 * 访问者模式：封装一些作用于某种数据结构中的各元素的操作，它可以在不改变这个数据结构的前提下定义作用于这些元素的新的操作。
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.addAnimal(new Cat());
        home.addAnimal(new Dog());

        Person owner = new Owner();
        Person someBody = new Somebody();
        home.action(owner);
        home.action(someBody);
    }
}

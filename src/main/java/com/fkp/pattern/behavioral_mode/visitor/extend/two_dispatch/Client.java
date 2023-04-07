package com.fkp.pattern.behavioral_mode.visitor.extend.two_dispatch;

/**
 * 双分派：所谓双分派技术就是在选择一个方法的时候，不仅仅要根据消息接收者（receiver）的运行时区别，还要根据参数的运行时区别。
 *      双分派实现动态绑定的本质，就是在重载方法委派的前面加上了继承体系中覆盖的环节，由于覆盖是动态的，所以重载就是动态的了。
 */
public class Client {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Execute exe = new Execute();

        //animal  dog  cat  调用accept属于动态分派，accept方法中Execute调用execute属于静态分派
        animal.accept(exe);
        dog.accept(exe);
        cat.accept(exe);
    }
}

package com.fkp.pattern.struct_mode.facade;

/**
 * 外观模式（门面模式）：是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。该模式对外有一个统一接口，外部应用程序不用关心内部子系统的具体的细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。
 *      外观（Facade）模式是“迪米特法则”的典型应用
 *      优点：
 *          1.降低了子系统与客户端之间的耦合度，使得子系统的变化不会影响调用它的客户类。
 *          2.对客户屏蔽了子系统组件，减少了客户处理的对象数目，并使得子系统使用起来更加容易。
 *      缺点：
 *          1.不符合开闭原则，修改很麻烦
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //通过门面作为入口访问子系统
        facade.say("打开电器");
        facade.say("关闭电器");
    }
}

package com.fkp.pattern.struct_mode.combination;

/**
 * 组合模式：又名部分整体模式，是用于把一组相似的对象当作一个单一的对象。组合模式依据树形结构来组合对象，用来表示部分以及整体层次。这种类型的设计模式属于结构型模式，它创建了对象组的树形结构。
 *      在使用组合模式时，根据抽象构件类的定义形式，我们可将组合模式分为透明组合模式和安全组合模式两种形式。
 *          1.透明组合模式：
 *              透明组合模式中，抽象根节点角色中声明了所有用于管理成员对象的方法，比如在示例中MenuComponent 声明了 add 、 remove 、 getChild 方法，这样做的好处是确保所有的构件类都有相同的接口。透明组合模式也是组合模式的标准形式。
 *              透明组合模式的缺点是不够安全，因为叶子对象和容器对象在本质上是有区别的，叶子对象不可能有下一个层次的对象，即不可能包含成员对象，因此为其提供 add()、remove() 等方法是没有意义的，这在编译阶段不会出错，但在运行阶段如果调用这些方法可能会出错（如果没有提供相应的错误处理代码）
 *          2.安全组合模式
 *              在安全组合模式中，在抽象构件角色中没有声明任何用于管理成员对象的方法，而是在树枝节点Menu 类中声明并实现这些方法。
 *              安全组合模式的缺点是不够透明，因为叶子构件和容器构件具有不同的方法，且容器构件中那些用于管理成员对象的方法没有在抽象构件类中定义，因此客户端不能完全针对抽象编程，必须有区别地对待叶子构件和容器构件。
 */
public class Client {
    public static void main(String[] args) {
        MenuComponent menuComponent1 = new Menu("菜单管理", 2);
        menuComponent1.add(new MenuItem("页面访问", 3));
        menuComponent1.add(new MenuItem("展开菜单", 3));
        menuComponent1.add(new MenuItem("编辑菜单", 3));
        menuComponent1.add(new MenuItem("删除菜单", 3));
        menuComponent1.add(new MenuItem("新增菜单", 3));
        MenuComponent menuComponent2 = new Menu("权限管理", 2);
        menuComponent2.add(new MenuItem("页面访问", 3));
        menuComponent2.add(new MenuItem("提交保存", 3));
        MenuComponent menuComponent3 = new Menu("角色管理", 2);
        menuComponent3.add(new MenuItem("新增角色", 3));
        menuComponent3.add(new MenuItem("编辑角色", 3));
        menuComponent3.add(new MenuItem("删除角色", 3));
        MenuComponent menuComponent = new Menu("系统管理", 1);
        menuComponent.add(menuComponent1);
        menuComponent.add(menuComponent2);
        menuComponent.add(menuComponent3);

        menuComponent.print();
    }
}

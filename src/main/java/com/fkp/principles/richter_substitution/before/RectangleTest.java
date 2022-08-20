package com.fkp.principles.richter_substitution.before;

public class RectangleTest {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        //执行扩宽操作
        resize(rectangle);
        //打印长和宽
        printLengthAndWidth(rectangle);

        System.out.println("=========================================");

        //创建正方形对象
        Square square = new Square();
        square.setLength(10);
        //执行扩宽操作，预期为length:10,width:11
        resize(square);
        //打印长和宽
        printLengthAndWidth(square);
        /*
         * 结果达不到预期的效果，因为正方形的特性是长和宽相等，在执行扩宽方法时设置宽度的同时也设置了长度，导致永远不会推出while循环
         * 这种继承违反了里氏代换原则，任何基类可以出现的地方，子类一定可以出现，即子类可以扩展父类的功能但不能改变父类原有的功能，也就是子类继承父类时，除新添加的方法完成新功能外，尽量不要重写父类的方法，
         * 这里基类为Rectangle长方形类，子类为Square正方形类，在resize方法操作中基类可以达到预期结果而子类无法达到预期效果，因此违法了里氏代换原则。
         */
    }

    //扩宽方法，长方形的宽小于等于长时，对宽进行增长，直到大于长
    private static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    //打印长方形的长和宽
    private static void printLengthAndWidth(Rectangle rectangle){
        System.out.println("Length:" + rectangle.getLength());
        System.out.println("Width:" + rectangle.getWidth());
    }
}

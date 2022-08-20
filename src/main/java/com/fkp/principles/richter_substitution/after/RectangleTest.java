package com.fkp.principles.richter_substitution.after;


public class RectangleTest {
    public static void main(String[] args) {
        //创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        //进行扩宽操作
        resize(rectangle);
        //打印长和宽
        printLengthAndWidth(rectangle);

        System.out.println("=====================================");

        //创建正方形对象
        Square square = new Square();
        square.setSide(20);
        //因为此时正方形不继承长方形，因此对长方形进行扩宽的操作正方形不可以执行，避免了前边的错误。
        //打印长和宽
        printLengthAndWidth(square);
    }

    //扩宽方法，长方形的宽小于等于长时，对宽进行增长，直到大于长
    private static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    //打印长方形的长和宽
    private static void printLengthAndWidth(Quadrilateral quadrilateral){
        System.out.println("Length:" + quadrilateral.getLength());
        System.out.println("Width:" + quadrilateral.getWidth());
    }
}

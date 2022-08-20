package com.fkp.principles.richter_substitution.after;

/**
 * 长方形对象，实现四边形接口
 */
public class Rectangle implements Quadrilateral{

    private double length;

    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

}

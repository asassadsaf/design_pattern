package com.fkp.principles.richter_substitution.after;

public class Square implements Quadrilateral{

    private double side;

    public double getSide() {
        return this.getLength();
    }

    public void setSide(double side) {
        this.setLength(side);
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public void setLength(double length) {
        this.side = length;
    }

    @Override
    public void setWidth(double width) {
        this.side = width;
    }
}

package com.fkp.principles.richter_substitution.before;

/**
 * 正方形类继承长方形，在数学中正方形是特殊的长方形，即长和宽相等的长方形
 */
public class Square extends Rectangle{
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}

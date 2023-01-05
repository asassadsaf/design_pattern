package com.fkp.pattern.creator_mode.prototype.test2;

import java.io.Serializable;

public class Stu implements Serializable, Cloneable {

    private static final long serialVersionUID = -8235842603596979387L;

    private String name;

    @Override
    public Stu clone() throws CloneNotSupportedException {
        return (Stu) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

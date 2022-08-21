package com.fkp.principles.demeter;

public class Fans {

    private String name;

    public Fans() {
    }

    public Fans(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

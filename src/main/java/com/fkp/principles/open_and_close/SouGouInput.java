package com.fkp.principles.open_and_close;

public class SouGouInput {

    private AbstractSkin abstractSkin;

    public SouGouInput() {
    }

    public SouGouInput(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }

    public void setAbstractSkin(AbstractSkin abstractSkin) {
        this.abstractSkin = abstractSkin;
    }

    public void display(){
        this.abstractSkin.display();
    }
}

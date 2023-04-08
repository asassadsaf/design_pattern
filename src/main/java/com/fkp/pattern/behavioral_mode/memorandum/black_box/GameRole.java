package com.fkp.pattern.behavioral_mode.memorandum.black_box;

/**
 * 发起人角色，游戏角色
 */
public class GameRole {
    //生命力
    private Integer vit;
    //攻击力
    private Integer atk;
    //防御力
    private Integer def;

    public GameRole() {
    }

    public GameRole(Integer vit, Integer atk, Integer def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public void initState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.atk = 0;
        this.vit = 0;
        this.def = 0;
    }

    public Memento saveState(){
        return new RoleStateMemento(this.vit, this.atk, this.def);
    }

    public void RoleStateRecover(Memento memento){
        RoleStateMemento memento1 = (RoleStateMemento) memento;
        this.vit = memento1.getVit();
        this.atk = memento1.getAtk();
        this.def = memento1.getDef();
    }

    public void display(){
        System.out.println("vit: " + this.vit);
        System.out.println("atk: " + this.atk);
        System.out.println("def: " + this.def);
    }

    public Integer getVit() {
        return vit;
    }

    public void setVit(Integer vit) {
        this.vit = vit;
    }

    public Integer getAtk() {
        return atk;
    }

    public void setAtk(Integer atk) {
        this.atk = atk;
    }

    public Integer getDef() {
        return def;
    }

    public void setDef(Integer def) {
        this.def = def;
    }

    private class RoleStateMemento implements Memento{
        //生命力
        private Integer vit;
        //攻击力
        private Integer atk;
        //防御力
        private Integer def;

        public RoleStateMemento(Integer vit, Integer atk, Integer def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }

        public Integer getVit() {
            return vit;
        }

        public Integer getAtk() {
            return atk;
        }

        public Integer getDef() {
            return def;
        }
    }
}

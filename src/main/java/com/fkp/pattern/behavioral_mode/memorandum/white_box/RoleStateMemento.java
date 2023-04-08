package com.fkp.pattern.behavioral_mode.memorandum.white_box;

/**
 * 备忘录角色，角色状态备忘录
 */
public class RoleStateMemento {
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

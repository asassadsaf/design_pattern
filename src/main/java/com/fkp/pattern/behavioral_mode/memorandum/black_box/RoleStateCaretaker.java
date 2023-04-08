package com.fkp.pattern.behavioral_mode.memorandum.black_box;

/**
 * 管理者角色，游戏角色状态管理者
 */
public class RoleStateCaretaker implements Memento{
    private Memento memento;

    public Memento getMemento() {
        return this.memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

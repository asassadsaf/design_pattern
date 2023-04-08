package com.fkp.pattern.behavioral_mode.memorandum.white_box;

/**
 * 管理者角色，游戏角色状态管理者
 */
public class RoleStateCaretaker {
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}

package com.fkp.pattern.behavioral_mode.responsibility;

/**
 * 具体处理者，部门经理
 */
public class Manager extends Handler{

    public Manager() {
        super(Handler.MUN_THREE, Handler.MUN_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天," + request.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
}

package com.fkp.pattern.behavioral_mode.responsibility;

/**
 * 具体处理者，总经理
 */
public class GeneralManager extends Handler{

    public GeneralManager() {
        super(Handler.MUN_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天," + request.getContent() + "。");
        System.out.println("总经理审批：同意。");

    }
}

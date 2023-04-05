package com.fkp.pattern.behavioral_mode.responsibility;

/**
 * 具体处理者，小组长
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        super(Handler.MUN_ONE, Handler.MUN_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天," + request.getContent() + "。");
        System.out.println("小组长审批：同意。");
    }
}

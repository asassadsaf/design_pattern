package com.fkp.pattern.behavioral_mode.responsibility;

/**
 * 请假条
 */
public class LeaveRequest {
    //请假人姓名
    private final String name;
    //请假天数
    private final Integer num;
    //请假内容
    private final String content;

    public LeaveRequest(String name, Integer num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}

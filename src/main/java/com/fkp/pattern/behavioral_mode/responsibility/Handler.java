package com.fkp.pattern.behavioral_mode.responsibility;

/**
 * 抽象处理者
 */
public abstract class Handler {
    protected static final Integer MUN_ONE = 1;
    protected static final Integer MUN_THREE = 3;
    protected static final Integer MUN_SEVEN = 7;

    //领导处理请假天数起始天数
    private Integer numStart;
    //领导处理情价天数结束天数
    private Integer numEnd;
    //领导的上级领导
    private Handler handler;

    public Handler(Integer numStart) {
        this.numStart = numStart;
    }

    public Handler(Integer numStart, Integer numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler handler){
        this.handler = handler;
    }

    public final void submit(LeaveRequest request){
        if(this.numStart == 0){
            return;
        }
        if(request.getNum() >= this.numStart){
            this.handleLeave(request);
            if(this.handler != null && request.getNum() > this.numEnd){
                this.handler.submit(request);
            }else {
                System.out.println("流程结束");
            }
        }
    }

    protected abstract void handleLeave(LeaveRequest request);
}

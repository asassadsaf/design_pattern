package com.fkp.pattern.behavioral_mode.state.before;

public class Lift implements ILift{
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (this.state){
            case OPENING_STATE:
                break;
            case CLOSE_STATE:
                System.out.println("电梯门打开");
                this.setState(OPENING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                System.out.println("电梯门打开");
                this.setState(OPENING_STATE);
                break;
            default:
                break;
        }
    }

    @Override
    public void close() {
        switch (this.state){
            case OPENING_STATE:
                System.out.println("电梯门关闭");
                this.setState(CLOSE_STATE);
                break;
            case CLOSE_STATE:
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                System.out.println("电梯门关闭");
                this.setState(CLOSE_STATE);
                break;
            default:
                break;
        }
    }

    @Override
    public void run() {
        switch (this.state){
            case OPENING_STATE:
                break;
            case CLOSE_STATE:
                System.out.println("电梯开始运行");
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                System.out.println("电梯开始运行");
                this.setState(RUNNING_STATE);
                break;
            default:
                break;
        }
    }

    @Override
    public void stop() {
        switch (this.state){
            case OPENING_STATE:
                break;
            case CLOSE_STATE:
                System.out.println("电梯停止运行");
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                System.out.println("电梯停止运行");
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
            default:
                break;
        }
    }
}

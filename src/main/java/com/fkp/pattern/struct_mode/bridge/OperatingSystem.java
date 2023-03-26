package com.fkp.pattern.struct_mode.bridge;

/**
 * 抽象化角色：操作系统类
 */
public abstract class OperatingSystem {
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    //定义抽象化角色的方法，操作系统播放视频文件方法
    public abstract void play(String fileName);
}

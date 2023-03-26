package com.fkp.pattern.struct_mode.bridge;

/**
 * 扩展抽象化角色，linux操作系统
 */
public class LinuxOperatingSystem extends OperatingSystem{

    public LinuxOperatingSystem(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        super.videoFile.decode(fileName);
    }

}

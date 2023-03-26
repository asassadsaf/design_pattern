package com.fkp.pattern.struct_mode.bridge;

/**
 * 扩展抽象化角色，windows操作系统
 */
public class WindowsOperatingSystem extends OperatingSystem{

    public WindowsOperatingSystem(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        super.videoFile.decode(fileName);
    }

}

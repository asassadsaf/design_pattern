package com.fkp.pattern.struct_mode.bridge;

/**
 * 具体实现化角色，AVI视频文件类
 */
public class AVIFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("播放avi视频文件: " + fileName);
    }
}

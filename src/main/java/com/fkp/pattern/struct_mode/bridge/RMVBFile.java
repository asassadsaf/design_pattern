package com.fkp.pattern.struct_mode.bridge;

/**
 * 具体实现化角色，RMVB视频文件类
 */
public class RMVBFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("播放rmvb视频文件: " + fileName);
    }
}

package com.fkp.pattern.struct_mode.bridge;

/**
 * 桥接模式：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。
 *      1.桥接模式提高了系统的可扩充性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统。如：如果现在还有一种视频文件类型wmv，我们只需要再定义一个类实现VideoFile接口即可，其他类不需要发生变化。
 *      2.实现细节对客户透明
 */
public class Client {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new LinuxOperatingSystem(new AVIFile());
        operatingSystem.play("aaa");
        OperatingSystem operatingSystem1 = new LinuxOperatingSystem(new RMVBFile());
        operatingSystem.play("bbb");
        OperatingSystem operatingSystem2 = new WindowsOperatingSystem(new AVIFile());
        operatingSystem.play("ccc");
        OperatingSystem operatingSystem3 = new WindowsOperatingSystem(new RMVBFile());
        operatingSystem.play("ddd");
    }

}

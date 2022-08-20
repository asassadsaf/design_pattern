package com.fkp.principles.dependence_inversion.after;

public class ComputerTest {
    public static void main(String[] args) {
        //创建硬盘对象
        HardDisk xiJieHardDisk = new XiJieHardDisk();
        xiJieHardDisk.setData("希捷数据");
        HardDisk xiShuHardDisk = new XiShuHardDisk();
        xiShuHardDisk.setData("西数数据");
        //创建cpu对象
        CPU intelCPU = new IntelCPU();
        //创建内存条对象
        Memory kingstonMemory = new KingstonMemory();
        //创建计算机对象
        Computer computer = new Computer();
        //组装计算机
        computer.setCpu(intelCPU);
        computer.setMemory(kingstonMemory);
//        computer.setHardDisk(xiJieHardDisk);
        //更换使用西数硬盘
        computer.setHardDisk(xiShuHardDisk);
        //启动计算机
        computer.run();

        /*
         * 此时再想使用其他品牌的配件组装电脑只需要创建该品牌的配件实现对应的接口，而不需要修改计算机类的代码，遵守开闭原则和依赖倒转原则。
         */
    }
}

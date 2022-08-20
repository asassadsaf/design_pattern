package com.fkp.principles.dependence_inversion.before;

public class ComputerTest {
    public static void main(String[] args) {
        //创建硬盘对象
        XiJieHardDisk xiJieHardDisk = new XiJieHardDisk();
        xiJieHardDisk.setData("数据");
        //创建cpu对象
        IntelCPU intelCPU = new IntelCPU();
        //创建内存条对象
        KingstonMemory kingstonMemory = new KingstonMemory();
        //创建计算机对象
        Computer computer = new Computer();
        //组装计算机
        computer.setIntelCPU(intelCPU);
        computer.setKingstonMemory(kingstonMemory);
        computer.setXiJieHardDisk(xiJieHardDisk);

        //启动计算机
        computer.run();

        /*
         * 如果需要其他品牌的计算机配件组装电脑则需要修改Computer对象，违反了依赖倒转原则，高层模块不应该依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节，细节应该依赖抽象。
         * 此处的计算机Computer对象即高层模块，配件对象即底层模块，其存在依赖关系，如果需要更换配件则需要对计算机对象进行修改，无法做到在扩展时不修改原有的代码，也违反了开闭原则
         */
    }
}

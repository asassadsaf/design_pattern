package com.fkp.principles.dependence_inversion.before;

public class Computer {

    private IntelCPU intelCPU;

    private KingstonMemory kingstonMemory;

    private XiJieHardDisk xiJieHardDisk;

    public void run(){
        System.out.println("启动计算机...");
        intelCPU.run();
        kingstonMemory.save();
        xiJieHardDisk.getData();
    }

    public IntelCPU getIntelCPU() {
        return intelCPU;
    }

    public void setIntelCPU(IntelCPU intelCPU) {
        this.intelCPU = intelCPU;
    }

    public KingstonMemory getKingstonMemory() {
        return kingstonMemory;
    }

    public void setKingstonMemory(KingstonMemory kingstonMemory) {
        this.kingstonMemory = kingstonMemory;
    }

    public XiJieHardDisk getXiJieHardDisk() {
        return xiJieHardDisk;
    }

    public void setXiJieHardDisk(XiJieHardDisk xiJieHardDisk) {
        this.xiJieHardDisk = xiJieHardDisk;
    }

}

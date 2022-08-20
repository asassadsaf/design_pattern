package com.fkp.principles.dependence_inversion.after;

public class Computer {

    private CPU cpu;

    private Memory memory;

    private HardDisk hardDisk;

    public void run(){
        System.out.println("启动计算机...");
        cpu.run();
        memory.save();
        hardDisk.get();
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
}

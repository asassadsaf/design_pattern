package com.fkp.pattern.creator_mode.builder.demo2;

import lombok.Data;

@Data
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    static final class AllBuilder{
        private final Computer computer = new Computer();
        public AllBuilder cpu(String cpu){
            computer.setCpu(cpu);
            return this;
        }
        public AllBuilder screen(String screen){
            computer.setScreen(screen);
            return this;
        }
        public AllBuilder memory(String memory){
            computer.setMemory(memory);
            return this;
        }
        public AllBuilder mainboard(String mainboard){
            computer.setMainboard(mainboard);
            return this;
        }
        public Computer build(){
            return computer;
        }
    }

    static final class BoxBuilder {
        private final Computer computer = new Computer();
        public BoxBuilder cpu(String cpu){
            computer.setCpu(cpu);
            return this;
        }
        public BoxBuilder memory(String memory){
            computer.setMemory(memory);
            return this;
        }
        public BoxBuilder mainboard(String mainboard){
            computer.setMainboard(mainboard);
            return this;
        }
        public Computer build(){
            return computer;
        }
    }
}

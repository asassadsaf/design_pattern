package com.fkp.principles.dependence_inversion.after;

public class XiJieHardDisk implements HardDisk{

    private String data;

    @Override
    public String get() {
        System.out.println("使用希捷硬盘读取数据...");
        return this.getData();
    }

    @Override
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据...");
        this.setData(data);
    }

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }

}

package com.fkp.principles.dependence_inversion.before;

public class XiJieHardDisk {

    private String data;

    public String getData(){
        System.out.println("使用希捷硬盘读取数据...");
        return data;
    }

    public void setData(String data){
        System.out.println("使用希捷硬盘存储数据...");
        this.data = data;
    }
}

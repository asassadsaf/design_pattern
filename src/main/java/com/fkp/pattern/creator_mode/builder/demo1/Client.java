package com.fkp.pattern.creator_mode.builder.demo1;

/**
 * 建造者模式demo
 */
public class Client {
    public static void main(String[] args) {
        //通过给指挥者传入不同的Builder从而创建出不同的产品
        Director director = new Director(new OfoBuilder());
        Bike ofoBike = director.construct();
        System.out.println(ofoBike);
        Director director2 = new Director(new MobikeBuilder());
        Bike mobikeBike = director2.construct();
        System.out.println(mobikeBike);
    }
}

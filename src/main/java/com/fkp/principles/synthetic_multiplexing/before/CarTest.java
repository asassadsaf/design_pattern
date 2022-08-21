package com.fkp.principles.synthetic_multiplexing.before;

public class CarTest {
    public static void main(String[] args) {
        //创建红色、白色汽油汽车
        RedPetrolCar redPetrolCar = new RedPetrolCar();
        WhitePetrolCar whitePetrolCar = new WhitePetrolCar();
        redPetrolCar.move();
        whitePetrolCar.move();

        //创建红色、白色电力汽车
        RedElectricCar redElectricCar = new RedElectricCar();
        WhiteElectricCar whiteElectricCar = new WhiteElectricCar();
        redElectricCar.move();
        whiteElectricCar.move();

        /*
         * 此时如果想添加一种光能汽车，此种继承的关联关系需要添加三个类，即光能汽车类，红色光能汽车类、白色光能汽车类，违背了合成复用原则，尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。
         */
    }
}

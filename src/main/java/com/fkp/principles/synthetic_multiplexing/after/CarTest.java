package com.fkp.principles.synthetic_multiplexing.after;

public class CarTest {
    public static void main(String[] args) {
        //创建红色、白色汽油汽车
        PetrolCar redPetrolCar = new PetrolCar();
        redPetrolCar.color = new RedColor();
        redPetrolCar.move();
        PetrolCar whitePetrolCar = new PetrolCar();
        whitePetrolCar.color = new WhiteColor();
        whitePetrolCar.move();

        //创建红色、白色电力汽车
        ElectricCar redElectricCar = new ElectricCar();
        redElectricCar.color = new RedColor();
        redElectricCar.move();
        ElectricCar whiteElectricCar = new ElectricCar();
        whiteElectricCar.color = new WhiteColor();
        whiteElectricCar.move();

        /**
         * 此时如果想添加光能汽车，只需要创建光能汽车类并继承汽车类即可，遵守了合成复用原则。
         */

    }
}

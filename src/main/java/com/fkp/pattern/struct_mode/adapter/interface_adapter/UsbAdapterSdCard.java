package com.fkp.pattern.struct_mode.adapter.interface_adapter;

/**
 * 适配器类，让电脑能够读取Sd卡中的数据，接口适配器模式：基于对象适配器类的组件，添加适配器抽象类，在抽象类中实现所有目标接口，而适配器类继承抽象适配器类，只需要重写需要的方法
 * 适用于目标接口非常多，但适配者不需要适配这么多的接口
 */
public class UsbAdapterSdCard extends UsbAdapterSdCardAbstract {

    private final SdCard sdCard;

    public UsbAdapterSdCard(SdCard sdCard){
        this.sdCard = sdCard;
    }

    //只重写需要适配的方法，只需要适配Usb的读方法，不需要写方法
    @Override
    public String readFromUsbInterface() {
        return sdCard.readFromSdCard();
    }

}

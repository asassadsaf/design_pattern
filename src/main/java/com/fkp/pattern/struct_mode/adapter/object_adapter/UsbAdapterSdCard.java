package com.fkp.pattern.struct_mode.adapter.object_adapter;

/**
 * 适配器类，让电脑能够读取Sd卡中的数据，对象适配器模式：聚合适配者类，实现目标接口或继承目标类，解决了目标没有接口的情况下，符合合成复用原则
 */
public class UsbAdapterSdCard implements UsbInterface {

    private final SdCard sdCard;

    public UsbAdapterSdCard(SdCard sdCard){
        this.sdCard = sdCard;
    }

    @Override
    public String readFromUsbInterface() {
        return sdCard.readFromSdCard();
    }

    @Override
    public void write2UsbInterface(String value) {
        sdCard.write2SdCard(value);
    }
}

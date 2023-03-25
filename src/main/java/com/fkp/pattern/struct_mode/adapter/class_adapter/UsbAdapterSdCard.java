package com.fkp.pattern.struct_mode.adapter.class_adapter;

/**
 * 适配器类，让电脑能够读取Sd卡中的数据，继承适配者类，实现目标接口，类适配器只适用于目标有接口的情况下，因为类只能单继承，若目标没有接口则需要使用对象适配器模式
 */
public class UsbAdapterSdCard extends SdCardImpl implements UsbInterface{

    @Override
    public String readFromUsbInterface() {
        return super.readFromSdCard();
    }

    @Override
    public void write2UsbInterface(String value) {
        super.write2SdCard(value);
    }
}

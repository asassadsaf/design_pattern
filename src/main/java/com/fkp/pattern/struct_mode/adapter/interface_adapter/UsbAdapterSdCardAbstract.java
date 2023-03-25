package com.fkp.pattern.struct_mode.adapter.interface_adapter;

/**
 * 适配器的抽象类，重写所有目标接口的方法
 */
public abstract class UsbAdapterSdCardAbstract implements UsbInterface{
    @Override
    public String readFromUsbInterface() {
        return null;
    }

    @Override
    public void write2UsbInterface(String value) {
    }
}

package com.fkp.pattern.struct_mode.adapter.class_adapter;

/**
 * USB接口，定义usb接口的规范
 */
public interface UsbInterface {

    /**
     * 定义usb接口的读数据规范
     * @return 读取的数据
     */
    String readFromUsbInterface();

    /**
     * 定义usb接口的写数据规范
     * @param value 写入的数据
     */
    void write2UsbInterface(String value);
}

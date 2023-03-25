package com.fkp.pattern.struct_mode.adapter.class_adapter;

/**
 * 电脑类，只能读取usb接口，现在需要让他读取sd卡，需要一个SD卡转usb的适配器
 */
public class Computer {
    public void readFormUsbInterface(UsbInterface usbInterface){
        String value = usbInterface.readFromUsbInterface();
        System.out.println("电脑通过usb接口读取的数据为: " + value);
    }

    public void write2UsbInterface(UsbInterface usbInterface, String value){
        System.out.println("电脑通过usb接口写入的数据为: " + value);
        usbInterface.write2UsbInterface(value);
    }
}

package com.fkp.pattern.struct_mode.adapter.object_adapter;

/**
 * 客户端，通过电脑的usb接口读取sd卡的内容，需要使用usb适配sd卡的适配器
 */
public class Client {
    public static void main(String[] args) {
        //1.若没有适配器，则电脑只能读写usb接口的数据
        Computer computer = new Computer();
        UsbInterface usbInterface = new UsbInterfaceImpl();
        computer.readFormUsbInterface(usbInterface);
        computer.write2UsbInterface(usbInterface, "abc");

        //2.通过适配器让电脑能读写sd卡
        Computer computer2 = new Computer();
        //定义SdCard的子实现类，通过构造方法参数传递给适配器
        SdCard sdCard = new SdCardImpl();
        UsbAdapterSdCard adapter = new UsbAdapterSdCard(sdCard);
        computer2.readFormUsbInterface(adapter);
        computer2.write2UsbInterface(adapter, "def");
    }


}

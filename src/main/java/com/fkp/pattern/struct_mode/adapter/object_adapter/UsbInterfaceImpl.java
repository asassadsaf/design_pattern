package com.fkp.pattern.struct_mode.adapter.object_adapter;

/**
 * Usb接口的实现类，实现真正的读写逻辑
 */
public class UsbInterfaceImpl implements UsbInterface {
    @Override
    public String readFromUsbInterface() {
        return "read from usb interface: hello adapter mode...";
    }

    @Override
    public void write2UsbInterface(String value) {
        System.out.println("写入usb接口的内容为: " + value);
    }
}

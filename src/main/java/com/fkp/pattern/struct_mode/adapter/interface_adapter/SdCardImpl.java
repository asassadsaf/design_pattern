package com.fkp.pattern.struct_mode.adapter.interface_adapter;

/**
 * sd卡的实现类，实现具体的sd卡读写逻辑
 */
public class SdCardImpl implements SdCard {
    @Override
    public String readFromSdCard() {
        return "read from sd card: hello adapter mode...";
    }

    @Override
    public void write2SdCard(String value) {
        System.out.println("写入sd卡中的数据: " + value);
    }
}

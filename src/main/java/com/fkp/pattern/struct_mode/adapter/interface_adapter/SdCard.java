package com.fkp.pattern.struct_mode.adapter.interface_adapter;

/**
 * 定义SD卡的规范
 */
public interface SdCard {

    /**
     * 定义sd卡的读数据规范
     * @return 读取的数据
     */
    String readFromSdCard();

    /**
     * 定于sd卡的写数据规范
     * @param value 写入的数据
     */
    void write2SdCard(String value);

}

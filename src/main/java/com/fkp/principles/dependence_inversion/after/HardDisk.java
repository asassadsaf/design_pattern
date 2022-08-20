package com.fkp.principles.dependence_inversion.after;

public interface HardDisk {
    String get();

    void save(String data);

    void setData(String data);

    String getData();
}

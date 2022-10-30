package com.fkp.pattern.singleton.destruction;

import com.fkp.pattern.singleton.demos.demo5.Singleton;
import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.util.Arrays;

public class DeserializerBreakSingleton {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();
        ByteOutputStream bos = new ByteOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(instance);
        byte[] bytes = bos.getBytes();
        System.out.println(Arrays.toString(bytes));
        int count = bos.getCount();
        System.out.println(count);
        ByteInputStream bis = new ByteInputStream(bytes,count);
//        int read = bis.read(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Singleton singleton = (Singleton) ois.readObject();
        System.out.println(singleton);
        System.out.println(instance);
        System.out.println(singleton == instance);
        bis.reset();
        ObjectInputStream ois2 = new ObjectInputStream(bis);
        Object o = ois2.readObject();
        System.out.println(o);
        System.out.println(o == singleton);
        System.out.println(o == instance);
    }
}

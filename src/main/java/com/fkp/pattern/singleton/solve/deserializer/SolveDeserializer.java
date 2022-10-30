package com.fkp.pattern.singleton.solve.deserializer;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class SolveDeserializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(instance);
        byte[] bytes = bos.toByteArray();
        System.out.println(Arrays.toString(bytes));
        int count = bos.size();
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

package com.fkp.pattern.creator_mode.singleton.solve.deserializer;

import java.io.*;

public class SerialVersionUIDTest {
    public static void main(String[] args) {
//        try(FileOutputStream fos = new FileOutputStream("file/serialFile");
//            ObjectOutputStream oos = new ObjectOutputStream(fos)){
//            Singleton instance = Singleton.getInstance();
//            oos.writeObject(instance);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        try (FileInputStream fis = new FileInputStream("file/serialFile");
             ObjectInputStream ois = new ObjectInputStream(fis)){
            Object o = ois.readObject();
            System.out.println(o);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

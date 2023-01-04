package com.fkp.pattern.creator_mode.prototype.test2;

import org.springframework.beans.BeanUtils;

import java.io.*;

/**
 * 奖状类，即具体的原型类，深克隆实现
 */
public class DeepCloneCitation implements Cloneable, Serializable{

    private static final long serialVersionUID = -2019120806145250494L;

    private Stu stu;

    public Stu getStu() {
        return stu;
    }

    public void setStu(Stu stu) {
        this.stu = stu;
    }

//    /**
//     * 重新创建原型对象中属性指向的对象实例并赋值给新对象的属性实现深克隆
//     * @return
//     * @throws CloneNotSupportedException
//     */
//    @Override
//    public DeepCloneCitation clone() throws CloneNotSupportedException {
//        DeepCloneCitation cloneDeepCloneCitation = (DeepCloneCitation) super.clone();
//        if(cloneDeepCloneCitation.getStu() == null){
//            return cloneDeepCloneCitation;
//        }
//        Stu newStu = new Stu();
//        newStu.setName(cloneDeepCloneCitation.getStu().getName());
//        cloneDeepCloneCitation.setStu(newStu);
//        return cloneDeepCloneCitation;
//    }

    /**
     * 使用序列化反序列化重新创建新对象中属性指向的对象实例实现深克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public DeepCloneCitation clone() throws CloneNotSupportedException {
        DeepCloneCitation cloneDeepCloneCitation = (DeepCloneCitation) super.clone();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(cloneDeepCloneCitation);
        } catch (IOException e) {
            throw new RuntimeException("复制原型对象失败");
        }
        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes,0,bytes.length);
        DeepCloneCitation cloneObject;
        try {
            ObjectInputStream ois = new ObjectInputStream(bis);
            cloneObject = (DeepCloneCitation) ois.readObject();
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            throw new RuntimeException("复制原型对象失败");
        }
        return cloneObject;
    }

    public void show(){
        System.out.println(this.stu.getName() + "同学获得奖状！");
    }

    @Override
    public String toString() {
        return "DeepCloneCitation{" +
                "stu=" + stu +
                '}';
    }
}

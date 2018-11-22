package com.ddq.design.Prototype;

/**
 * Created by 1 on 2018/11/8.
 */
/**
 *@auther 1
 *@date 2018/11/8
 *原型模式
 */
public class PrototypeModel implements Cloneable{
    private String s1;//属性1
    private String s2;//属性2

    @Override
    public Object clone() {
        PrototypeModel prototypeModel = null;
        try {
            prototypeModel = (PrototypeModel) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeModel;
    }

    void say() {
        System.out.println("yyyyyy");
    }
}

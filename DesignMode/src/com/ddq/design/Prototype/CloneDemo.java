package com.ddq.design.Prototype;

/**
 * Created by 1 on 2018/11/8.
 */
public class CloneDemo {
    public static void main(String[] args) {
        PrototypeModel prototypeModel = new PrototypeModel();

        PrototypeModel  prototypeModel1 = (PrototypeModel) prototypeModel.clone();

        prototypeModel.say();
        prototypeModel1.say();


        System.out.println((prototypeModel == prototypeModel1)?"true":"false");
        System.out.println((prototypeModel.getClass() == prototypeModel1.getClass())?"true":"false");
    }

}

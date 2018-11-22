package com.ddq.design.Singleton;

/**
 * Created by 1 on 2018/11/8.
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return  instance;
    }
}

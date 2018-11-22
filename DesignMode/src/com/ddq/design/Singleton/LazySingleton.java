package com.ddq.design.Singleton;

/**
 * Created by 1 on 2018/11/8.
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}

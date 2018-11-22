package com.ddq.design.Singleton;

/**
 * Created by 1 on 2018/11/8.
 */
/**
 *@auther 1
 *@date 2018/11/13
 *单例模式 线程安全
 */
public class Singleton {
    private volatile static Singleton instance = null;
    private Singleton getInstance(){
        //先检查实例是否存在，如果不存在才进入下面的同步块
        if(instance == null){
            synchronized (Singleton.class){
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

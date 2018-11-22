package com.ddq.design.FactoryMethod;


/**
 *@auther 1
 *@date 2018/11/8
 *工厂方法模式
 */
/**
 *@auther 1
 *@date 2018/11/8
 *火锅工厂
 */
public interface HotPotFactory {
    /**
     *@auther cgq
     *@date 2018/11/8
     *锅底
     */
   PotBottom chooseBottom(String s);
    /**
     *@auther 1
     *@date 2018/11/8
     *调料
     */
    Seasoning chooseSeasoning(String s);
    /**
     *@auther 1
     *@date 2018/11/8
     *饮料
     */
    Drink chooseDrink(String s);
}

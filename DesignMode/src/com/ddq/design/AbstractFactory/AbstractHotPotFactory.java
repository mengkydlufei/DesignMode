package com.ddq.design.AbstractFactory;

/**
 *@auther cgq
 *@date 2018/11/7
 *抽象工厂模式
 * 火锅
 */
public interface AbstractHotPotFactory {
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

package com.ddq.design.FactoryMethod;

/**
 * Created by 1 on 2018/11/8.
 */
public class OrderHotPot {
    public static void main(String[] args) {
        HotPotFactory hotPot = new HotPot();
        hotPot.chooseBottom("sc红汤");
        hotPot.chooseDrink("百威");
        hotPot.chooseSeasoning("sz油碟");
    }
}

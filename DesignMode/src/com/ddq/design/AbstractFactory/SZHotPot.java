package com.ddq.design.AbstractFactory;

/**
 * Created by 1 on 2018/11/8.
 */
/**
 *@auther 1
 *@date 2018/11/8
 *sz火锅
 */
public class SZHotPot implements AbstractHotPotFactory {

    @Override
    public PotBottom chooseBottom(String s) {
        PotBottom potBottom = new PotBottom();
        potBottom.bottom(s+"sz");
        return potBottom;
    }

    @Override
    public Seasoning chooseSeasoning(String s) {
        Seasoning seasoning = new Seasoning();
        seasoning.seasoning(s+"sz");
        return seasoning;
    }

    @Override
    public Drink chooseDrink(String s) {
        Drink drink = new Drink();
        drink.drink(s+"sz");
        return drink;
    }
}

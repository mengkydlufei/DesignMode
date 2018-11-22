package com.ddq.design.FactoryMethod;

/**
 * Created by 1 on 2018/11/8.
 */
public class HotPot implements HotPotFactory {
    @Override
    public PotBottom chooseBottom(String s) {
        PotBottom potBottom = new PotBottom();
        potBottom.bottom(s);
        return potBottom;
    }

    @Override
    public Seasoning chooseSeasoning(String s) {
        Seasoning seasoning = new Seasoning();
        seasoning.seasoning(s);
        return seasoning;
    }

    @Override
    public Drink chooseDrink(String s) {
        Drink drink = new Drink();
        drink.drink(s);
        return drink;
    }
}

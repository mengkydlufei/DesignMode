package com.ddq.design.AbstractFactory;

/**
 * Created by 1 on 2018/11/8.
 */
/**
 *@auther cgq
 *@date 2018/11/8
 *sc火锅
 */
public class SCHotPot implements AbstractHotPotFactory {


    @Override
    public PotBottom chooseBottom(String s) {
        PotBottom potBottom = new PotBottom();
        potBottom.bottom(s+"sc");
        return potBottom;
    }

    @Override
    public Seasoning chooseSeasoning(String s) {
        Seasoning seasoning = new Seasoning();
        seasoning.seasoning(s+"sc");
        return seasoning;
    }

    @Override
    public Drink chooseDrink(String s) {
        Drink drink = new Drink();
        drink.drink(s+"sc");
        return drink;
    }
}

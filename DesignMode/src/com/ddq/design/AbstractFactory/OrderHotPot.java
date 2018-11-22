package com.ddq.design.AbstractFactory;



/**
 * Created by 1 on 2018/11/8.
 */
public class OrderHotPot {

    public static void main(String[] args) {
        AbstractHotPotFactory schotPot=new SCHotPot();
        AbstractHotPotFactory szhotPot=new SZHotPot();

        schotPot.chooseBottom("红汤");
        schotPot.chooseDrink("冰阔落");
        schotPot.chooseSeasoning("小米辣");

    }

}

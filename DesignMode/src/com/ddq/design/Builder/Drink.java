package com.ddq.design.Builder;

/**
 * Created by 1 on 2018/11/8.
 */
public class Drink {
     String drinkMsg;

    public String getDrinkMsg() {
        return drinkMsg;
    }

    public void setDrinkMsg(String drinkMsg) {
        this.drinkMsg = drinkMsg;
    }
    Drink() {

    }
    public void   drink(String s) {
        System.out.println("drink-----------"+s);
    }
}

package com.ddq.design.Builder;

/**
 * Created by 1 on 2018/11/8.
 */
public class HotPotBuilder {
     PotBottom potBottom = new PotBottom();
     Seasoning seasoning = new Seasoning();
     Drink drink = new Drink();

     HotPotBuilder(String potBottomMsg,String seasoningMsg,String drinkMsg) {

        this.potBottom.bottom(potBottomMsg);
        this.seasoning.seasoning(seasoningMsg);
        this.drink.drink(drinkMsg);
    }
}

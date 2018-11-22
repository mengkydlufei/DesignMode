package com.ddq.design.Builder;

/**
 * Created by 1 on 2018/11/8.
 */
public class DinerBuilder {
    private FoodBuilder food;

     DinerBuilder(FoodBuilder food){
        System.out.println("食物是"+food.toString());
    }
}

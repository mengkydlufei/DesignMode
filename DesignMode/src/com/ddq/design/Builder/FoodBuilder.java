package com.ddq.design.Builder;

/**
 * Created by 1 on 2018/11/8.
 */
public class FoodBuilder {
     FoodBuilder(Object o) {
        System.out.println("food构造完成----------"+o.toString());
    }
     FoodBuilder(SweetBuilder sweetBuilder,HotPotBuilder hotPotBuilder) {
        System.out.println("\"food构造完成----------\""+"甜点和火锅");

    }
}

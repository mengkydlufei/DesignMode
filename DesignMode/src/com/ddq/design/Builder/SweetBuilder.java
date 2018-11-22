package com.ddq.design.Builder;

/**
 * Created by 1 on 2018/11/8.
 */
public class SweetBuilder {
    private Cake cake = new Cake(); ;

    SweetBuilder() {

    }
     SweetBuilder(String cakeMsg) {
        this.cake.cake(cakeMsg);
    }
}

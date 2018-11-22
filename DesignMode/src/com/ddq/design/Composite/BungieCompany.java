package com.ddq.design.Composite;

/**
 * Created by 1 on 2018/11/13.
 */
public class BungieCompany implements GameCompany{
    private String name;
    BungieCompany(String name){
        this.name = name;
    }

    @Override
    public void creatGame() {
        System.out.println("wangyiyouxi");
    }
}

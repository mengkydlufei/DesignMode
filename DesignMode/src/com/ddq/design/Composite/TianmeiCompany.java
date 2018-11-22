package com.ddq.design.Composite;

/**
 * Created by 1 on 2018/11/13.
 */
public class TianmeiCompany implements GameCompany{
    private String name;
    TianmeiCompany(String name){
        this.name=name;
    }
    public void creatGame(){
        System.out.println("quanjinchuji");
    }
}

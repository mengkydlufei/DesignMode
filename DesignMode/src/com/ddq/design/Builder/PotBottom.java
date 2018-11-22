package com.ddq.design.Builder;

/**
 * Created by 1 on 2018/11/8.
 */
public class PotBottom {
     String potbottomMsg;

    public String getPotbottomMsg() {
        return potbottomMsg;
    }

    public void setPotbottomMsg(String potbottomMsg) {
        this.potbottomMsg = potbottomMsg;
    }

    public void   bottom(String s) {
       System.out.println("PotBottom-----------"+s);
    }
}



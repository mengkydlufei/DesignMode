package com.ddq.design.Builder;

/**
 * Created by 1 on 2018/11/8.
 */
public class Seasoning {
     String seasoningMsg;

    public String getSeasoningMsg() {
        return seasoningMsg;
    }

    public void setSeasoningMsg(String seasoningMsg) {
        this.seasoningMsg = seasoningMsg;
    }
    Seasoning() {

    }
    public void   seasoning(String s) {
        System.out.println("Seasoning-----------"+s);
    }
}

package com.ddq.design.Composite;

import org.junit.Test;

/**
 * Created by 1 on 2018/11/14.
 */
/**
 *@auther 1
 *@date 2018/11/14
 *组合模式
 */
public class CompositeTest {
    @Test
    public void compositeTest(){
        GameCompany root = (GameCompany) new FolderCompany("CHINAGAME");
        FolderCompany chinaGame = new FolderCompany("CHINAGAME");
        FolderCompany tx = new FolderCompany("tx");
        FolderCompany wy = new FolderCompany("wy");

        BungieCompany bungieCompany = new BungieCompany("bungie");
        GuangzICompany guangziCompany = new GuangzICompany("guangzi");
        TianmeiCompany tianmeiCompany = new TianmeiCompany("tianmei");
        chinaGame.add(tx);
        chinaGame.add(wy);
        tx.add(guangziCompany);
        tx.add(tianmeiCompany);
        wy.add(bungieCompany);

        chinaGame.creatGame();
    }
}

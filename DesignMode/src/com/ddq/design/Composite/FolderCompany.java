package com.ddq.design.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1 on 2018/11/13.
 */
public class FolderCompany implements GameCompany{
    private String name;
   private  List<GameCompany> list = new ArrayList<GameCompany>();
    FolderCompany(String name){
        this.name = name;
    }
   public void add(GameCompany gameCompany){
        list.add(gameCompany);
   }
   public void remove(GameCompany gameCompany){
       list.remove(gameCompany);
   }

  public void creatGame(){
       System.out.println("创造游戏"+name);
       for(GameCompany gameCompany:list){
           gameCompany.creatGame();
       }
   }


}

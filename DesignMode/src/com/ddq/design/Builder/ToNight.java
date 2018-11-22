package com.ddq.design.Builder;

/**
 * Created by 1 on 2018/11/8.
 */
/**
 *@auther 1
 *@date 2018/11/8
 *建造者模式
 */
public class ToNight {
    public static void main(String[] args) {

        HotPotBuilder hotPotBuilder = new HotPotBuilder("鸳鸯锅","香油碟","82雪碧");
         SweetBuilder sweetBuilder = new SweetBuilder("虎皮蛋糕");

        FoodBuilder foodBuilder = new FoodBuilder(sweetBuilder,hotPotBuilder);
        DinerBuilder dinerBuilder = new DinerBuilder(foodBuilder);
    }
}

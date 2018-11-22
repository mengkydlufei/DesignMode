package com.ddq.design.Facade;

import org.junit.Test;

/**
 * Created by 1 on 2018/11/14.
 */
/**
 *@auther 1
 *@date 2018/11/14
 *外观模式
 */
public class FacadeTest {
    @Test
    public void facadeTestA(){
        Facade facade = new Facade();
        facade.methodFacadeA();
    }
    @Test
    public void facadeTestC() {
        Facade facade = new Facade();
        facade.methodFacadeC();
    }
}

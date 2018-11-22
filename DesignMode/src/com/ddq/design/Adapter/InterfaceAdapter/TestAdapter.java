package com.ddq.design.Adapter.InterfaceAdapter;

import org.junit.Test;

/**
 * Created by 1 on 2018/11/13.
 */
public class TestAdapter {
    @Test
    public void interfaceTest(){
        A a = new AdapterC();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}

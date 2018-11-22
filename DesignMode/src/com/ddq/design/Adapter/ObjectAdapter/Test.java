package com.ddq.design.Adapter.ObjectAdapter;

/**
 * Created by 1 on 2018/11/13.
 */
public class Test {
    @org.junit.Test
    public void objectAdapterTest(){
        Ps2 ps2 = new ObjectAdapter(new UsbImpl());

        ps2.ps2();
    }
}

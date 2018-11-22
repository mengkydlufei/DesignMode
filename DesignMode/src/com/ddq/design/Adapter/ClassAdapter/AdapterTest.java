package com.ddq.design.Adapter.ClassAdapter;

import com.ddq.design.Adapter.ObjectAdapter.ObjectAdapter;
import org.junit.Test;

/**
 * Created by 1 on 2018/11/13.
 */
public class AdapterTest {
    @Test
    public void adapterTest(){
        Ps2 ps2 = new Adapter();
        ps2.ps2();
    }


}

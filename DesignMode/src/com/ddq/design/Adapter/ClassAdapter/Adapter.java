package com.ddq.design.Adapter.ClassAdapter;

/**
 * Created by 1 on 2018/11/13.
 */
public class Adapter extends UsbImpl implements Ps2 {
    @Override
    public String ps2() {
        return super.usb();
    }
}

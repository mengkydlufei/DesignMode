package com.ddq.design.Adapter.ObjectAdapter;

/**
 * Created by 1 on 2018/11/13.
 */
public class ObjectAdapter implements Ps2 {
    private Usb usb;

    ObjectAdapter(Usb usb){
        this.usb = usb;
    }
    @Override
    public String ps2() {

        return usb.usb();
    }
}

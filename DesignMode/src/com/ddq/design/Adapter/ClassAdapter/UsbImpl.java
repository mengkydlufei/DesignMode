package com.ddq.design.Adapter.ClassAdapter;

/**
 * Created by 1 on 2018/11/13.
 */
public class UsbImpl implements Usb {
    @Override
    public String usb() {
        System.out.println("usb--------------");
        return "usb";
    }
}

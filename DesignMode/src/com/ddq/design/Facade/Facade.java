package com.ddq.design.Facade;

/**
 * Created by 1 on 2018/11/14.
 */
public class Facade {
    private A a = new A();
    private B b = new B();
    private C c = new C();

    public void methodFacadeA() {
        a.methidA();
    }
    public void methodFacadeC() {
        c.methodC();
    }
}

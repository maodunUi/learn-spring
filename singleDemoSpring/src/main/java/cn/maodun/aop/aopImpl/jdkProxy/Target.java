package cn.maodun.aop.aopImpl.jdkProxy;

public class Target implements TargetInterface {
    @Override
    public void method() {
        System.out.println("Target running....");
    }
}
package cn.maodun.aop.xml;

public class Target implements TargetInterface {
    @Override
    public void method() {
        System.out.println("Target running....");
    }
}
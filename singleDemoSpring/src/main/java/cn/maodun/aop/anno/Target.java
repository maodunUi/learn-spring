package cn.maodun.aop.anno;

import org.springframework.stereotype.Component;

@Component
public class Target implements TargetInterface {
    @Override
    public void method() {
        System.out.println("Target running....");
    }
}
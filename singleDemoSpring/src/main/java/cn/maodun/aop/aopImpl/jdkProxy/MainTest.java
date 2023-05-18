package cn.maodun.aop.aopImpl.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author DELL
 * @date 2022/9/19
 */
public class MainTest {

    public static void main(String[] args) {
        //创建目标对象
        Target target = new Target();
        //创建代理对象
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(target.getClass()
                        .getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args)
                            throws Throwable {
                        System.out.println("前置增强代码...");
                        Object invoke = method.invoke(target, args);
                        System.out.println("后置增强代码...");
                        return invoke;
                    }
                }
        );
    }
}

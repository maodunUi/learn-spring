package cn.maodun.aop.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {
    //前置增强方法
//    @Before("execution(* cn.maodun.aop.anno.*.*(..))")
//    public void before(){
//        System.out.println("前置代码增强.....");
//    }


    //配置前置通知
    @Before("pointcut()")
    public void before() {
        System.out.println("前置增强..........");
    }

    public void afterReturning() {
        System.out.println("后置增强..........");
    }

    //Proceeding JoinPoint:  正在执行的连接点===切点
    //@Around("execution(* com.itheima.anno.*.*(..))")
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强....");
        Object proceed = pjp.proceed();//切点方法
        System.out.println("环绕后增强....");
        return proceed;
    }

    public void afterThrowing() {
        System.out.println("异常抛出增强..........");
    }

    @After("MyAspect.pointcut()")
    public void after() {
        System.out.println("最终增强..........");
    }

    //定义切点表达式
    @Pointcut("execution(* cn.maodun.aop.anno.*.*(..))")
    public void pointcut() {
    }
}
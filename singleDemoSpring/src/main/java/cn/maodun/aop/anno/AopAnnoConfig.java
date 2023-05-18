package cn.maodun.aop.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author DELL
 * @date 2022/9/19
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan("cn.maodun.aop.anno")
public class AopAnnoConfig {
}

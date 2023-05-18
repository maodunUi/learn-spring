package cn.maodun;

import cn.maodun.anno.config.AnnoConfig;
import cn.maodun.anno.service.CityService;
import cn.maodun.di.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author DELL
 * @date 2022/9/19
 */
public class TestAnno {

    /**
     * 测试xml文件和anno 还存在以下问题
     * 1.非自定义的Bean的配置：<bean>  @Bean
     * 2.加载properties文件的配置：<context:property-placeholder>  @PropertySource
     * 3.组件扫描的配置：<context:component-scan>   @ComponentScan
     * 4.引入其他文件：<import>  @Import
     * ====  @Configuration
     */
    @Test
    public void testXmlAnno() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        CityService cityService = (CityService) applicationContext.getBean("cityService");
        cityService.query();
    }

    /**
     * 测试完全的anno注解注入
     *
     * @throws Exception
     */
    @Test
    public void testAnnoConfiguration() throws Exception {
        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(AnnoConfig.class);
        CityService cityService = (CityService)
                applicationContext.getBean("cityService");
        cityService.query();
        DataSource dataSource = (DataSource)
                applicationContext.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}

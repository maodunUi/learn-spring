package cn.maodun.anno.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * @author DELL
 * @date 2022/9/19
 */
@Configuration
@ComponentScan("cn.maodun.anno")
@Import({DataSourceConfiguration.class})
public class AnnoConfig {


}

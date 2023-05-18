package cn.maodun.annoTx.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author DELL
 * @date 2022/9/19
 */
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Configuration
@ComponentScan("cn.maodun.annoTx")
@MapperScan("cn.maodun.mapper")
public class AnnoTxConfig {

    @Value("${jdbc.driver}")
    private String driverClassName;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    // https://blog.csdn.net/Drug_/article/details/124232715
    //创建数据库连接池
    //  注解 @Bean是一个方法级别的注解，
    //  主要用在@Configuration注解的类里，也可以用在@Component注解的类里。添加的bean的id为方法名。
    // 表示  在 ioc 容器中进行创建对象
    @Bean
    public DruidDataSource getDruidDataSource(){
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }


    //创建JdbcTemplate对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        //到ioc 容器中 根据类型找到相对应得 DataSource 对象 进行注入
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        //注入DruidDataSource
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager=new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

}

package cn.maodun;

import com.alibaba.druid.pool.DruidDataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @author DELL
 * @date 2022/9/19
 */
public class TestJdbcCon {

    /**
     * 测试c3p0
     *
     * @throws Exception
     */
    @Test
    public void testC3P0() throws Exception {
        //创建数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        //设置数据库连接参数
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/demo");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        //获得连接对象
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    /**
     * 测试Druid
     *
     * @throws Exception
     */
    @Test
    public void testDruid() throws Exception {
        //创建数据源
        DruidDataSource dataSource = new DruidDataSource();
        //设置数据库连接参数
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        //获得连接对象
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    /**
     * 测试获取properties文件
     *
     * @throws Exception
     */
    @Test
    public void testC3P0ByProperties() throws Exception {
        //加载类路径下的jdbc.properties
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(rb.getString("jdbc.driver"));
        dataSource.setJdbcUrl(rb.getString("jdbc.url"));
        dataSource.setUser(rb.getString("jdbc.username"));
        dataSource.setPassword(rb.getString("jdbc.password"));
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }


    /**
     * 测试spring整合连接池
     *
     * @throws SQLException
     */
    @Test
    public void testSpringConn() throws SQLException {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource)
                applicationContext.getBean("dataSource");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }
}

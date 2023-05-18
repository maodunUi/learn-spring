package cn.maodun;

import cn.maodun.di.dao.UserDao;
import cn.maodun.di.service.BookService;
import cn.maodun.di.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xl
 * @date 2022/9/19
 */
public class TestDi {

    /**
     * 测试简单依赖注入
     * <bean id="userDao" class="cn.maodun.dao.impl.UserDaoImpl"></bean>
     */
    @Test
    public void testUserDao(){
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }

    /**
     * 测试有参构造注入
     * <bean id="userService" class="cn.maodun.di.service.impl.UserServiceImpl">
     * <constructor-arg name="userDao" ref="userDao"></constructor-arg>
     * </bean>
     */
    @Test
    public void testUserServiceConstruct(){
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
    }

    /**
     * 测试set注入
     * <bean id="bookService" class="cn.maodun.di.service.impl.BookServiceImpl">
     * <property name="userDao" ref="userDao"/>
     * </bean>
     */
    @Test
    public void testUserServiceSetMethod(){
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) applicationContext.getBean("bookService");
        bookService.save();
    }
}

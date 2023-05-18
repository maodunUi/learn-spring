package cn.maodun.di.service.impl;

import cn.maodun.di.dao.UserDao;
import cn.maodun.di.service.UserService;

/**
 * @author DELL
 * @date 2022/9/19
 */
public class UserServiceImpl implements UserService {

    UserDao userDao ;
    UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }

    public void save() {
//        ApplicationContext applicationContext = new
//                ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        userDao.save();
    }
}

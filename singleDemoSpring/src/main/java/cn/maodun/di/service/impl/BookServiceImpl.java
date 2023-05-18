package cn.maodun.di.service.impl;

import cn.maodun.di.dao.UserDao;
import cn.maodun.di.service.BookService;

/**
 * @author DELL
 * @date 2022/9/19
 */
public class BookServiceImpl implements BookService {

    UserDao userDao ;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}

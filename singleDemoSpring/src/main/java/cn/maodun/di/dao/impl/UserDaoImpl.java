package cn.maodun.di.dao.impl;

import cn.maodun.di.dao.UserDao;
import cn.maodun.di.pojo.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author DELL
 * @date 2022/9/19
 */
public class UserDaoImpl implements UserDao {

    private String company;

    private int age;

    private List<String> strList;

    private List<User> userList;

    private Map<String,User> userMap;

    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void save() {
        System.out.println(company+"==="+age);
        System.out.println(strList);
        System.out.println(userList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("UserDao save method running....");
    }
}

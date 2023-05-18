package cn.maodun.anno.dao.impl;

import cn.maodun.anno.dao.CityDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author DELL
 * @date 2022/9/19
 */
@Repository("cityDao")
public class CityDaoImpl implements CityDao {

    @Value("注入普通数据")
    private String str;

    @Value("${jdbc.driver}")
    private String driver;

    public void query() {
        System.out.println(str);
        System.out.println(driver);
        System.out.println("CityDaoImpl query");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化方法....");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法.....");
    }
}

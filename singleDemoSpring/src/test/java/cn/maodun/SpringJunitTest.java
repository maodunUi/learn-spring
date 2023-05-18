package cn.maodun;

import cn.maodun.anno.config.AnnoConfig;
import cn.maodun.anno.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AnnoConfig.class})
//加载spring核心配置文件
//@ContextConfiguration(value = {"classpath:applicationContext.xml"})
//加载spring核心配置类
public class SpringJunitTest {

    @Autowired
    private CityService cityService;

    @Test
    public void testUserService() {
        cityService.query();
    }
}
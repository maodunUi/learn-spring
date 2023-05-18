package cn.maodun;

import cn.maodun.aop.anno.AopAnnoConfig;
import cn.maodun.aop.anno.Target;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author DELL
 * @date 2022/9/19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AopAnnoConfig.class})
public class TestAnnoAop {

    @Autowired
    private Target target ;

    @Test
    public void testAnnoAop(){
        target.method();
    }
}

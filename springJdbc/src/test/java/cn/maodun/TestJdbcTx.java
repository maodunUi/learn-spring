package cn.maodun;

import cn.maodun.service.AccountService;
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
@ContextConfiguration("classpath:applicationContext.xml")
public class TestJdbcTx {

    @Autowired
    private AccountService accountService;

    @Test
    public void testjdbcTx(){
        accountService.transfer("tom","lisi",1000);
    }

}

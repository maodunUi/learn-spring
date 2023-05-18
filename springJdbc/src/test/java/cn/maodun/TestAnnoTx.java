package cn.maodun;

import cn.maodun.annoTx.config.AnnoTxConfig;
import cn.maodun.annoTx.service.AccountService;
import cn.maodun.mapper.UserMapper;
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
@ContextConfiguration(classes = AnnoTxConfig.class)
public class TestAnnoTx {

    @Autowired
    private AccountService accountService;

    /**
     * jdbc.url=jdbc:mysql://localhost:3306/jdbc
     */
    @Test
    public void testjdbcTx(){
        accountService.transfer("tom","lisi",1000);
    }
}

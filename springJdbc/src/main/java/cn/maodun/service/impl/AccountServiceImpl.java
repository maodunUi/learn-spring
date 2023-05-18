package cn.maodun.service.impl;

import cn.maodun.dao.AccountDao;
import cn.maodun.service.AccountService;

/**
 * @author DELL
 * @date 2022/9/19
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outMan, String inMan, double money) {
        accountDao.out(outMan,money);
        int i = 1/0;
        accountDao.in(inMan,money);
    }
}

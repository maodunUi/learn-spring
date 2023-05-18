package cn.maodun.annoTx.service;

/**
 * @author DELL
 * @date 2022/9/19
 */
public interface AccountService {
     void transfer(String outMan, String inMan, double money);
}

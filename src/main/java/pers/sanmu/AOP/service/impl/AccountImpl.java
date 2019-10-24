package pers.sanmu.AOP.service.impl;

import org.springframework.stereotype.Service;
import pers.sanmu.AOP.service.IAccountService;

/**
 * 账户业务层的实现类
 */
@Service("accountService")
public class AccountImpl implements IAccountService {
    @Override
    public void saveAccount() {
        System.out.println("执行了保存。");
    }

    @Override
    public void updateAccount(int i) {
        System.out.println("执行了更新。"+i);
    }

    @Override
    public int deleteAccount() {
        System.out.println("执行了删除。");
        return 0;
    }
}

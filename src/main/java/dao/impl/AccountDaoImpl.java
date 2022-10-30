package dao.impl;

import dao.IAccountDao;
import service.IAccountService;

/**
 * 账户的业务层实现类
 */
public class AccountDaoImpl implements IAccountDao {

    public void saveAccount() {
        System.out.println("保存了账户");
    }
}

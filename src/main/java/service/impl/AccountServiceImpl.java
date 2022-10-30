package service.impl;

import dao.IAccountDao;
import dao.impl.AccountDaoImpl;
import factory.BeanFactory;
import service.IAccountService;

/**
 * 账户的业务层实现类
 */

public class AccountServiceImpl implements IAccountService {

//    private IAccountDao accountDao=new AccountDaoImpl();
private IAccountDao accountDao=(IAccountDao) BeanFactory.getBean("accountDao");


    public void saveAccount() {
        int index=1;
        accountDao.saveAccount();
        System.out.println(index);
        index++;
    }
}

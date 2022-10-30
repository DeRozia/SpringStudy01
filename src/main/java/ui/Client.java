package ui;

import factory.BeanFactory;
import service.IAccountService;
import service.impl.AccountServiceImpl;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    public static void main(String[] args) {
//        IAccountService as=new AccountServiceImpl();
        for(int index=0;index<5;index++){
        IAccountService as= (IAccountService) BeanFactory.getBean("accountService");
            System.out.println(as);
        as.saveAccount();
        }
    }
}

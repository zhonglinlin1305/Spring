package cn.kiiwii.framework.spring.TestSpring.springwithmybatis.service;

import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.model.Account;

import java.util.List;

public interface ITestXmlService {

	
	public int insertAccount(Account account) throws Exception;

	public Account findAccountById(int i);
	
	public List<Account> findAccountsById(int i);
}

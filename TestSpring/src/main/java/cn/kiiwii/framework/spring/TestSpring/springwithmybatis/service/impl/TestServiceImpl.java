package cn.kiiwii.framework.spring.TestSpring.springwithmybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.model.Account;
import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.model.User;
import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.dao.ITestDAO;
import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.service.ITestService;

@Service("testService")
public class TestServiceImpl implements ITestService {

	@Autowired
	private ITestDAO testDAO;
	public void test() {
	}

	public boolean transfer(float money, int from, int to) throws Exception {
		
		this.testDAO.minusMoney(from, money);
		//int i = 1/0;
		this.testDAO.addMoney(to, money);
		return true;
	}
	
	public int insertAccount(Account account){
		return this.testDAO.insertAccount(account);
	}

	public Account findAccountById(int i) {
		
		return this.testDAO.getAccountById(i);
	}

	public List<Account> findAccountsById(int i) {
		return this.testDAO.findAccountsById(i);
	}

	public User findUserById(int i) {
		return this.testDAO.findUserById(i);
	}
	
}

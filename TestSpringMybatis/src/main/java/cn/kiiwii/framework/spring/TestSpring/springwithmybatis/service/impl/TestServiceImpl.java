package cn.kiiwii.framework.spring.TestSpring.springwithmybatis.service.impl;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.model.Account;
import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.model.User;
import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.dao.ITestDAO;
import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.service.ITestService;

import javax.annotation.Resource;

@Service("testService")
public class TestServiceImpl implements ITestService {

	Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

	@Resource
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
		List<Account> accounts = this.testDAO.findAccountsById(i);
		return this.testDAO.findAccountsById(i);
	}

}

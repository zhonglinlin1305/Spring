package cn.kiiwii.framework.spring.TestSpring.springwithhibernate.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kiiwii.framework.spring.TestSpring.springwithhibernate.dao.ITestHibernateDAO;
import cn.kiiwii.framework.spring.TestSpring.springwithhibernate.service.ITestHibernateService;

@Service("testHibernateService")
public class TestHibernateServiceImpl implements ITestHibernateService {

	@Autowired
	private ITestHibernateDAO testHibernateDAO;
	
	public void test() {
		Object o = this.testHibernateDAO.test();
		System.out.println(o);
	}

	public boolean transfer(float money, int from, int to) throws Exception{
		
		if(money>0){
			boolean b = this.testHibernateDAO.minusMoney(from, money);
			if(!b){
				throw new Exception("余额不足");
			}
//			int i = 1/0;
			this.testHibernateDAO.addMoney(to, money);
			return true;
		}else{
			return false;
		}
	}

	public Serializable save(Object o) {
		
		return this.testHibernateDAO.save(o);
	}
	
	public <T> T getEntity(Class clazz,Serializable id){
		
		return this.testHibernateDAO.getEntity(clazz, id);
	}
}

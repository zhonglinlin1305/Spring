package cn.kiiwii.framework.spring.TestSpring.springwithhibernate.service;

import java.io.Serializable;

public interface ITestHibernateService {

	
	public void test();
	
	public boolean transfer(float money, int from, int to) throws Exception;
	
	public Serializable save(Object o);
	
	public <T> T getEntity(Class clazz,Serializable id);
}

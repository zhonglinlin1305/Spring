package cn.kiiwii.framework.spring.TestSpring.springwithhibernate.dao;

import java.io.Serializable;

public interface ITestHibernateDAO {

	public Object test();

	public boolean addMoney(int userId,float money);
	
	public boolean minusMoney(int userId,float money);
	
	public Serializable save(Object o);
	
	public <T> T getEntity(Class clazz,Serializable id);
}

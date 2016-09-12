package cn.kiiwii.framework.spring.TestSpring.springwithhibernate.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import cn.kiiwii.framework.spring.TestSpring.springwithhibernate.dao.ITestHibernateDAO;
import cn.kiiwii.framework.spring.TestSpring.springwithhibernate.model.Account;

@Repository
public class TestHibernateDAOImpl extends HibernateDaoSupport implements ITestHibernateDAO{

	
	@Autowired
	public void setMySessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	public Object test() {
		return null;
	}

	public boolean addMoney(int userId, float money) {
		
		
		Account account = this.getHibernateTemplate().get(Account.class, userId);
		account.setMoney(account.getMoney()+money);
		return true;
		/*try {
			this.getHibernateTemplate().update(account);
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}*/
	}

	public boolean minusMoney(int userId, float money) {
		
		
		Account account = this.getHibernateTemplate().get(Account.class, userId);
		if(account.getMoney()<=0){
			return false;
		}else{
			account.setMoney(account.getMoney()-money);
			return true;
		}
		/*try {
			this.getHibernateTemplate().update(account);
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}*/
	}

	public Serializable save(Object o) {
		return this.getHibernateTemplate().save(o);
	}

	public <T> T getEntity(Class clazz,Serializable id) {
		return (T) this.getHibernateTemplate().get(clazz, id);
	}

}

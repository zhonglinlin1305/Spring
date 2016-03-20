package cn.kiiwii.framework.spring.TestSpring.springwithjdbc.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.kiiwii.framework.spring.TestSpring.springwithjdbc.dao.ITestDAO;

@Repository
public class TestDAOImpl implements ITestDAO{


	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Object test() {
		return this.jdbcTemplate.queryForList("select * from t_admin");
	}

	public boolean addMoney(int userId, float money) {
		
		int row = this.jdbcTemplate.update("update account set money = money+? where id="+userId,money);
		if(row>0){
			return true;
		}
		return false;
	}

	public boolean minusMoney(int userId, float money) {
		
		int row = this.jdbcTemplate.update("update account set money = money-? where id="+userId,money);
		if(row>0){
			return true;
		}
		return false;
	}

	public Map<String,Object> findById(Serializable serializable) {
		
		List<Map<String,Object>> maps = this.jdbcTemplate.queryForList("select * from account where id = ?", serializable);
		if(maps.size()>0){
			return maps.get(0);
		}
		return null;
	}

	public List<Map<String, Object>> findList() {
		List<Map<String,Object>> maps = this.jdbcTemplate.queryForList("select * from account ");
		return maps;
	}
	
}

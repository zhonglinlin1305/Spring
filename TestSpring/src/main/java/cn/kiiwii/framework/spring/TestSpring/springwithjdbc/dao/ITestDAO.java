package cn.kiiwii.framework.spring.TestSpring.springwithjdbc.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface ITestDAO {

	public Object test();

	public boolean addMoney(int userId,float money);
	
	public boolean minusMoney(int userId,float money);

	public Map<String,Object> findById(Serializable serializable);

	public List<Map<String, Object>> findList();
	
}

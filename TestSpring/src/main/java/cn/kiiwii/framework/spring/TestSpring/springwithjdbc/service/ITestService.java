package cn.kiiwii.framework.spring.TestSpring.springwithjdbc.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface ITestService {

	
	public void test();
	
	public boolean transfer(float money, int from, int to) throws Exception;
	
	public Map<String,Object> findById(Serializable serializable) throws Exception;
	
	public List<Map<String,Object>> findList() throws Exception;
}

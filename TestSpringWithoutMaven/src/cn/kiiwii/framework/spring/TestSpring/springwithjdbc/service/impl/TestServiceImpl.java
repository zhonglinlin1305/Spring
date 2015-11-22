package cn.kiiwii.framework.spring.TestSpring.springwithjdbc.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kiiwii.framework.spring.TestSpring.springwithjdbc.dao.ITestDAO;
import cn.kiiwii.framework.spring.TestSpring.springwithjdbc.service.ITestService;

@Service("testService")
public class TestServiceImpl implements ITestService {

	@Autowired
	private ITestDAO testDAO;
	
	public void test() {
		Object o = this.testDAO.test();
		System.out.println(o);
	}

	public boolean transfer(float money, int from, int to) throws Exception{
		
		if(money>0){
			this.testDAO.minusMoney(from, money);
			int i = 1/0;
			this.testDAO.addMoney(to, money);
			return true;
		}else{
			return false;
		}
	}

	public Map<String,Object> findById(Serializable serializable)
			throws Exception {
		return this.testDAO.findById(serializable);
	}

	public List<Map<String, Object>> findList()
			throws Exception {
		return this.testDAO.findList();
	}
}

package cn.kiiwii.framework.spring.TestSpring.springwithjdbc.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kiiwii.framework.spring.TestSpring.springwithjdbc.dynamicdatasource.DatabaseContextHolder;
import cn.kiiwii.framework.spring.TestSpring.springwithjdbc.service.ITestService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class TestController {

	private Logger logger = Logger.getLogger(TestController.class);
	@Autowired
	private ITestService testService;
	
	@RequestMapping("/test")
	public void list(HttpServletRequest request, HttpServletResponse response) {
		try {
			DatabaseContextHolder.setDataSourceOne();
			List<Map<String,Object>> tests = this.testService.findList();
			System.out.println(tests);
			
			DatabaseContextHolder.setDataSourceTwo();
			Map<String,Object> map = this.testService.findById(1);
			System.out.println(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

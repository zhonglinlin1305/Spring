package cn.kiiwii.framework.spring.TestSpring;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.model.Account;
import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.model.User;
import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.service.ITestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextwithmybatis.xml")
public class SpringWithMybatisTest {

	@Resource(name = "testService")
	private ITestService testService;

	/*@Test
	public void test() {
		boolean b;
		try {
			b = testService.transfer(200, 1, 2);
			if(b){
				System.out.println("转账成功");
			}else{
				System.out.println("转账失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("转账失败");
		}
		
	}*/
	
	/*@Test
	public void testInsert(){
		
		Account account = new Account();
		account.setMoney(1000);
		account.setName("xiaozhongzhong");
		try {
			testService.insertAccount(account);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	/*@Test
	public void testFind(){
		
		try {
			Account account = testService.findAccountById(3);
			System.out.println(account);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	@Test
	public void testList(){
		
		try {
			List<Account> accounts = testService.findAccountsById(3);

			List<Account> account = testService.findAccountsById(3);
			System.out.println(accounts);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testFindUser(){
		
		try {
			User user = testService.findUserById(1);
			User user2 = testService.findUserById(1);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

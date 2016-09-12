package cn.kiiwii.framework.spring.TestSpring;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.kiiwii.framework.spring.TestSpring.springwithhibernate.model.Account;
import cn.kiiwii.framework.spring.TestSpring.springwithhibernate.service.ITestHibernateService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextwithhibernate.xml")
public class SpringWithHibernateTest {

	@Resource(name = "testHibernateService")
	private ITestHibernateService testHibernateService;

	@Test
	public void testTransation() {
		boolean b;
		try {
			b = testHibernateService.transfer(200, 1, 2);
			if(b){
				System.out.println("转账成功");
			}else{
				System.out.println("转账失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("转账失败");
		}
	}
	@Test
	public void testsave(){
		Account account = new Account();
		account.setMoney(1000);
		account.setName("zhonglin");
		
		testHibernateService.save(account);
	}
	@Test
	public void testGet(){
		
		Account account = testHibernateService.getEntity(Account.class,1);
		Account account2 = testHibernateService.getEntity(Account.class,2);
		System.out.println(account);
		System.out.println(account2);
	}
}

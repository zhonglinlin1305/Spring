package cn.kiiwii.framework.spring.TestSpring.springwithmybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.model.Account;
import cn.kiiwii.framework.spring.TestSpring.springwithmybatis.model.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

public interface ITestDAO{

	String ADD_MONEY = "update account set money = money+#{1} where id = #{0}";
	
	String MINUS_MONEY = "update account set money = money-#{1} where id = #{0}";
	
	String INSERT_ACCOUT = "insert into account (name,money) values (#{name},#{money})";
	
	String FIND_ACCOUNT_BY_ID = "select " +
			" id as id," +
			" name as name," +
			" money as money" +
			" from account " +
			" where " +
			" id = #{id}";
	
	String FIND_ACCOUNTS_BY_ID = "select " +
			" id as id," +
			" name as name," +
			" money as money" +
			" from account " +
			" where " +
			" id >= #{id}";
	
	String FIND_USER_BY_ID = "select " +
			" id as userId," +
			" name as userName," +
			" money as userMoney" +
			" from account " +
			" where " +
			" id = #{id}";
	
	@Update(ADD_MONEY)
	@Cacheable(value = "indexCache")
	public int addMoney(int userId,float money);
	
	@Update(MINUS_MONEY)
	public int minusMoney(int userId,float money);
	
	@Insert(INSERT_ACCOUT)
	@CacheEvict(value = {"indexCache"},allEntries = true,beforeInvocation = true)
	public int insertAccount(Account account);
	
	@Select(FIND_ACCOUNT_BY_ID)
	@Cacheable(value = "indexCache",key = "'getAccountById'+#id")
	public Account getAccountById(int id);

	@Select(FIND_ACCOUNTS_BY_ID)
	@Cacheable(value = "indexCache",key = "'findAccountsById'+#id")
	public List<Account> findAccountsById(int id); 
	
	@Select(FIND_USER_BY_ID)
	@Cacheable(value = "indexCache",key = "'findUserById'+#id")
	public User findUserById(int id);
	
}

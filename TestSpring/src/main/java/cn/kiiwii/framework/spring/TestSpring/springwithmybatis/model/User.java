package cn.kiiwii.framework.spring.TestSpring.springwithmybatis.model;


public class User {

	private int userId;
	private String userName;
	private double userMoney;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getUserMoney() {
		return userMoney;
	}
	public void setUserMoney(double userMoney) {
		this.userMoney = userMoney;
	}

}

package cn.kiiwii.framework.spring.TestSpring.springwithjdbc.dynamicdatasource;

public class DatabaseContextHolder {

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();  
	
	public static void setDataSourceOne(){
		setCustomerType("dataSourceOne");
	}
	public static void setDataSourceTwo(){
		setCustomerType("dataSourceTwo");
	}
    private static void setCustomerType(String customerType) {  
        contextHolder.set(customerType);  
    }  
  
    public static String getCustomerType() { 
        return contextHolder.get();  
    }  
  
    public static void clearCustomerType() {  
        contextHolder.remove();  
    }  
}

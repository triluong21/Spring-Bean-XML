package beans;

import	org.springframework.context.annotation.Bean;
import	org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	@Bean
	public EmployeeDao employeeDao() {
		EmployeeDaoInMemoryImpl bean = new EmployeeDaoInMemoryImpl();
		return bean;
	}
	
	//Use this code with data loading from EmployeeDaoInMeroryImpl.java
	/*
	@Bean
	public EmployeeNewPayRate employeeNewPayRate() {
		EmployeeNewPayRateImpl bean = new EmployeeNewPayRateImpl();
		bean.setEmployeeDao(employeeDao());
		return bean;
	}
	*/
	
	//Use this code with data loading from beans.xml 
	@Bean
	public	EmployeeNewPayRate	employeeNewPayRate(){
		EmployeeNewPayRateImpl	bean	=	new	EmployeeNewPayRateImpl(employeeDao());
	
	return	bean;
	}
}

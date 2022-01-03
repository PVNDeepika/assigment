package com.assignment3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    
	public static ApplicationContext context;
	public static void main(String[] args) {
		 
		context =new ClassPathXmlApplicationContext("beansBank.xml");
		
		BackAccountController controller=(BackAccountController) context.getBean("BackAccountController");	
		
		controller.withdraw(9865,9854);
		controller.deposit(7644,9876);
		controller.getbalance(98756);
		controller.fundTransfer(9897,4567,9876);
	}

}

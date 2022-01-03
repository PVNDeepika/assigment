package com.assignment1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
	private static ApplicationContext context;

    public static void main(String[] args) {

          context=new ClassPathXmlApplicationContext("beans1.xml");

          Address1 address=(Address1) context.getBean("Address1");
          address.display();

          Customer1 customer=(Customer1) context.getBean("Customer1");
          customer.display();
           
           
       }

}

package com.assignment8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main( String[] args ) {
	    ApplicationContext ctx = 
	       new ClassPathXmlApplicationContext("bean.xml");
	    EightB b = (EightB) ctx.getBean("EightB");
	    b.doSomething();

	    // Explicitly closing application 
	    // context to force bean cleanup
	    ((ClassPathXmlApplicationContext)ctx).close();    
	  }

}

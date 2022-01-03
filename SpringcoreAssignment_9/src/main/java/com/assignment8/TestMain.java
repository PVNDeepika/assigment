package com.assignment8;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestMain {
	
	public static void main(String[] args)
	        throws Exception
	    {
	 
	        ConfigurableApplicationContext cap= new ClassPathXmlApplicationContext("beans.xml");
	        cap.close();
	    }

   }



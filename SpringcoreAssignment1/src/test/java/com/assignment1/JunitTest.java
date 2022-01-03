package com.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTest {

			public JunitTest(Address add) {
				assertEquals(1,add.getStreet());
			
		}
			@Test 
			void set(Address add) {
				assertEquals("set(add)",add.getStreet());
			}
		
	}



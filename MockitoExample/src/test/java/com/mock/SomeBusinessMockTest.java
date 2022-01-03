package com.mock;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,6,14});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl (dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData(); 
		assertEquals(14,result);
		}

}

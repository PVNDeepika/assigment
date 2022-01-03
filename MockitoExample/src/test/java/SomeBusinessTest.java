import static org.junit.Assert.*;
import org.junit.Test;

import com.mock.DataService;
import com.mock.SomeBusinessImpl;

public class SomeBusinessTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl (new DataServiceStub());
		int result = businessImpl.findTheGreatestFromAllData(); 
		assertEquals(24,result);
		}

}
 class DataServiceStub implements DataService{

	public int[] retrieveAllData() {
		
		return new int[] {24,6,14};
	}
	 
 }



 
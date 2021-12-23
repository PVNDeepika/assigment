package corejavaAssignment4;
import java.util.Arrays;
import java.util.List;

public class UOE {
	
		public static void main(String[] args)
		{
			String str[] = { "Mango", "Banana" };
			List<String> l = Arrays.asList(str);
			System.out.println(l);

			// It will throw java.lang.UnsupportedOperationException

			l.add("Pinapple");
			
		}
	}



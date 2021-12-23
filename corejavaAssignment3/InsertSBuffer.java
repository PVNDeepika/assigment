package corejavaAssignment3;
import java.lang.*;

public class InsertSBuffer {
	
		public static void main(String[] args)
		{
			StringBuffer str =
				new StringBuffer("it is used to at the specified index position");
			System.out.println("string = " + str);

			// insert boolean value at offset 8
			str.insert(13, " insert text");

			// prints stringbuffer after insertion
			System.out.print("After insertion = ");
			System.out.println(str.toString());
		}
	}




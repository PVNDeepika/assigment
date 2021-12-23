package corejavaAssignment3;
import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseSBuffer {
	
		public static void main(String[] args)
		{
			String input = "This method reversed object on which it was called";

			// getBytes() method to convert string
			// into bytes[].
			byte[] strAsByteArray = input.getBytes();

			byte[] result = new byte[strAsByteArray.length];

			// Store result in reverse order into the
			// result byte[]
			for (int i = 0; i < strAsByteArray.length; i++)
				result[i] = strAsByteArray[strAsByteArray.length - i - 1];

			System.out.println(new String(result));
		}
	}




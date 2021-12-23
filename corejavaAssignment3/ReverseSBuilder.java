package corejavaAssignment3;
import java.lang.*;
import java.io.*;
import java.util.*;

public class ReverseSBuilder {
	
		public static void main(String[] args)
		{

			// create a StringBuilder object
			// with a String pass as parameter
			StringBuilder str
				= new StringBuilder("This method reversed object on which it was called ");

			// print string
			System.out.println("String = "
							+ str.toString());

			// reverse the string
			StringBuilder reverseStr = str.reverse();

			// print string
			System.out.println("Reverse String = "
							+ reverseStr.toString());
		}
	}

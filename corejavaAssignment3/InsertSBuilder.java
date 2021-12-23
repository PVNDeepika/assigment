package corejavaAssignment3;
import java.lang.*;

public class InsertSBuilder {

	   public static void main(String[] args) {
	  
	      StringBuilder str = new StringBuilder("it is used to at the specified index position");
	      System.out.println("string = " + str);

	      // insert character value at offset 8
	      str.insert(8, "insert text");

	      // prints StringBuilder after insertion
	      System.out.print("After insertion = ");
	      System.out.println(str.toString());
	   }      
	}  



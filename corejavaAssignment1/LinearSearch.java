package corejavaAssignment1;
import java.util.Scanner;

public class LinearSearch {
	
	

		public static void main(String[] args) {
			int a[] ={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
			Scanner s= new Scanner(System.in);
			int n=s.nextInt();
			for(int i=0;i<a.length;i++) {
			if(n==a[i])
			{
			System.out.println("element found");
			System.exit(0);
			}
			}
			System.out.println("element not found");


			

		}

	}




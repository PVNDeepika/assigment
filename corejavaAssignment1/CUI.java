package corejavaAssignment1;
import java.util.Scanner;


public class CUI {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		String un=s.nextLine();

		int c=3;
		while(true)
		{
		String ps=s.nextLine();
		System.out.println(ps);

		if (ps.compareTo("prema")==0)
		{
		System.out.println("welcome "+un);
		break;
		}
		else
		{
		c--;
		if(c==0)
		{
		System.out.println("contact admin");
		break;

		}
		System.out.println("Wrong password . attemps remaining :"+c);

		}
		}




		}


}

package corejavaAssignment1;
import java.util.*;

	 class AvgMarks {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.print("Input student1 marks:" );
			int a1=s.nextInt();
			int a2=s.nextInt();
			int a3=s.nextInt();

			System.out.print("Input student2 marks:" );
			int b1=s.nextInt();
			int b2=s.nextInt();
			int b3=s.nextInt();

			System.out.print("Input student3 marks:" );
			int c1=s.nextInt();
			int c2=s.nextInt();
			int c3=s.nextInt();

			int t1=a1+a2+a3;
			int t2=b1+b2+b3;
			int t3=c1+c2+c3;

			int avgt=t1+t2+t3;
			int avg1=a1+b1+c1;
			int avg2=a2+b2+c2;
			int avg3=a3+b3+c3;



			System.out.println("Total markes of student1 :" +t1);
			System.out.println("Total markes of student2 :" +t2);
			System.out.println("Total markes of student3 :" +t3);
			System.out.println("Average markes of student1 :" +avg1);
			System.out.println("Average markes of student2 :" +avg2);
			System.out.println("Average markes of student3 :" +avg3);
			System.out.println("Average markes of students :" +avgt);

			}
			

		}






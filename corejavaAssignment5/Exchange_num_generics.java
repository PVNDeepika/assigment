package corejavaAssignment5;
import java.util.*;

public class Exchange_num_generics {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);

		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next()+" ");
		}
		System.out.println("After swapping ");

		Collections.swap(list, 0 , 1);
		System.out.print(" "+list);

		}



}

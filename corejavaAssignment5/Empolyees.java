package corejavaAssignment5;
import java.util.ArrayList;
import java.util.HashSet;


public class Empolyees {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	HashSet<Data> set=new HashSet<Data>();
	Data d1=new Data(101,"Deepika","CSE",10000);
	Data d2=new Data(102,"Manoj","Msc",20000);
	Data d3=new Data(103,"Madhuri","MECH",20000);
	Data d4=new Data(101,"RaviTeja","EEE",10000);

	set.add(d1);
	set.add(d2);
	set.add(d3);
	set.add(d4);
	for(Data d:set)
	{
	System.out.println("id:"+d.id+" name:"+d.name+" Department: "+d.department+" Salary:"+d.salary);
	}
	}



	}
	class Data
	{
	int id;
	String name,department;
	double salary;
	public Data(int id, String name, String department, double salary)
	{
	this.id=id;
	this.name=name;
	this.department=department;
	this.salary=salary;
	}
	}



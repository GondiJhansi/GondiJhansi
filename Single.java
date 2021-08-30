package File;

class Student
{
	int rn;
	String name;
	Student(int rn,String name)
	{
		this.rn = rn;
		this.name = name ;
	}
	void display1()
	{
		System.out.println("roll no ="+rn);
		System.out.println("Sname ="+name);
		
	}
}
class Marks extends Student
{
	int m1,m2;
	Marks(int rn,String name,int m1,int m2)
	{
		super(rn,name);
		this.m1=m1;
		this.m2=m2;
	}
	void display2()
	{
		System.out.println("marks 1 ="+m1);
		System.out.println("marks 2 ="+m2);
	}

}
public class Single 
{
	public static void main(String[] args)
	{
		Marks obj = new Marks(10,"Jaanu",96,93);
		obj.display1();
		obj.display2();

	}

}

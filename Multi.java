package File;

class Student 
{
	int rn;
	String name;
	Student(int rn,String name)
	{
		this.rn = rn;
		this.name = name;
	}
	void display1()
	{
		System.out.println("rollno = "+rn);
		System.out.println("sname = "+name);
	}
}
class Marks extends Student
{
	int m1,m2;
	Marks(int rn,String name,int m1,int m2)
	{
		super(rn,name);
		this.m1 = m1;
		this.m2 = m2 ;
	}
	void display2()
	{
		System.out.println("marks1 = "+m1);
		System.out.println("marks2 = "+m2);
	}
}
class Marks2 extends Marks
{
	int m3,m4;
	Marks2(int rn,String name,int m1,int m2,int m3,int m4)
	{
		super(rn,name,m1,m2);
		this.m3=m3;
		this.m4=m4;
		
	}
	void display3()
	{
		System.out.println("marks3 = "+m3);
		System.out.println("marks4 = "+m4);
	}
}

public class Multi
{

	public static void main(String[] args)
	{
		Marks2 obj = new Marks2(10,"Jaanu",96,93,87,90);
		obj.display1();
		obj.display2();
		obj.display3();

	}

}

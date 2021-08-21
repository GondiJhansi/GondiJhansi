package hybridlevel;

 class A1 {
	int rn;
	String name;
	A1(int rn,String name)
	{
		this.rn = rn ;
		this.name = name;
	}
	void display1()
	{
		System.out.println("rollno ="+rn);
		System.out.println("sname ="+name);
	}
}
class B1 extends A1
{
	int m1,m2;
	B1(int rn,String name,int m1,int m2)
	{
		super(rn,name);
		this.m1 = m1 ;
		this.m2 = m2 ;
	}
	void display2()
	{
		System.out.println("marks1 ="+m1);
		System.out.println("marks2 ="+m2);
	}
}
class C1 extends A1
{
	int m3,m4;
	C1(int rn,String name,int m3,int m4)
	{
		super(rn,name);
		this.m3 = m3 ;
		this.m4 = m4 ;
	}
	void display3()
	{
		System.out.println("marks3 ="+m3);
		System.out.println("marks4 ="+m4);
	}
}
class D1 extends C1
{
	int m5,m6;
	D1(int rn,String name,int m3,int m4,int m5,int m6)
	{
		super(rn,name,m3,m4);
		this.m5 = m5 ;
		this.m6 = m6 ;
		
	}
	void display4()
	{
		System.out.println("marks5 ="+m5);
		System.out.println("marks6 ="+m6);
	}
}
class File
{
	public static void main(String[] args)
	{
		
		B1 obj = new B1(10,"jaanu",92,94);
		obj.display1();
		obj.display2();
		//obj.display3();
		D1 obj2 = new D1(10,"jaanu",76,83,90,87);
		obj2.display1();
		obj2.display3();
		obj2.display4();
		
		 
		
		
		
	}
}
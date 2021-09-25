package labprograms;

public class Method_Overloading
{
	public void m1()
	{
		System.out.println("No Argument");
	}
	
	public void m2(int x)
	{
		System.out.println(x);
	}
	
	public void m3(int x,int y)
	{
		System.out.println(x+y);
	}
	public void m4(double d)
	{
		System.out.println(d);
	}
	

	public static void main(String[] args) 
	{
		Method_Overloading mo = new Method_Overloading();
		mo.m1();
		mo.m2(10);
		mo.m3(10, 20);
		mo.m4(100);
	}

}

package File;

public class OverLoad
{
	public void m1(int x,int y)
	{
		System.out.println("Value 1="+(x+y));
	}
	
	public void m1(String a,String b)
	{
		System.out.println("Value 2="+(a+b));
	}
}

class Overloading
{
	
	public static void main(String[] args)
	{
		OverLoad obj = new OverLoad();
		obj.m1(6,6);
		obj.m1("Gondi","jhansi");
	}

}

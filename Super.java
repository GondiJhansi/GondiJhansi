package File;

class Parent10
{
	public void m1()
	{
		System.out.println("Parent definition of m1");
	}
}

public class Super extends Parent10
{
	public void m1()
	{
		super.m1();
		System.out.println("Child definition of m1");
	}
	 
	public static void main(String[] args) 
	{
		Super c = new Super();
		c.m1();
	}

}

package Exceptions;

public class Demo
{
	public void m1(int a,int b)throws ArithmeticException
	{
		int c;
		c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		int x = 10,y = 0;
		Demo d = new Demo();
		try
		{
			d.m1(x, y);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("y value must be non zero");
		}
		finally
		{
			System.out.println("Program ended Finaly");
		}
	}

}

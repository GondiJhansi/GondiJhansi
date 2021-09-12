package Exceptions;
class ExceptionA extends Exception
{
	public ExceptionA(String msg)
	{
		super(msg);
	}
}

public class Sample 
{

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Welcome");
			throw new Exception("Hello ECE");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

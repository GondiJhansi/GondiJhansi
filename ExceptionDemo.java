package Exceptions;

public class ExceptionDemo
{

	public static void main(String[] args)
	{
		int x,y;
		float z = 0;
		try
		{
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			z = x/y;	
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Minimum of two numbers need to transant as a command line arguement to run this program smoothly");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Enter Input as Numbers only");
		}
		catch(ArithmeticException a)
		{
			System.out.println("Second argument must be non zero value");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Program ended successfully");
		}
	}
}

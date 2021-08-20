import java.util.*;
public class If_Else_If
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		if(num>0)
		{
			System.out.println("Given number is Positive Number");
		}
		else if(num<0)
		{
			System.out.println("Given number is Negative Number");
		}
		else
		{
			System.out.println("Given number is Zero");
		}
	}
}
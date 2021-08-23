package Pack1;
import java.util.*;
public class Valley 
	{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		int[] elements = new int[n];
		System.out.println("Enter  "+n+" Elements");
		for(int i=0;i<n;i++)		
		{
				elements[i] = sc.nextInt();
		}
		if(n==0)
		{
			System.out.println("false");
			return;
		}
		int i=1;
		while(i<n)
		{
			if((elements [i-1]) > elements[i])
			{
				i=i+1;
			}
			else
			{
				break;
			
			}
			
			
		}
		if((i==n) || (i==1) )
		{
			System.out.println("false");
			return;
		}
		while(i<n)
		{
			if(elements[i-1] < elements[i])
			{
				i=i+1;
			}
			else
			{	
				break;
			}
		}
		if(i<n)
		{
			System.out.println("false");
			return;
			
		}
		System.out.println("true");
			
	}

}

package labprograms;

import java.util.*;
public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = sc.nextInt();
		int t1 = 0,t2 = 1,sum = 0,total = 1;
		for(int i = 3;i<=num;i++)
		{
			sum = t1 + t2;
			total = sum + total;
			t1 = t2; 
			t2 = sum;
		}
		System.out.println("Total = "+total);
	}
}


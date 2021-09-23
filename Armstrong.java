package labprograms;

import java. util.*;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int sum = 0,rem,t,d;
		int num = sc.nextInt();
		d = (int)Math.log10(num)+1;
		t = num;
		while(num>0)
		{
			rem = num % 10;
			sum = sum + (int)Math.pow(rem, d);
			num = num / 10;
		}
		if(sum==t)
			System.out.println(t+" is Armstrong number");
		else
			System.out.println(t+" is not an Armstrong number");

	}

}

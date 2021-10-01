package labprograms;
import java.util.*;
class Ele_Search
{
 	public static void main(String[] args)
	{
		boolean exist=false;
	 	int[] a={6,16,26,66,56,69};
		System.out.println("Enter the number to check");
		Scanner sc=new Scanner(System.in);
		int number = sc.nextInt();
		for(int i=0;i<=5;i++)
		{
			if(a[i]==number)
			{
				exist=true;
				System.out.println("Number is exist");
			}

		}
		if(exist==false)
		{
			System.out.println("Number does not exist");
		}
	}
}
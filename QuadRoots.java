package labprograms;
import java.util.*;

public class QuadRoots
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		double root1,root2;
		System.out.println("Enter a,b,c values");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double det;
		det = (b*b)-(4*a*c);
		if(det>0)
		{
			root1 = (-b+Math.sqrt(det))/(2*a); 
			root2 = (-b-Math.sqrt(det))/(2*a);
			System.out.format("root1=%.2f and root2=%.2f",root1,root2);
		}
		
		else if(det==0)
		{
			root1=root2 = -b/(2*a);
			System.out.format("root1=root2=%0.2f",root1);
		}
		
		else
		{
			double real = -b/2*a;
			double imaginary = Math.sqrt(-det/(2*a));
			System.out.format("root1=%.2f+%.2fi",real,imaginary);
			System.out.format("\nroot2=%.2f-%.2fi",real,imaginary);
		}
		
	}
}


		         
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


package labprograms;
import java.util.*;

public class BikeRacers
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Bike racers speed");
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		int r3 = sc.nextInt();
		int r4 = sc.nextInt();
		int r5 = sc.nextInt();
		float avg_speed;
		int sum = r1+r2+r3+r4+r5;
		avg_speed = (float)sum/5;
		System.out.println("Average speed = "+avg_speed);
		System.out.println("Qualified racers are::::");
		if(r1>avg_speed)
			System.out.println("Racer1");
		if(r2>avg_speed)
			System.out.println("Racer2");
		if(r3>avg_speed)
			System.out.println("Racer3");
		if(r4>avg_speed)
			System.out.println("Racer4");
		if(r5>avg_speed)
			System.out.println("Racer5");
		
	}

}

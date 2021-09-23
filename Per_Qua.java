package labprograms;

import java.util.*;

public class Per_Qua
{
	int id;
	String name,branch,address;
	float ssc_marks,inter_marks;
	Scanner sc = new Scanner(System.in);
	public void get_PersonalInfo()
	{
		System.out.println("Enter id,name,branch,address");
		id = sc.nextInt();
		sc.nextLine();
		name = sc.nextLine();
		branch = sc.nextLine();
		address = sc.nextLine();
		
	}
	public void get_QualificationInfo()
	{
		System.out.println("Enter ssc marks,inter marks");
		ssc_marks = sc.nextFloat();
		sc.nextLine();
		inter_marks = sc.nextFloat();
		
		
	}
	public void show_PersonalInfo()
	{
		System.out.println("Personal Details:");
		System.out.println("====================");
		System.out.println("ID "+id);
		System.out.println("Name "+name);
		System.out.println("Branch "+branch);
		System.out.println("Address "+address);
	}
	
	public void show_QualificationInfo()
	{
		System.out.println("Qualification Details:");
		System.out.println("====================");
		System.out.println("SSC Marks "+ssc_marks);
		System.out.println("INTER Marks "+inter_marks);
	}
	
	
	
	
	public static void main(String[] args)
	{
		Per_Qua p = new Per_Qua();
		p.get_PersonalInfo();
		p.get_QualificationInfo();
		p.show_PersonalInfo();
		p.show_QualificationInfo();

	}

}

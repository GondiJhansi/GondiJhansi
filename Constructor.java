package labprograms;

public class Constructor
{
	int x;
	public Constructor()
	{
		System.out.println("Default Construcor");
		x = 10;
		
	}
	public Constructor(int y)
	{
		System.out.println("Parameterized Constructor");
		x = y;
	}
	public Constructor(Constructor t)
	{
		System.out.println("Copy Constructor");
		x = t.x;
	}
	public void show()
	{
		System.out.println("X = "+x);
	}
	
	
	public static void main(String[] args)
	{
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor(20);
		Constructor c3 = new Constructor(c2);
		c1.show();
		c2.show();
		c3.show();
	}

}

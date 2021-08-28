package File;

public class ConsOverloading
{
	int x;
	public ConsOverloading()
	{
		System.out.println("Default Constructor");
		x = 10;
	}
	public ConsOverloading(int y)
	{
		System.out.println("Parameterized Constructor");
		x=y;
	}
	public ConsOverloading(ConsOverloading t)
	{
		System.out.println("Copy Constructor");
		x=t.x;
	}
	public void show()
	{
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		ConsOverloading obj1 = new ConsOverloading();
		ConsOverloading obj2 = new ConsOverloading(20);
		ConsOverloading obj3 = new ConsOverloading(obj2);
		obj1.show();
		obj2.show();
		obj3.show();
	}
}

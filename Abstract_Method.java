package File;

abstract class Transport
{
	void colour()
	{
		System.out.println("Red");
	}
	abstract int wheels();
}

class car extends Transport
{
	int wheels()
	{
		return 4;
	}
}

 class bike extends Transport
{
	int wheels()
	{
		return 2;
	}
}

public class Abstract_Method 
{
	public static void main(String[] args)
	{
		car c = new car();
		c.colour();
		System.out.println(c.wheels());
		bike b = new bike();
		c.colour();
		System.out.println(b.wheels());
	}
}

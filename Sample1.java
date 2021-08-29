package constructors;

class Sample1
{
	public Sample1()
	{
		System.out.println("Default Constructor");
		System.out.println("This is Junior");
	}
	public Sample1(String name)
	{
		System.out.println("Parameterized Constructor");
		System.out.println("This is Senior");
	}
	
	public static void main(String[] args)
	{
		Sample1 sc = new Sample1();
		Sample1 obj = new Sample1("Jaanu");		
	}
}



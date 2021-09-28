package AWT;
class OuterClass
{
	int num;
	private class InnerClassDemo
	{
		public void show()
		{
			System.out.println("Inner Class");
		}
	}
	void display_Inner()
	{
		InnerClassDemo obj = new InnerClassDemo();
		obj.show();
	}
}

public class InnerClass1
{

	public static void main(String[] args)
	{
		OuterClass obj2 = new OuterClass ();
		obj2.display_Inner();

	}

}

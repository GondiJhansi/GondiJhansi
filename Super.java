package Oops;

class Add
{
	int x = 14, y = 5;
	void add()
	{
		System.out.println("Add is "+(x+y));
	}
} 
class Sub extends Add
{
	void sub()
	{
		super.add();
		System.out.println("Sub is "+(super.x-super.y));
	}
}
public class Super
{
	public static void main(String[] args)
	{
		Sub obj = new Sub();
		obj.sub();
	}
}
package File;

interface sum
{
	void display1();
}
interface add
{
	void display2();
}
class Result implements sum,add
{
	public void display1()
	{
		System.out.println("Sum");
	}
	public void display2()
	{
		System.out.println("Add");
	}
}
public class Interface
{
	public static void main(String[] args)
	{
		Result r = new Result();
		r.display1();
		r.display2();
	}
}
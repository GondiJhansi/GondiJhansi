package File;

public class MethOverloading
{
	public void sum(int x,int y)
	{
		System.out.println(x+y);
	}
	public void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	public static void main(String[] args)
	{
		MethOverloading sc = new MethOverloading();
		sc.sum(10,20);
		sc.sum(10,20,30);
		
	}
}

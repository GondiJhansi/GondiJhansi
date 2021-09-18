package File;
public class Addition
     {
        public void add(int x,int y)
	{
		 System.out.println("sum="+(x+y));
	}

	public void sub(int x,int y)
	{
		System.out.println("sub="+(x-y));
	}
	public void mul(int x,int y)
	{
		System.out.println("Product="+(x*y));
	}
      



	public static void main(String[] args)
	{
		Addition obj = new Addition();
		obj.add(2,3);
		obj.sub(3,4);
		obj.mul(5,6);


	}

	
}


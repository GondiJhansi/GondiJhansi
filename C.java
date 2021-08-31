package singlelevel;

public class C extends B{
	
	public void m3()
	{
		System.out.println("C class method");
	}
	public static void main(String[] args)
	{
		B bb = new B();//object creation
		C cc = new C();
		bb.m1(); //method calling
		bb.m2();
		cc.m3();
	}	
}



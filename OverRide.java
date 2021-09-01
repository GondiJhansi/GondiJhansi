package File;

class Parent
{
	public void show()
	{
		System.out.println("Parent Class");
	}
}
class Child extends Parent
{
	public void show()
	{
		System.out.println("Method OverRiding Parent Class");
	}
}
public class OverRide
{
	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.show();
		
	}
} 
OverRide.java

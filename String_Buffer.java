package labprograms;

import java.util.*;

public class String_Buffer
{

	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.capacity());
		System.out.println(s1.length());
		
		StringBuffer s2 = new StringBuffer("Welcome");
		System.out.println(s2.capacity());
		
		System.out.println(s2.charAt(4));
		
		s2.setCharAt(4, 'a');
		System.out.println(s2);
		
		
		s2.append("Srinu");
		System.out.println(s2);
		
		s2.insert(4, "a");
		System.out.println(s2);
		
		s2.reverse();
		System.out.println(s2);
		
	}

}
S
package AWT;

import java.awt.*;


public class MyFrame1 extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	public MyFrame1()
	{
		setLayout(new BorderLayout());
		b1=new Button("Senior");
		b2=new Button("Junior");
		b3=new Button("Muneer");
		b4=new Button("Jhansi");
		b5=new Button("Bhuvan");
		
		
		add("North",b1);
		add("South",b2);
		add("East",b3);
		add("West",b4);
		add("Center",b5);
		
	}

	public static void main(String[] args) 
	{
		MyFrame1 f = new MyFrame1();
		f.setTitle("First Frame");
		f.setSize(400,400);
		f.setVisible(true);

	}

}

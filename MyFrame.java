package AWT;

import java.awt.Frame;
import java.awt.*;

public class MyFrame extends Frame
{
	Label l1,l2;
	Button b1,b2;
	TextField tf1,tf2;
	Checkbox cg1,cg2;
	public MyFrame()
	{
		setLayout(new FlowLayout());
		l1=new Label("Username");
		l2=new Label("Password");
		b1=new Button("Login");
		b2=new Button("Clear");
		tf1=new TextField(25);
		tf2=new TextField(25);
		cg1=new Checkbox("cricket");
		cg2=new Checkbox("hockey");
		
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
		add(b2);
		add(cg1);
		add(cg2);
	}
	
	public static void main(String[] args) 
	{
		MyFrame f = new MyFrame();
		f.setTitle("First Frame");
		f.setSize(400,400);
		f.setVisible(true);

	}

}

package com.gsv.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class BorderLayoutDemo extends JFrame {

	public static void main(String[] args) {
		
		BorderLayoutDemo bld= new BorderLayoutDemo();
		bld.setVisible(true);
		bld.setSize(400, 500);
		bld.setTitle("border layout");
		
	}
	JButton jb1=null;
	JButton jb2=null;
	JButton jb3=null;
	JButton jb4=null;
	JButton jb5=null;
	
	public BorderLayoutDemo()
	{
		jb1= new JButton("Center");
		add(jb1,BorderLayout.CENTER);
		jb2=new JButton("West");
		add(jb2,BorderLayout.WEST);
		jb3=new JButton("South");
		add(jb1,BorderLayout.SOUTH);
		jb4=new JButton("North");
		add(jb1,BorderLayout.NORTH);
		jb5=new JButton("East");
		add(jb1,BorderLayout.EAST);
		
		
		
	}
}

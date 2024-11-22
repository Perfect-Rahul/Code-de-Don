package com.gsv.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class DemoBox extends JFrame implements ItemListener
{
   public static void main(String[] args) {
	
	   DemoBox db=new DemoBox();
	   db.setVisible(true);
	   db.setSize(500,500);
	   db.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   
}
   
   JCheckBox cb1,cb2;
   JRadioButton rb1,rb2;
   ButtonGroup bg;
   JTextArea jta;
   Container c=null;
   
   public DemoBox()
   {
	   setLayout(new FlowLayout());
	   cb1=new JCheckBox("java");
	   cb2=new JCheckBox("python");
	   rb1=new JRadioButton("C",true);
	   rb2=new JRadioButton("CPP",false);
	   bg= new ButtonGroup();
	   bg.add(rb1);
	   bg.add(rb2);
	   jta= new JTextArea(10,20);
	   jta.setBackground(Color.BLACK);
	   c= getContentPane();
	   
	   c.add(cb1);
	   c.add(cb2);
	   c.add(rb1);
	   c.add(rb2);
	   c.add(jta);
	   cb1.addItemListener(this);
	   cb2.addItemListener(this);
	   rb1.addItemListener(this);
	   rb2.addItemListener(this);
	   
	   
	   
	   
   }

@Override
public void itemStateChanged(ItemEvent e) {
	
	String msg="";
	if(cb1.isSelected())
	{
		msg=msg+"\n"+cb1.getText();
		
	}
	if(cb2.isSelected())
	{
		msg=msg+"\n"+cb2.getText();
		
	}
	jta.setText(msg);
	msg=" ";
}
	

}

package com.gsv.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class JFrameDemo extends JFrame implements ActionListener

    {
	  public static void main(String[] args) {
		
		JFrameDemo jfd=new JFrameDemo();
		jfd.setTitle("My Add and Sub");
		jfd.setVisible(true);
		jfd.setSize(400,400);
		jfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		  
	}
	  JButton addation,sub;
	  JTextArea jta,jtb,result;
	 

	public JFrameDemo() {
		setLayout(new FlowLayout());
		addation=new JButton("Add");
		sub=new JButton("Sub");
		jta=new JTextArea("Enter a number");
		jta.setSize(10,10);
		jtb=new JTextArea("Enter b number");
		result= new JTextArea("Result");
		jtb.setSize(10,10);
		add(addation);
		
		add(sub);
		add(jta);
		add(jtb);
		add(result);
		addation.addActionListener(this);
		
	}
	
     public void actionPerformed(ActionEvent e)
     {
    	 if(addation.isEnabled())
    	 {
    		 System.out.println("Addation");
    		 int a= Integer.parseInt(jta.getText());
    		 int b=Integer.parseInt(jtb.getText());
    		 int s=a+b;
    		 System.out.println(s);
    		 result.setText(s+"");
    	 }
     }
}

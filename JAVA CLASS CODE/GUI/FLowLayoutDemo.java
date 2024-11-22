package com.gsv.gui;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FLowLayoutDemo extends JFrame {
	
	public static void main(String[] args) {
		
		FLowLayoutDemo fl=new FLowLayoutDemo();
		fl.setVisible(true);
		fl.setSize(400,500);
		
	}
    JLabel jl=null;
    JTextArea jta=null;
    JTextField jtf=null;
    public FLowLayoutDemo()
    {
    	FlowLayout f= new FlowLayout();
    	setLayout(f);
    	jl=new JLabel("first");
    	jta = new JTextArea(30,40);
    	jtf= new JTextField(10);
    	add(jl);
    	add(jta);
    	add(jtf);
    	
    	
    	
    	
    }
	
}

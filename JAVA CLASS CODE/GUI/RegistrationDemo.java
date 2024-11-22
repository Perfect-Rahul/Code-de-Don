package com.gsv.gui;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RegistrationDemo extends JFrame {

	public static void main(String[] args) {
		
		RegistrationDemo rd=new RegistrationDemo();
		rd.setVisible(true);
		rd.setSize(500,500);
		rd.setTitle("Registration Page");
		rd.pack();
		
	}
	JLabel name,address,gender,hobbies;
	JButton registration,reset;
	JTextField jtf1,jtf2;
	ButtonGroup bg;
	JRadioButton male,female;
	JCheckBox c,cpp,java,python;
	JPanel mp,jp1,jp2,jp4,jp3;
	
	
	public RegistrationDemo() {
		mp =new JPanel(new GridLayout(5,1));
		jp1= new JPanel();
		jp1.setLayout(new GridLayout(2,2));
		name= new JLabel("Name");
		address = new JLabel("Address");
		jtf1=new JTextField();
		jtf2= new JTextField();
		jp1.add(name);
		jp1.add(jtf1);
		jp1.add(address);
		jp1.add(jtf2);
		mp.add(jp1);
		jp2= new JPanel(new GridLayout(1,3));
		gender= new JLabel("Gender");
		male= new JRadioButton("Male");
		female= new JRadioButton("Female");
		bg= new ButtonGroup();
		bg.add(male);
		bg.add(female);
		jp2.add(gender);
		jp2.add(male);
		jp2.add(female);
		mp.add(jp2);
		jp3 = new JPanel(new GridLayout(1,5));
		hobbies= new JLabel("Hobbies");
		c= new JCheckBox("C");
		cpp= new JCheckBox("CPP");
		java= new JCheckBox("JAVA");
		python= new JCheckBox("PYTHON");
		jp3.add(hobbies);
		jp3.add(c);
		jp3.add(cpp);
		jp3.add(java);
		jp3.add(python);
		mp.add(jp3);
		jp4= new JPanel(new GridLayout(1,2));
		registration= new JButton("Register");
		reset= new JButton("Reset");
		jp4.add(registration);
		jp4.add(reset);
		mp.add(jp4);
		
		add(mp);
		
		
		
	}
}

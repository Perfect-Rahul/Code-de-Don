package com.gsv.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginApplication extends JFrame {
	
	public static void main(String[] args) {
		
		LoginApplication la=new LoginApplication();
		la.setVisible(true);
		la.setSize(500, 500);
		la.pack();
		la.setTitle("Login application");
		
	}
	JLabel luser,lpassword;
	JTextField tuser,tpass;
	JButton login,reset;
	Font f=null;
    

public LoginApplication()
{
	   setLayout(new FlowLayout());
	   f= new Font("TimesnewRoman",Font.ITALIC,20);
	   luser=new JLabel("UserName: ");
	   luser.setFont(f);
	   luser.setBackground(Color.lightGray);
	   lpassword=new JLabel("Password: ");
	   lpassword.setFont(f);
	   lpassword.setBackground(Color.lightGray);
	   luser=new JLabel("UserName: ");
	   tuser=new JTextField(10);
	   tuser.setBackground(Color.green);
	   tpass=new JTextField(10);
	   tpass.setBackground(Color.green);
	   add(luser);
	   add(tuser);
	   add(lpassword);
	   add(tpass);
	   login =new JButton("Login");
	   reset=new JButton("Reset");
	   add(login);
	   add(reset);
	   
	   
	   
	   
	   
	   
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==registration)
	{
		String name=nm.getText                                    
	}
}

}

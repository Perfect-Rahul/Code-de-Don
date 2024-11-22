package com.gsv.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LoginGUI extends JFrame implements ActionListener
{
   public static void main(String[] args) {
	
	   LoginGUI lg=new LoginGUI();
	   lg.setVisible(true);
	   lg.setSize(800,800);
	   lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
}
   JLabel tuser=null;
   JTextField tpass=null;
   JLabel luser,lpass;
   JButton login=null, reset;
   JPasswordField pass=null;
   Font f=null;
   
   public LoginGUI()
   {
	   setLayout(new FlowLayout());
	   f= new Font("TimesnewRoman",Font.ITALIC,20);
	   luser=new JLabel("UserName: ");
	   luser.setFont(f);
	   luser.setBackground(Color.lightGray);
	   lpass=new JLabel("Password: ");
	   lpass.setFont(f);
	   lpass.setBackground(Color.lightGray);
	   luser=new JLabel("UserName: ");
	   tuser=new JTextField(10);
	   tuser=new JLabel("UserName: ");
	   tuser.setFont(f);
	   tuser.setBackground(Color.lightGray);
	   tpass=new JTextField();
	   pass= new JPasswordField();
	   login=new JButton("LOGIN");
	   luser.setBounds(100,100,100,20);
	   lpass.setBounds(100,200,100,20);
	   tuser.setBounds(200,100,100,20);
	   tpass.setBounds(200,200,100,20);
	   login.setBounds(200,300,100,20);
	   add(luser);
	   add(lpass);
	   add(tuser);
	   add(tpass);
	   add(pass);
	   add(login);
	   
	   login.addActionListener(this);
	   
   }

@Override
public void actionPerformed(ActionEvent e) {
	
	if()
	
}
   
   
   
   
   
   
}

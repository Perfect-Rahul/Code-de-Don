package com.gsv.gui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class OpenFrameDemo extends JFrame {

	public OpenFrameDemo(File f1)
	{
		JTextArea jta =new JTextArea();
		try
		{
			FileReader fr= new FileReader(f1);
			BufferedReader br= new BufferedReader(fr);
		    String msg,msg1="";
		    while((msg=br.readLine())!=null)
		    {
		    	System.out.println(msg);
		    	msg1 =msg+msg1;
		    }
                System.out.println(msg1);
                jta.setText(msg1);
		    	add(jta);
		    	
		    
		}
		catch(IOException ex)
	    {
		    	ex.printStackTrace();
	    }
			
		}
		
	}
	


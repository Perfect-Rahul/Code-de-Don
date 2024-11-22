package com.gsv.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Area;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class JMenuDemo extends JFrame implements ActionListener{
	
	public static void main(String[] args) {
		
		JMenuDemo jmd=new JMenuDemo();
		jmd.setTitle("Menu Demo");
		jmd.setSize(500,500);
		jmd.setVisible(true);
		jmd.pack();
		
	}
	
	JMenuBar menu;
	JMenu file,edit,view,font;
	JMenuItem open,save,saveas,print,cut,copy,paste,arial,roman,slideshow,doublepages, New;
	
	
	public JMenuDemo()
	{
		menu=new JMenuBar();
		file=new JMenu("FILE");
		edit=new JMenu("EDIT");
		view=new JMenu("VIEW");
		font=new JMenu("FONT");
		menu.add(file);
		menu.add(edit);
		menu.add(view);
		open=new JMenuItem("OPEN");
		save=new JMenuItem("SAVE");
		saveas=new JMenuItem("SAVE AS");
		arial=new JMenuItem("Arial");
		roman=new JMenuItem("TimesNewRoman");
		print=new JMenuItem("PRINT");
		cut=new JMenuItem("CUT");
		copy=new JMenuItem("COPY");
		paste=new JMenuItem("PASTE");
		slideshow=new JMenuItem("SLIDESHOW");
		doublepages=new JMenuItem("DOUBLE PAGES");
		New=new JMenuItem("NEW");
		file.add(New);
		file.add(open);
		file.add(save);
		file.add(saveas);
		file.add(font);
		font.add(roman);
		font.add(arial);
		edit.add(print);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		view.add(slideshow);
		view.add(doublepages);
		add(menu,BorderLayout.NORTH);
		open.addActionListener(this);
		save.addActionListener(this);
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==open)
		{
			JFileChooser jfc=new JFileChooser();
			int openstatus=jfc.showOpenDialog(this);
			if (openstatus==jfc.APPROVE_OPTION) {
				File f1 =jfc.getSelectedFile();
				System.out.println(f1.getAbsolutePath());
				OpenFrameDemo ofd = new OpenFrameDemo(f1);
				ofd.setSize(500,500);
				ofd.setVisible(true);
			}
		}
		else if(e.getSource()==New)
		{
			JTextArea ja= new JTextArea();
			ja.setSize(400, 400);
		}
		
	}

}

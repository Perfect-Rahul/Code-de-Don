package com.gsv.gui;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class JTableDemo extends JFrame {

	public static void main(String[] args) {
		
		JTableDemo jtd=new JTableDemo();
		jtd.setVisible(true);
		jtd.setSize(500,500);
		jtd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}
	JTable jt=null;
	public JTableDemo()
	{
//		Object data[][]= {{41,"Rahul Panwar",49.5f},
//				          {40,"Pragya",65},
//				          {29,"Kiran",45},
//		                  };
//		String header[]= {"ID","SName","Marks"};
//		DefaultTableModel dtm= new DefaultTableModel(data,header);
//		
//		jt= new JTable(dtm);
//		jt.setRowHeight(20);
//		JScrollPane jsp= new JScrollPane(jt);
//		add(jsp);
		String driver= "com.mysql.jdbc.Driver";
		String url= "jdbc:mysql://localhost:3306/test";
		String user="root";
		String pass="root";
		Connection con = null;
	    Statement stmt= null;
	    ResultSet rs=null;
	    String sqldql="select *from student";
	    DefaultTableModel dtm= new DefaultTableModel();
	    dtm.addColumn("Sname");
	    dtm.addColumn("Branch");
	    JTable jtd= new JTable(dtm);
		
		try
		{
			Class.forName(driver);
			con= DriverManager.getConnection(url,user,pass);
			stmt= con.createStatement();
			rs= stmt.executeQuery(sqldql);
			while(rs.next())
			{
//				System.out.println("Sname"+rs.getString(1)+"branch"+rs.getString(2));
				dtm.addRow(new Object[] {rs.getString(1),rs.getString(2)});
			}
			JScrollPane jsp= new JScrollPane(jtd);
			add(jsp);
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
			if(rs!=null)
			{
				rs.close();
				rs=null;
			}
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(stmt!=null)
				{
					stmt.close();
					stmt=null;
				}
				
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			try
			{
				if(con!=null)
				{
					con.close();
					con=null;
				}
				
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	}




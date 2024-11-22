package com.gsv.gui;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DataBaseManager {

	public static void main(String[] args) {
		
		String Driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="root";
		Connection con=null;
		Statement  stmt=null;
		ResultSet rs=null;
//		String sqlddl="create table student(sname varchar(30), branch varchar(30))";
		String sqlinsert="insert into student values('Rahul','AIDS')";
		String sqlinsert2="insert into student values('Pragya','CSE')";
		String sqlinsert3="insert into student values('Amit','EE')";
		String sqlinsert4="insert into student values('Komal','CIVIL')";
		String sqldql="select *from student";
		
		
		try
		{
		 Class.forName(Driver);	
		 con= DriverManager.getConnection(url, username, password);
		 stmt= con.createStatement();
//		 stmt.execute(sqlddl);
//		 stmt.executeUpdate(sqlinsert);
//		 stmt.executeUpdate(sqlinsert2);
//		 stmt.executeUpdate(sqlinsert3);
//		 stmt.executeUpdate(sqlinsert4);
		 rs=stmt.executeQuery(sqldql);
		 while(rs.next())
		 {
			 System.out.println(rs.getString(1)+" "+rs.getString(2));
		 }
		 
		}
		catch (ClassNotFoundException ex) {
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
	
	


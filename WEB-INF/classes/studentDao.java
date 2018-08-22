package DAO;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import Bean.student;

public class studentDao 
{
    public void userAuthentication(student l)
    {
       
       final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
       final String DB_URL="jdbc:mysql://localhost:3306/TEST";
      
       final String USER = "root";
       final String PASS = "shru";
	 
       Connection  conn = null;
       Statement stmt = null;
	   String id=l.getid();
       String name = l.getname();
       String email = l.getemail();

	   String score=null;
       try{
         
         Class.forName("com.mysql.jdbc.Driver");
         
         conn = DriverManager.getConnection(DB_URL,USER,PASS);
      
          stmt = conn.createStatement();
         String sql;
		sql = "INSERT INTO student (id,name,email,score)" +
        "VALUES (?, ?, ?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setString(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, score);
		preparedStatement.executeUpdate(); 
		 
		 
       }
       catch(SQLException se)
       {
         //Handle errors for JDBC
          se.printStackTrace();
       }
       catch(Exception e)
       {
         //Handle errors for Class.forName

         e.printStackTrace();
       }         
     
    }
	public void score(String tot,student u)
	{
		final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
       final String DB_URL="jdbc:mysql://localhost:3306/TEST";
      
       final String USER = "root";
       final String PASS = "shru";
	 
       Connection  conn = null;
       Statement stmt = null;
	   String score=tot;
       try{
         
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(DB_URL,USER,PASS);
      
          stmt = conn.createStatement();
	
         String sq;
		         sq = "SELECT * FROM student";
				  ResultSet rs = stmt.executeQuery(sq);		 
			rs.last();
			String s1=rs.getString("id");
			String s2=rs.getString("name");
			String s3=rs.getString("email");
			String s4=rs.getString("score");
			u.setid(s1);
			u.setname(s2);
			u.setemail(s3);
			u.setscore(tot);
			
			  String sql = "update student set score = '"+tot+"' where id = '"+s1+"'";
            stmt.executeUpdate(sql);
			

	}
	  catch(SQLException se)
       {
         //Handle errors for JDBC
          se.printStackTrace();
       }
       catch(Exception e)
       {
         //Handle errors for Class.forName
         e.printStackTrace();
       } 
}
}
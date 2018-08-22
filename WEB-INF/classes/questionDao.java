package DAO;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import Bean.question;

public class questionDao 
{
    public question[] userAuthentication(question p)
    {
       
       final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
       final String DB_URL="jdbc:mysql://localhost:3306/TEST";
      
       final String USER = "root";
       final String PASS = "shru";
	 
       Connection  conn = null;
       Statement stmt = null;
	  question[] q = new question[20];
	  
	  
       try{
		   int i;
     Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
        String sql;     
         sql = "SELECT question,a,b,c,d,ans FROM question";
         ResultSet rs = stmt.executeQuery(sql);
		 
		 for(i=0;i<10;i++)
		 {
    Random rg = new Random();
    for (int idx = 1; idx <= 10; ++idx){
      int randomInt = randomGenerator.nextInt(100);
      log("Generated : " + randomInt);
    }
    
    log("Done.");
  }
  
  private static void log(String aMessage){
    System.out.println(aMessage);
  }
}
 

        	q[i]=new question();
			rs.next();
			String s1=rs.getString("question");
			q[i].setqn(s1);
			String s2=rs.getString("a");
			 q[i].seta(s2);
			 String s3=rs.getString("b");
			q[i].setb(s3);
			 String s4=rs.getString("c");
			 q[i].setc(s4);
		     String s5=rs.getString("d");
			 q[i].setd(s5);
			   String s6=rs.getString("ans");
			 q[i].sete(s6);
		 
	}
		
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
     	return q;
    }
}
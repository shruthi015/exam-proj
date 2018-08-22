package Controller;
import Bean.question ;
import Bean.student;
import DAO.questionDao;
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;
import java.sql.*;
import java.net.*;
import DAO.studentDao;

public class result extends HttpServlet{
public void doGet(HttpServletRequest req, HttpSeorvletResponse res) throws IOException, ServletException
{

questionDao s=new questionDao();
question l=new question();
question[] q= s.userAuthentication(l);

PrintWriter pw = res.getWriter();
res.setContentType("text/html");
int i,count=0,tot;
String to;
		for(i=0;i<10;i++)
			{
			String s1=q[i].gete();
			String f= req.getParameter("c"+i);
			if(s1.equals(f))
				{
				count++;
				}
				
			}
			tot=count*10;
			to= Integer.toString(tot);
			
			  student z=new student(); 
      studentDao p=new studentDao();
      p.score(to,z); 
	  
	  

String id=z.getid();
String name=z.getname();
String email=z.getemail();
String sc=z.getscore();   

req.setAttribute("happy",id);
req.setAttribute("happ",name);
	req.setAttribute("hap",sc);
	
 req.getRequestDispatcher("result.jsp").forward(req,res);
	 
			
}
}			
		
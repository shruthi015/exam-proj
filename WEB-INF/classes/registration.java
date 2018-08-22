package Controller;
import Bean.student;
import DAO.studentDao;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
 
public class registration extends HttpServlet
{
  public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
  {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
	  String id=request.getParameter("id");
      String name=request.getParameter("name");
      String email=request.getParameter("email");
      student l=new student(); 
      l.setid(id);
      l.setname(name);
      l.setemail(email);
      int flag=0;
      studentDao s=new studentDao();
      s.userAuthentication(l);    
     
             request.getRequestDispatcher("rules.jsp").forward(request, response);   
			   
			 
   }
} 
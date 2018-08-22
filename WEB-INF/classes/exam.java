package Controller;
import Bean.question ;
import DAO.questionDao;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;//
 
public class exam extends HttpServlet
{
  public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
  {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
	   
      
	  int i;
	  questionDao s=new questionDao();
question l=new question();
		 question[] q= s.userAuthentication(l);
		 
	  for(i=0;i<10;i++)
	  {
		  	  request.setAttribute("mess"+i,q[i].getqn());	  
request.setAttribute("mes"+i,q[i].geta());
request.setAttribute("me"+i,q[i].getb());
	request.setAttribute("m"+i,q[i].getc());
		request.setAttribute("s"+i,q[i].getd());
		
	 	
	  }
		  request.getRequestDispatcher("exam.jsp").forward(request, response);
	  }
} 




  

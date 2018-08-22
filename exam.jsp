<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
   <head>
      <title>EXAM</title>
	  <style>
	  .aa{
	background-color:blue;
	position:absolute;
	
	left:400px;
	border-radius:25%;
	height:50px;
	width:150px;
	font-size:20px;
	color:white;
}


body{
	
font-family: Verdana,sans-serif;
    background-image: url("3.jpg");
	background-size:1600px 800px;
	background-repeat:repeat;

}

.p{
background-color:white;
width:1000px;
height:1600px;
align:center;
position:absolute;
left:300px;
}

h1
{
background-color:white;
}
	  </style>
   </head>
 
 <body>
  <form method="get" action="res">
<h1 align="center" >SCIENCE APTITUDE TEST</h1>
<div class="p">
 <p>1.There are 4 options for each question and only one of them is correct.</p>
 <p>2.There are 10 questions to answer</p>
 <p>3.After answering all the 10 questions,press the submit button to record your answers.</p>
    <%
	int i;
	for(i=0;i<10;i++)
	{    
            out.println("<h4>" + request.getAttribute("mess"+i) + "</h4>");
			out.println("<input type='radio' name='c"+i+"' value='1'>" +request.getAttribute("mes"+i) + "</input><br>");
			out.println("<input type='radio' name='c"+i+"' value='2'>" +request.getAttribute("me"+i) + "</input><br>");
			out.println("<input type='radio' name='c"+i+"' value='3'>" +request.getAttribute("m"+i) + "</input><br>");
			out.println("<input type='radio' name='c"+i+"' value='4'>" +request.getAttribute("s"+i) + "</input><br>");
	
	}
    %>
<br><br>
 <input class="aa" type="submit" value="GET RESULTS!!"></input>
 </form>
   </body>
</html>
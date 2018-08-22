<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
 
<html>
   <head>
      <title>RESULT</title>
	  <style>
	.aa{
        position:absolute;
	top:270px;
	left:600px; 
	
	background-color:powderblue;
	height:200px;
	width:400px;
	font-size:20px;
	color:black;
}

.bb{
	position:absolute;
	 top:270px;
	left:400px;
}


body{
font-family: Verdana,sans-serif;
    background-image: url("s.jpg");
	background-size:1600px 800px;
	background-repeat:no-repeat;
}

h1{
		background-color:powderblue;	
		font-weight: bold;
        font-size: 72px;
}
}
	  </style>
   </head>
 
 <body>
 <h1 align="center">CONGRATULATIONS!!!!!</h1>
 <div class="bb">
<img src="t.jpg" width="200px" height="200px"></img>
 </div>

<div class="aa">
 <% out.println("<h4>STUDENT ID: "+ request.getAttribute("happy") + "</h4>");
	out.println("<h4>STUDENT NAME:" + request.getAttribute("happ") + "</h4>");
out.println("<h4>STUDENT MARK:" + request.getAttribute("hap") + "</h4>");
	%>
</div>
   </body>
</html>
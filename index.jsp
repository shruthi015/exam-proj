<html>
<head>
<style>
.aa{
height:400;
width:400;
border:3px solid black;
border-radius:15%;
position:absolute;
top:150px;
background-color:powderblue;
color:blue;
padding:70px;
align:center;
}
input{
	width:200px;
height:30px;
margin-right:30px;
}

.kk{
border:3px solid black;
border-radius:15%;
height:400px;
width:550px;
position: absolute;
top: 200px;
left:900px;
float:left;
animation-name:mple;
animation-duration: 20s;
background-image:url(13.jpg);
animation-iteration-count: infinite;
}

@keyframes mple {
   0% {background-image:url(13.jpg);}
   25% {background-image:url(10.jpg);}
   75% {background-image:url(11.jpeg);}
   100% {background-image:url(12.jpg);}
}

body{
	
font-family: Verdana,sans-serif;
    background-image: url("mc.jpg");
	background-size:1600px 800px;
	background-repeat:no-repeat;
	
}

.dd{
position:absolute;
left:500px;
width:500px;
height:100px;
background-color:powderblue;
color:blue;		
}

.xx{
	position:absolute;
left:400px;
	border-radius:50%;
}

.ff{
	color:powderblue;
	background-color:blue;

	position:absolute;
	
	left:250px;
	border-radius:25%;
	height:60px;
	width:100px;
	font-size:20px;

}

</style>
</head>
<body>
<div class="xx">
<img src="dp.jpg" alt="pic" height="100px" width="100px"></img>
</div>
<div class="dd">
<h1 align="center">BRAIN STROMERS</h1>
</div>
<form method= "post" action= "hell" >
<div class="aa">
<form >
<h1 align="center" >LOGIN FORM</h1>
<br>
ID  :  &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp <input type="text" name="id" align="center" required></input><br><br><br>
NAME:   &nbsp &nbsp &nbsp &nbsp &nbsp <input type="text" name="name" required></input><br><br><br>
E-MAIL:  &nbsp &nbsp &nbsp &nbsp <input type="email" name="email" required></input> <br>
 </form>
<br>
<br>
<div style="text-align:center">  
    <input class="ff" type="submit" value="submit" />  
</div> 
</div>
<div class="kk">
</div>

</form>
</body>
</html>
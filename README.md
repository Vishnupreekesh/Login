# Login
<html>
  <head>
  <title>Welcome To Login Form</title>
  <script>
    
    function login()
	{
		var uname = document.getElementById("username").value;
		var pwd = document.getElementById("pwd1").value;
		var filter = "(?=.\d)(?=.[a-z])(?=.*[A-Z]).{8,}";
		if(uname =='')
		{
			alert("please enter user name.");
		}
		else if(pwd=='')
		{
        	alert("enter the password");
		}
		else if(!filter.test(pwd))
		{
			alert("Enter valid password.");
		}
		else if(pwd.length < 8 )
		{
			alert("Password min length is 8.");
		}
		else
		{
	alert('Thank You for Login');
  //Redirecting to other page or webste code or you can set your own html page.
       // window.location = "https://www.campuslife.co.in";
			}
	}
	//Reset Inputfield code.
	function clearFunc()
	{
		document.getElementById("username").value="";
		document.getElementById("pwd1").value="";
	}	
	
    
    </script>
  <style type="text/css">
    
    
  body
   {
     margin:0px; background-color:#FFDAB9; color:#00008B; font-family:Arial, Helvetica, sans-serif;
   }
   #main
   {
     width:600px; height:260px; margin-left:auto; margin-right:auto; border-radius:5px; padding-left:10px; margin-top:100px;
     border-top:3px double #f1f1f1; border-bottom:3px double #f1f1f1; padding-top:20px;
   }
   #main table
   {
     font-family:"Comic Sans MS", cursive;
   } 

  /* css code for textbox */
  #main .tb

  {
    height:28px; width:230px; border:1px solid #27a465; color:#DA70D6; font-weight:bold; border-left:5px solid #f7f7f7; opacity:0.9;
  }

   /* css code for button*/

   #main .btn
   {
    width:80px; height:32px; outline:none;  font-weight:bold; border:0px solid #27a465; text-shadow: 0px 0.5px 0.5px #fff;	
    border-radius: 2px; font-weight: 600; color: #27a465; letter-spacing: 1px; font-size:14px; -webkit-transition: 1s; -moz-transition: 1s; transition: 1s;
   }
  
   #main .btn:hover

   {
    background-color:#FF1493; outline:none;  border-radius: 2px; color:#f1f1f1; border:1px solid #f1f1f1;
   }

   </style>
  </head>

	<body>
	<!-- Main div code -->
	<div id="main">
	<div class="h-tag">
	<h1 align="center">Infinity Login</h1>
	</div>
	<!-- Login box -->
	<div class="login">
	<table cellspacing="2" align="center" cellpadding="10" border="0">
	<tr>
	<td>Enter User Name :</td>
	<td><input type="text" placeholder="Enter user name here" id="username" class="tb" /></td>
	</tr>
	<tr>
	<td>Enter Password :</td>
	<td><input type="password" placeholder="Enter Password here" id="pwd1" class="tb" /></td>
	</tr>
	<tr>
	<td></td>
	<td>
	<input type="submit" value="Reset" onclick="clearFunc()" class="btn" />
	<input type="submit" value="Login" class="btn" onClick="login()" /></td>
	</tr>
	</table>
	</div>
  	 <!-- login box div ending here.. -->
	</div>
	<!-- Main div ending here... -->
    
  </body>
  </html>

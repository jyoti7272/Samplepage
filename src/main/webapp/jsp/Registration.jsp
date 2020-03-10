<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="../css/Reg.css">
<link rel="stylesheet" type="text/css"
	href="../fonts/font-awesome-4.7.0/css/font-awesome.min.css">
</head>
<body>

	<div id="login-box">
		<div class="left">
			<h1>Sign up</h1>
			<form action="./user">
			<input type="text" name="userName" placeholder="Username" /> <input
				type="text" name="email" placeholder="E-mail" /> <input
				type="password" name="pwd" placeholder="Password" /> <input
				type="password" name="password2" placeholder="Retype password" />
				 <input type="submit" name="signup_submit" value="Sign me up" />
                 <input type="button" name="Login_Page" value="Already Signup" href="login.jsp" />
                 </form>
		</div>



		<div class="right">
			<span class="loginwith">Sign in with<br />social network
			</span>

			<button class="social-signin facebook">Log in with facebook</button>
			<button class="social-signin twitter">Log in with Twitter</button>
			<button class="social-signin google">Log in with Google+</button>
			<div class="or">OR</div>
			<div class="text-center p-t-136">
				<a class="txt2" href="#"> 
				
				<a href="Login.jsp">Go TO Login</a> <i
					class="fa fa-long-arrow-right m-l-5" aria-hidden="true"></i>
				</a>
			</div>
		</div>

	</div>

</body>
</html>
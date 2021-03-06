<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Auction House - Login</title>
	<link href="assets/css/bootstrap.min.css" rel="stylesheet">
	<link href="assets/css/datepicker3.css" rel="stylesheet">
	<link href="assets/css/styles.css" rel="stylesheet">
	<link href="assets/css/font-awesome.min.css" rel="stylesheet">
	<!--[if lt IE 9]>
	<script src="js/html5shiv.js"></script>
	<script src="js/respond.min.js"></script>
	<![endif]-->
</head>
<body>
	<div class="row">
		<div class="col-xs-10 col-xs-offset-1 col-sm-8 col-sm-offset-2 col-md-4 col-md-offset-4">
			<div class="login-panel panel panel-default">
				<img src="assets/images/auctionhouse.jpg" alt="img">
				<div class="panel-heading">Auction House-Log in panel</div>
				<div class="panel-body">
					<form role="form" action="login" method="POST">
						<fieldset>
							<div class="form-group">
								<input class="form-control" placeholder="Enter username" name="username" type="email" autofocus="">
							</div>
							<div class="form-group">
								<input class="form-control" placeholder="Enter password" name="password" type="password">
							</div>
							
							<button type="submit" class="btn btn-success">Login</button>
							<button type="reset" class="btn btn-primary">Reset</button>
					</form>
					<hr>
					Don't have an Account yet??
					<a href="register.jsp" class="btn btn-success">Register</a>
					
				</div>
			</div>
		</div><!-- /.col-->
	</div><!-- /.row -->	
	

<script src="assets/js/jquery-1.11.1.min.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
</body>
</html>

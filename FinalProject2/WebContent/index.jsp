<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Index </title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/grayscale.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link
	href="http://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic"
	rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

	<!-- Navigation -->
	<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-main-collapse">
				<i class="fa fa-bars"></i>
			</button>
			<a class="navbar-brand page-scroll" href=mainMenu.jsp> <i
				class="fa fa-play-circle"></i> <span class="light">Register/</span>
				Login
			</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div
			class="collapse navbar-collapse navbar-right navbar-main-collapse">
			<ul class="nav navbar-nav">
				<!-- Hidden li included to remove active class from about link when scrolled up past about section -->
				<li class="hidden"><a href="#page-top"></a></li>
				<li><a class="page-scroll" href="#about">Learn</a></li>
				<li><a class="page-scroll" href="#join">Join</a></li>
				<li><a class="page-scroll" href="#contact">Follow</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container --> </nav>

	<!-- Intro Header -->
	<header class="intro">
	<div class="intro-body">
		<div class="container">
			<div class="row">
				<div class="col-md-8 col-md-offset-2">
					<h1 class="brand-heading">Common Vision</h1>
					<p class="intro-text">
						We Joined the Movement!<br>Let's Keep the Momentum!
					</p>
					<a href="#about" class="btn btn-circle page-scroll"> <i
						class="fa fa-angle-double-down animated"></i>
					</a>
				</div>
			</div>
		</div>
	</div>
	</header>

	<!-- About Section -->
	<section id="about" class="container content-section text-center">
	<div class="row">
		<div class="col-lg-8 col-lg-offset-2">
			<h2>Welcome Common Vision Alumni!</h2>
			<p>Welcome! You are an important member of the nearly 500+ alumni
				of Common Vision living and traveling all around the world.
				Regardless of where you live, all Common Visioners have the
				opportunity to be active members of the Global Common Vision Alumni
				Group and the food justice community. The Common Vision Alumni Board
				and the Common Vision team work together to design, promote and
				implement comprehensive opportunities and events which appeal to
				alumni. Whether social, cultural, environmental or service-oriented,
				you will be sure to find your place in alumni activities. But the
				first step is staying connected and getting involved!</p>

		</div>
	</div>
	</section>

	<!-- Download Section -->
	<section id="download" class="content-section text-center">
	<div class="download-section">
		<div class="container">
			<div class="col-lg-8 col-lg-offset-2">
				<h2>Get Connected!</h2>
				<p>Join the Common Vision Alumni Group!</p>
				<a href="register.jsp" class="btn btn-default btn-lg">Register
					Today!</a>
			</div>
		</div>
	</div>
	</section>

	<!-- Contact Section -->
	<section id="contact" class="container content-section text-center">
	<div class="row">
		<div class="col-lg-8 col-lg-offset-2">
			<h2>Contact Common Vision Alumni</h2>
			<p>Feel free to email us to provide some feedback , give us
				suggestions for new features and events, or to just say hello!</p>
			<p>
				<a href="mailto:khadijahhall12@gmail.com">alumni@commonvision.org</a>
			</p>
			<ul class="list-inline banner-social-buttons">
				<li><a href="https://twitter.com/fruittreetour"
					class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i>
						<span class="network-name">Twitter</span></a></li>
				<li><a
					href="https://www.youtube.com/channel/UCOtPEaTJSwU5u61nhN-OYiw"
					class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i>
						<span class="network-name">YouTube</span></a></li>
				<li><a href="https://www.facebook.com/plantfruittrees/"
					class="btn btn-default btn-lg"><i
						class="fa fa-google-plus fa-fw"></i> <span class="network-name">Facebook</span></a>
				</li>
			</ul>
		</div>
	</div>
	</section>

	<!-- Map Section -->
	<div id="map"></div>
	
	<!-- Footer -->
	<footer>
	<div class="container text-center">
		<p>Copyright &copy; Innovate.Refine.Repeat. 2016</p>
	</div>
	</footer>

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script src="js/jquery.easing.min.js"></script>

	<!-- Google Maps API Key - Use your own API key to enable the map feature. More information on the Google Maps API can be found at https://developers.google.com/maps/ -->

	<!-- Custom Theme JavaScript -->
	<script src="js/grayscale.js"></script>

	${request.Scope.LoginServlet.msg } ${request.Scope.LoginServlet.color }

</body>

</html>

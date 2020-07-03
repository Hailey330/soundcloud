<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Deerhost Template">
<meta name="keywords" content="Deerhost, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Upload your music &amp; audio and share it with the world. on SoundCloud</title>

<!-- Google Font -->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,600,700,800,900&display=swap" rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="/soundcloud/deerhost/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="/soundcloud/deerhost/css/font-awesome.min.css" type="text/css">
<link rel="stylesheet" href="/soundcloud/deerhost/css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="/soundcloud/deerhost/css/flaticon.css" type="text/css">
<link rel="stylesheet" href="/soundcloud/deerhost/css/owl.carousel.min.css" type="text/css">
<link rel="stylesheet" href="/soundcloud/deerhost/css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="/soundcloud/deerhost/css/style.css" type="text/css">

<link rel="stylesheet" type="text/css" href="/soundcloud/login/css/main.css">

<link rel="stylesheet" href="/soundcloud/css/upload.css">
<link rel="stylesheet" href="/soundcloud/css/uploadHtml.css">

</head>

<body>
	<!-- Offcanvas Menu Begin -->
	<div class="offcanvas__menu__overlay"></div>
	<div class="offcanvas__menu__wrapper">
		<div class="canvas__close">
			<span class="fa fa-times-circle-o"></span>
		</div>
		<div class="offcanvas__logo">
			<a href="#"><img src="img/logo.png" alt=""></a>
		</div>
		<nav class="offcanvas__menu mobile-menu">
			<ul>
				<li><a href="/soundcloud/main?cmd=home">Home</a></li>
				<li><a href="/soundcloud/board?cmd=stream">Stream</a></li>
				<li><a href="/soundcloud/board?cmd=library">Library</a></li>
				<li><a href="/soundcloud/board?cmd=fileUpload">Upload</a></li>
				<li><a href="#">YOURS</a>
					<ul class="dropdown">
						<li><a href="/soundcloud/board?cmd=profile">Profile</a></li>
						<li><a href="/soundcloud/board?cmd=library">Likes</a></li>
						<li><a href="/soundcloud/board?cmd=library">Following</a></li>
						<li><a href="/soundcloud/users?cmd=logout">Sign out</a></li>
					</ul></li>
			</ul>
		</nav>
		<div id="mobile-menu-wrap"></div>
		<div class="offcanvas__auth">
			<ul>
				<li><a href="#"><span class="icon_chat_alt"></span> Live chat</a></li>
				<li><a href="#"><span class="fa fa-user"></span> Login / Register</a></li>
			</ul>
		</div>
		<div class="offcanvas__info">
			<ul>
				<li><span class="icon_phone"></span> +1 123-456-7890</li>
				<li><span class="fa fa-envelope"></span> Support@gmail.com</li>
			</ul>
		</div>
	</div>
	<!-- Offcanvas Menu End -->

	<!-- Header Section Begin -->
	<header class="header-section header-normal">

		<div class="container">
			<div class="row header__front">
				<div class="col-lg-1 col-md-1">
					<div class="header__logo">
						<a href="/soundcloud/main?cmd=home"><img src="/soundcloud/deerhost/img/logo-white-cloud.png" alt=""></a>
					</div>
				</div>
				<div class="col-lg-9 col-md-9">
					<nav class="header__menu">
						<ul>
							<li><a href="/soundcloud/main?cmd=home">Home</a></li>
							<li><a href="/soundcloud/board?cmd=stream">Stream</a></li>
							<li><a href="/soundcloud/board?cmd=library">Library</a></li>
							<li><a href="/soundcloud/board?cmd=fileUpload">Upload</a></li>
							<li><a href="#">YOURS</a>
								<ul class="dropdown">
									<li><a href="/soundcloud/board?cmd=profile">Profile</a></li>
									<li><a href="/soundcloud/board?cmd=library">Likes</a></li>
									<li><a href="/soundcloud/board?cmd=library">Following</a></li>
									<li><a href="/soundcloud/users?cmd=logout">Sign out</a></li>
								</ul></li>
						</ul>
					</nav>
				</div>
			</div>
			<div class="canvas__open">
				<span class="fa fa-bars"></span>
			</div>
		</div>
	</header>
	<!-- Header End -->

	<!-- Blog Section Begin -->
	<section class="blog-section">
		<div class="container">
			<div class="col-lg-13">
				<form action="/soundcloud/users?cmd=profileUploadProc" method="post" enctype="multipart/form-data">
					<div class="l-main-upload">
						<div class="uploadMain">
							<div class="uploadBackground"></div>
							<div class="uploadMain__chooserContainer sc-border-light g-shadow-light">
								<div class="uploadMain__beforeUploadChooser">
									<div class="uploadMain__content">
										<h1 class="uploadMain__title sc-font-light ">Upload your Image!</h1>
										<div class="uploadMain__chooser">
											<div class="chooseFiles">

												<div class="ds-image-box" style="margin: 0 auto 30px;">
													<img id="img__wrap" onerror="this.src='/soundcloud/image/userProfile.png'" src="${sessionScope.principal.userProfile}" width="260px" height="260px" />
												</div>
													<label class="chooseFiles__button sc-button sc-button-cta sc-button-large sc-button-color" style="min-width: 300px">Choose image to upload 
													<input type="file" id="userProfile" name="userProfile" class="chooseFiles__input sc-visuallyhidden" />
													</label> <br> 
													<input type="hidden" name="userId" value="${sessionScope.principal.id}" /> 
													<label class="chooseFiles__button sc-button sc-button-cta sc-button-large" style="min-width: 300px">Upload 
													<input type="submit" class="chooseFiles__input sc-visuallyhidden">
													</label>
											</div>
										</div>
									</div>

								</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</section>
	<!-- Blog Section End -->


	<!-- Js Plugins -->
	<script src="/soundcloud/deerhost/js/jquery-3.3.1.min.js"></script>
	<script src="/soundcloud/deerhost/js/jquery.slicknav.js"></script>
	<script src="/soundcloud/deerhost/js/bootstrap.min.js"></script>
	<script src="/soundcloud/deerhost/js/owl.carousel.min.js"></script>
	<script src="/soundcloud/deerhost/js/main.js"></script>
	<script src="/soundcloud/js/profilePreview.js"></script>

</body>

</html>
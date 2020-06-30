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
<title>Your stream on SoundCloud</title>

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

<link rel="stylesheet" href="/soundcloud/music/style.css">

</head>

<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<!-- Offcanvas Menu Begin -->
	<div class="offcanvas__menu__overlay"></div>
	<div class="offcanvas__menu__wrapper">
		<div class="canvas__close">
			<span class="fa fa-times-circle-o"></span>
		</div>
		<div class="offcanvas__logo">
			<a href="#"><img src="#" alt=""></a>
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
		<div class="track-show-page">
			<div class="track-show-container">
				<div class="track-show-detail">
					<div class="track-sd-top">
						<div class="ts-play"></div>
						<div class="track-sd-info">
							<a href="/#/users/1">
								<div class="track-sd-uploader">Diplo</div>
							</a>
							<div class="track-sd-title">Get It Right (Feat. Mø &amp; Goldlink) Remix</div>
						</div>
					</div>
					<div class="track-sd-bott">
						<div>
							<div id="track-1-waveform">
								<wave style="display: block; position: relative; user-select: none; height: 100px; overflow: auto hidden;"> <wave
									style="position: absolute; z-index: 3; left: 0px; top: 0px; bottom: 0px; overflow: hidden; width: 0px; display: block; box-sizing: border-box; border-right: 0px solid rgb(51, 51, 51); pointer-events: none;">
								<canvas width="671" height="100" style="position: absolute; left: 0px; top: 0px; bottom: 0px; height: 100%; width: 671px;"></canvas>
								</wave>
								<canvas width="671" height="100" style="position: absolute; z-index: 2; left: 0px; top: 0px; bottom: 0px; height: 100%; pointer-events: none; width: 671px;"></canvas>
								</wave>
								<audio preload="auto" src="https://s3.us-west-1.amazonaws.com/vibeskypro/tracks/audios/000/000/001/original/Get_It_Right_%28Feat._M%C3%B8___Goldlink%29_Remix.mp3?1530392146"
									style="width: 100%;"></audio>
							</div>
						</div>
					</div>
				</div>
				<div class="track-show-image-container">
					<img src="https://s3.us-west-1.amazonaws.com/vibeskypro/tracks/images/000/000/001/original/Screenshot_20180402-234123.png?1550293351">
				</div>
			</div>
			<div class="track-show-container-bottom">
				<div class="tscb-left">
					<div class="track-show-comment-bar">
						<div class="comment-container">
							<div class="comment-form">
								<form class="cform">
									<div class="comment-form-user">
										<img src="https://s3.us-west-1.amazonaws.com/vibeskypro/users/images/000/000/008/original/modernistic_surreal_cubism_pepe.png?1545435612">
									</div>
									<div class="comment-input-container">
										<input class="comment-input" type="text" placeholder="Write a Comment" value="">
									</div>
									<input type="submit" class="h-input">
								</form>
							</div>
							<div class="comment-buttons"></div>
						</div>
					</div>
					<div class="button-bar">
						<div class="controller-btn like-btn">like</div>
					</div>
					<div class="ts-uploader-ci">
						<div class="ts-uc-left">
							<div class="ts-artist-circle">
								<a href="/#/users/1"><img src="https://s3.us-west-1.amazonaws.com/vibeskypro/users/images/000/000/001/original/diplo.jpg?1530473530"></a>
							</div>
							<a href="/#/users/1"><div class="ts-artist-name">Diplo</div></a>
							<div class="ts-follow-btn">Follow</div>
						</div>
						<div class="ts-uc-right">
							<div class="ts-track-description">i found the password woot woot</div>
							<div class="track-show-comment-index">
								<div class="tsc-container">
									<div class="posted-comment">
										<a href="/#/users/4"><div class="comment-uploader-img">
												<img src="https://s3.us-west-1.amazonaws.com/vibeskypro/users/images/000/000/004/original/beatle.png?1530473994">
											</div></a>
										<div class="comment-uploader-body">
											<a href="/#/users/4"><div>The Beatles</div></a>
											<div>Wow love it!</div>
										</div>
										<div></div>
									</div>
									<div class="posted-comment">
										<a href="/#/users/5"><div class="comment-uploader-img">
												<img src="https://s3.us-west-1.amazonaws.com/vibeskypro/users/images/000/000/005/original/MGMT_Horizontal_logo.png?1530473729">
											</div></a>
										<div class="comment-uploader-body">
											<a href="/#/users/5"><div>MGMT</div></a>
											<div>I'm literally dying because it's so good.</div>
										</div>
										<div></div>
									</div>
									
										<div></div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="tscb-sidebar">
					<div class="ad-container">
						<a href="https://github.com/Mpompili" target="_blank"><img src="https://res.cloudinary.com/mpompili/image/upload/v1526013412/gotogithub.jpg"></a>
					</div>
					<div class="ad-container">
						<a href="https://www.linkedin.com/in/michael-pompili-916a0837/" target="_blank"><img src="https://res.cloudinary.com/mpompili/image/upload/v1526335358/linkedinad.jpg"></a>
					</div>
					<div class="extraspace"></div>
				</div>
			</div>
	</section>
	<!-- Blog Section End -->



	<!-- Js Plugins -->
	<script src="/soundcloud/deerhost/js/jquery-3.3.1.min.js"></script>
	<script src="/soundcloud/deerhost/js/bootstrap.min.js"></script>
	<script src="/soundcloud/deerhost/js/jquery.slicknav.js"></script>
	<script src="/soundcloud/deerhost/js/owl.carousel.min.js"></script>
	<script src="/soundcloud/deerhost/js/main.js"></script>

	<script src="/soundcloud/music/js/jquery.min.js"></script>
	<script src="/soundcloud/music/js/poca.bundle.js"></script>
	<script src="/soundcloud/music/js/default-assets/active.js"></script>


</body>

</html>
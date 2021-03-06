<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="kr">

<head>
<meta charset="UTF-8">
<meta name="description" content="">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- 상위 4줄은 반드시 head 최상위에 위치해야함. -->

<!-- Title -->
<title>GAMESPOT | Welcome</title>

<!-- Favicon (브라우저 탭에 로고 노출) -->
<link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/resources/img/core-img/favicon.ico">

<!-- Stylesheet(css파일 따로 작성, 임포트 해서 적용.) -->
<link href="${pageContext.request.contextPath}/resources/style.css" rel="stylesheet" type="text/css">

</head>
<body>	

    <!-- Preloader (로딩 애니메이션)-->
    <div class="preloader d-flex align-items-center justify-content-center">
        <div class="spinner">
            <div class="bounce1"></div>
            <div class="bounce2"></div>
            <div class="bounce3"></div>
        </div>
    </div>

    <!--  Header 영역 시작  -->
    <header class="header-area wow fadeInDown" data-wow-delay="500ms">
        <!-- Header 상단 영역 -->
        <div class="top-header-area">
            <div class="container h-100">
                <div class="row h-100 align-items-center">
                    <div class="col-12 d-flex align-items-center justify-content-between">
                        <!-- Logo 영역 -->
                        <div class="logo">
                            <a href="home.do"><img src="${pageContext.request.contextPath}/resources/img/core-img/logo2.png" alt="gamespot"></a>
                        </div>
		
                        <!-- Search & Login 영역 -->
                        <div class="search-login-area d-flex align-items-center">
                            <!-- 상단 Search 영역 -->
                            <div class="top-search-area"> 
                                <form action="#" method="post">
                                    <input type="search" name="top-search" id="topSearch" placeholder="Search">
                                    <button type="submit" class="btn"><i class="fa fa-search"></i></button>
                                </form>
                            </div>
                            <!-- Login 영역 -->
                            <div class="login-area">
                            
							<!-- login session -->
                                   <c:choose>
                             <c:when test="${sessionScope.id eq null }">
                                <a href="loginView"><span>Login / Register</span> <i class="fa fa-lock" aria-hidden="true"></i></a>
                            </c:when>
                            <c:otherwise>
                            <div class="login-area dropdown">
                                <a href="/project/myInfo.do?id=${sessionScope.id }"><span>Welcome, ${sessionScope.name }</span> <i class="fas fa-user" aria-hidden="true"></i><i class="fa fa-caret-down"></i></a>
                                <div class="dropdown-content">
                                    
                                    <a href="/project/logout.do"><span>로그아웃</span><i class="fas fa-sign-out-alt" aria-hidden="true"></i></a>
                                </div>
                            </div> 
                            </c:otherwise>
                            </c:choose>

                            
                            <!--
                            <div class="login-area dropdown">
                                <a href="signin.html"><span>Welcome, Username</span> <i class="fas fa-user" aria-hidden="true"></i><i class="fa fa-caret-down"></i></a>
                                <div class="dropdown-content">
                                    <a href=""><span>로그아웃</span><i class="fas fa-sign-out-alt" aria-hidden="true"></i></a>
                                </div>
                            </div> -->
                            
                            </div>
                         
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!-- Navbar 영역 -->
        <div class="gamespot-main-menu" id="sticker">
            <div class="classy-nav-container breakpoint-off">
                <div class="container">
                    <!-- Menu -->
                    <nav class="classy-navbar justify-content-between" id="gamespotNav">

                        <!-- Navbar Toggler(모바일 화면시) -->
                        <div class="classy-navbar-toggler">
                            <span class="navbarToggler"><span></span><span></span><span></span></span>
                        </div>

                        <!-- Menu -->
                        <div class="classy-menu">

                            <!-- Close Button -->
                            <div class="classycloseIcon">
                                <div class="cross-wrap"><span class="top"></span><span class="bottom"></span></div>
                            </div>

                            <!-- Nav Start -->
                            <div class="classynav">
                                <ul>
                                    <li><a href="home.do">Home</a></li>
                                    <li><a href="store.do">Store</a></li>                          
                                    <li><a href="reviews">Reviews</a></li>
                                </ul>
                            </div>
                            <!-- Nav End -->
                        </div>
                        <!-- Nav 소셜미디어 아이콘 -->
                        <div class="top-social-info">
   							<a href="https://www.facebook.com/GamespotWeb-440364573418626"  target="_blank" data-toggle="tooltip" data-placement="top" title="Facebook">
                        		<i class="fa fa-facebook" aria-hidden="true"></i>
                     		</a> 
                     		<a href="https://twitter.com/hPKPXzq0fRwNZU3" target="_blank" data-toggle="tooltip" data-placement="top" title="Twitter">
                       			<i class="fa fa-twitter" aria-hidden="true"></i>
                     		</a> 
                     		<a href="https://instagram.com/game__spot?igshid=1xachyxg6ydfl" target="_blank" data-toggle="tooltip" data-placement="top" title="Instagram">
                        		<i class="fa fa-instagram" aria-hidden="true"></i>
                     		</a>
                     	</div>
                    </nav>
                </div>
            </div>
        </div>
    </header>
    <!--  Header Area End  -->


	<!--  Hero Area Start  -->
	<div class="hero-area">
		<!-- Hero Post Slides -->
		<div class="hero-post-slides owl-carousel">
		<c:forEach var="g" items="${mainlist }">
			<div class="single-slide bg-img bg-overlay" style="background-image: url('/project/resources/image/${g.path }');">
				<!-- Blog Content -->
				<div class="container h-100">
					<div class="row h-100 align-items-center">
						<div class="col-12 col-lg-9">
							<div class="blog-content" data-animation="fadeInUp" data-delay="100ms">
								<h2 data-animation="fadeInUp" data-delay="400ms">${g.title }</h2>
								<p data-animation="fadeInUp" data-delay="700ms">${g.info }</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</c:forEach>
		</div>
	</div>
	<!-- Hero Area End -->


	<!-- Monthly Picks Area Start -->
	<section class="monthly-picks-area section-padding-100 bg-pattern">
		<div class="container">
			<div class="row">
				<div class="col-12">
					<div class="left-right-pattern"></div>
				</div>
			</div>
		</div>

		<div class="container">
			<div class="row">
				<div class="col-12">
					<!-- Title -->
					<h2 class="section-title mb-70 wow fadeInUp" data-wow-delay="100ms">This Month’s Pick</h2>
				</div>
			</div>

			<div class="row">
				<div class="col-12">
					<ul class="nav nav-tabs wow fadeInUp" data-wow-delay="300ms" id="myTab" role="tablist">
						<li class="nav-item"><a class="nav-link active" id="popular-tab" data-toggle="tab" href="#popular" role="tab" aria-controls="popular" aria-selected="true">Popular</a></li>
						<li class="nav-item"><a class="nav-link" id="latest-tab" data-toggle="tab" href="#latest" role="tab" aria-controls="latest" aria-selected="false">Latest</a></li>
					</ul>
				</div>
			</div>
		</div>

		<div class="tab-content wow fadeInUp" data-wow-delay="500ms" id="myTabContent">
			<div class="tab-pane fade show active" id="popular" role="tabpanel" aria-labelledby="popular-tab">
				<!-- Popular Games Slideshow -->
				<div class="popular-games-slideshow owl-carousel">
					<c:forEach var="g"  items="${popularList }">
					<div class="single-games-slide">
                        <img src="${pageContext.request.contextPath}/resources/imageMain/${g.path }" alt="">
                        <div class="slide-text">
                            <a href="${pageContext.request.contextPath}/gamesingle.do?title=${g.title }" class="game-title">${g.title }</a>
                            <div class="meta-data">
                                <a href="#">User: 9.1/10</a>
                                <a href="${pageContext.request.contextPath}/categorylist.do?genrename=${g.genrename }">${g.genrename }</a>
                            </div>
                        </div>
                    </div>
                	</c:forEach>
				</div>
			</div>
			
			<div class="tab-pane fade" id="latest" role="tabpanel" aria-labelledby="latest-tab">
				<!-- Latest Games Slideshow -->
				<div class="latest-games-slideshow owl-carousel">
				<c:forEach var="g"  items="${latestList }">
					<div class="single-games-slide">
                        <img src="${pageContext.request.contextPath}/resources/imageMain/${g.path }" alt="">
                        <div class="slide-text">
                            <a href="${pageContext.request.contextPath}/gamesingle.do?title=${g.title }" class="game-title">${g.title }</a>
                            <div class="meta-data">
                                <a href="#">User: 9.1/10</a>
                                <a href="${pageContext.request.contextPath}/categorylist.do?genrename=${g.genrename }">${g.genrename }</a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
				</div>
			</div>
		</div>
		</div>
	</section>
	<!-- Monthly Picks Area End -->

  <!-- Video Area Start -->
   <div class="gamespot-video-area section-padding-100 bg-pattern2">
      <div class="container">
         <div class="row no-gutters">
            <div class="col-12 col-md-6 col-lg-4">
               <div class="gamespot-nav-btn">
                  <div class="nav flex-column" id="video-tab" role="tablist" aria-orientation="vertical">
                     <c:forEach var="i" items="${highlist }" varStatus="status">
                        <a class="${status.index == 0 ? 'nav-link active show' : 'nav-link'}" id="video${status.index }" data-toggle="pill" href="#$video-{status.index }" role="tab" aria-selected="${status.index == 0 ? true : false}" aria-controls="${status.index }" > 
                           <!-- Single Video Widget -->
                           <div class="single-video-widget d-flex wow fadeInUp" data-wow-delay="100ms">
                              <div class="video-thumbnail">
                                 <img src="${pageContext.request.contextPath}/resources/image/${i.path }" alt="">
                              </div>
                              <div class="video-text">
                                 <p class="video-title mb-0">${i.title } </p>
                                 <span>${i.genrename }</span>
                              </div>
                              <div class="video-rating">${i.price }</div>
                           </div>
                        </a> 
                     </c:forEach>
                  </div>
               </div>
            </div>

            <div class="col-12 col-md-6 col-lg-8">
               <div class="tab-content" id="video-tabContent">
                  <c:forEach var="i" items="${highlist }" varStatus="status">
                     <div class="${status.index == 0 ? 'tab-pane fade show active' : 'tab-pane fade'}" id="${status.index }" role="tabpanel" aria-labelledby="${status.index }">
                        <div class="video-playground bg-img" style="background-image: url(${pageContext.request.contextPath}/resources/image/;">
                           <!-- Play Button -->
                           <div class="play-btn">
                              <a href="${i.link }" class="play-button"> 
                              	<img src="${pageContext.request.contextPath}/resources/img/core-img/play.png" alt="">
                              </a>
                           </div>
                        </div>
                     </div>
                  </c:forEach>
               </div>
            </div>
         </div>
      </div>
   </div>
   <!-- Video Area End -->

	<!-- Footer Area Start -->
	<footer class="footer-area">
		<!-- Main Footer Area -->
		<div class="main-footer-area section-padding-100-0">
			<div class="container">
				<div class="row">
					<!-- Single Footer Widget -->
					<div class="col-12 col-sm-6 col-lg-3">
						<div class="single-footer-widget mb-70 wow fadeInUp" data-wow-delay="100ms">
							<div class="widget-title">
								<a href="home.do">
									<img src="${pageContext.request.contextPath}/resources/img/core-img/logo2.png"alt="">
								</a>
							</div>
							<div class="widget-content">
								<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
									Mauris velit arcu, scelerisque dignissim massa quis, mattis
									facilisis erat. Aliquam erat volutpat. Sed efficitur diam ut
									interdum ultricies.</p>
							</div>
						</div>
					</div>

					<!-- Single Footer Widget -->
					<div class="col-12 col-sm-6 col-lg-3">
						<div class="single-footer-widget mb-70 wow fadeInUp" data-wow-delay="300ms">
							<div class="widget-title">
								<h4>Game Reviews</h4>
							</div>
							<div class="widget-content">
								<nav>
									<ul>
										<li><a href="#">Doom</a></li>
										<li><a href="#">Grand Theft Auto</a></li>
										<li><a href="#">Bloodborne</a></li>
										<li><a href="#">God of war</a></li>
										<li><a href="#">Persona 5</a></li>
									</ul>
								</nav>
							</div>
						</div>
					</div>
					
					<!-- Single Footer Widget -->
					<div class="col-12 col-sm-6 col-lg-3">
						<div class="single-footer-widget mb-70 wow fadeInUp"
							data-wow-delay="500ms">
							<div class="widget-title">
								<h4>Usefull Links</h4>
							</div>
							<div class="widget-content">
								<nav>
									<ul>
										<li><a href="https://store.steampowered.com/" target="_blank">Steam</a></li>
										<li><a href="https://store.playstation.com/" target="_blank">PlayStation</a></li>
										<li><a href="http://blizzard.com" target="_blank">Blizzard Entertainment</a></li>
										<li><a href="https://www.origin.com/" target="_blank">Origin</a></li>
									</ul>
								</nav>
							</div>
						</div>
					</div>

					<!-- Single Footer Widget -->
					<div class="col-12 col-sm-6 col-lg-3">
						<div class="single-footer-widget mb-70 wow fadeInUp" data-wow-delay="700ms">
							<div class="widget-title">
								<h4>What’s new</h4>
							</div>
							<div class="widget-content">
								<nav>
								<c:forEach var="g" items="${latestList }">
									<ul>
										<li><a href="${pageContext.request.contextPath}/gamesingle.do?title=${g.title }">${g.title }</a></li>
									</ul>
								</c:forEach>
								</nav>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="copywrite-content">
			<div class="container h-100">
				<div class="row h-100 align-items-center">
					<div class="col-12 col-sm-5">
						<!-- Copywrite Text -->
						<p class="copywrite-text"> Copyright &copy; All rights reserved | This Website is made with
							<i class="fa fa-heart-o" aria-hidden="true"></i> by Team2
						</p>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<!--  Footer Area End  -->

	<!--  All Javascript Script  -->
	<!-- jQuery-2.2.4 js -->
	<script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-2.2.4.min.js"></script>
	<!-- Popper js -->
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap/popper.min.js"></script>
	<!-- Bootstrap js -->
	<script src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.min.js"></script>
	<!-- All Plugins js -->
	<script src="${pageContext.request.contextPath}/resources/js/plugins/plugins.js"></script>
	<!-- Active js -->
	<script src="${pageContext.request.contextPath}/resources/js/active.js"></script>
</body>
</html>
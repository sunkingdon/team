<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="kr">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- 상위 4줄은 반드시 head 최상위에 위치해야함. -->

    <!-- Title -->
    <title>GAMESPOT | Reviews</title>

    <!-- Favicon (브라우저 탭에 로고 노출) -->
    <link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/resources/img/core-img/favicon.ico">

    <!-- Stylesheet(css파일 따로 작성, 임포트 해서 적용.) -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/reviews.css">


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

    <!-- ##### Header 영역 시작 ##### -->
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
                            <c:otherwise><a href="/project/myInfo.do?id=${sessionScope.id }">${sessionScope.name } 접속중</a>
                            <button onclick="location.href='/project/logout'">로그아웃</button>
                            </c:otherwise>
                            </c:choose>
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
<!--                                     <li><a href="store.html">Store</a></li>                           -->
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
    <!-- ##### Header Area End ##### -->
    
    <!-- ##### Breadcrumb Area Start ##### -->
    <div class="breadcrumb-area bg-img bg-overlay" style="background-image: url(${pageContext.request.contextPath}/resources/img/bg-img/27.jpg);">
        <div class="container h-100">
            <div class="row h-100 align-items-center">
                <!-- Breadcrumb Text -->
                <div class="col-12">
                    <div class="breadcrumb-text">
                        <h2>Reviews</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- ##### Breadcrumb Area End ##### -->

   

    <!-- ##### Game Review Area Start ##### -->

    <!-- Page section -->
    <section class="page-section recent-game-page spad">
        <div class="container">
        	<div class="write-bnt">
                <button class="writeReview" onclick="location.href='/project/writeReview'">Write a review</button>
            </div>
            <div class="row">
                <div class="col-lg-8">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="recent-game-item">
                                <div class="rgi-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/recent-game/1.jpg">

                                </div>
                                <div class="rgi-content">
                                    <a href="reviewSingle">
                                    <h5>Susce pulvinar metus nulla, vel facilisis sem </h5>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisc ing ipsum dolor sit amet,
                                        consectetur elit. </p></a>
                                    <a href="#" class="comment">3 Comments</a>

                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="recent-game-item">
                                <div class="rgi-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/recent-game/2.jpg">

                                </div>
                                <div class="rgi-content">
                                    <h5>Susce pulvinar metus nulla, vel facilisis sem </h5>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisc ing ipsum dolor sit amet,
                                        consectetur elit. </p>
                                    <a href="#" class="comment">3 Comments</a>

                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="recent-game-item">
                                <div class="rgi-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/recent-game/3.jpg">

                                </div>
                                <div class="rgi-content">
                                    <h5>Susce pulvinar metus nulla, vel facilisis sem </h5>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisc ing ipsum dolor sit amet,
                                        consectetur elit. </p>
                                    <a href="#" class="comment">3 Comments</a>

                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="recent-game-item">
                                <div class="rgi-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/recent-game/4.jpg">

                                </div>
                                <div class="rgi-content">
                                    <h5>Suspendisse ut justo tem por, rutrum</h5>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisc ing ipsum dolor sit amet,
                                        consectetur elit. </p>
                                    <a href="#" class="comment">3 Comments</a>

                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="recent-game-item">
                                <div class="rgi-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/recent-game/5.jpg">

                                </div>
                                <div class="rgi-content">
                                    <h5>Susce pulvinar metus nulla, vel facilisis sem </h5>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisc ing ipsum dolor sit amet,
                                        consectetur elit. </p>
                                    <a href="#" class="comment">3 Comments</a>

                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="recent-game-item">
                                <div class="rgi-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/recent-game/6.jpg">

                                </div>
                                <div class="rgi-content">
                                    <h5>Susce pulvinar metus nulla, vel facilisis sem </h5>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisc ing ipsum dolor sit amet,
                                        consectetur elit. </p>
                                    <a href="#" class="comment">3 Comments</a>

                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="recent-game-item">
                                <div class="rgi-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/recent-game/7.jpg">

                                </div>
                                <div class="rgi-content">
                                    <h5>Suspendisse ut justo tem por, rutrum</h5>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisc ing ipsum dolor sit amet,
                                        consectetur elit. </p>
                                    <a href="#" class="comment">3 Comments</a>

                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="recent-game-item">
                                <div class="rgi-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/recent-game/8.jpg">

                                </div>
                                <div class="rgi-content">
                                    <h5>Susce pulvinar metus nulla, vel facilisis sem </h5>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisc ing ipsum dolor sit amet,
                                        consectetur elit. </p>
                                    <a href="#" class="comment">3 Comments</a>

                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- ### Pagination Area ### -->
                    <nav class="pagination clearfix">
                        <ul class="page-numbers">
                            <li><a class="prev page-numbers" href="#"><i class="fa fa-angle-left"
                                        aria-hidden="true"></i></a></li>
                            <li><span class="page-numbers current">1</span></li>
                            <li><a class="page-numbers" href="#">2</a></li>
                            <li><a class="page-numbers" href="#">3</a></li>
                            <li><a class="page-numbers" href="#">4</a></li>
                            <li><a class="next page-numbers" href="#"><i class="fa fa-angle-right"
                                        aria-hidden="true"></i></a></li>
                        </ul>
                    </nav>
                </div>
                <!-- sidebar -->
                <div class="col-lg-4 col-md-7 sidebar pt-5 pt-lg-0">
                    <div class="widget-item">
                        <h4 class="widget-title">Latest Posts</h4>
                        <div class="latest-blog">
                            <div class="lb-item">
                                <div class="lb-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/latest-blog/1.jpg"></div>
                                <div class="lb-content">
                                    <div class="lb-date">June 21, 2018</div>
                                    <p>Ipsum dolor sit amet, consectetur adipisc ing consecips</p>
                                    <a href="#" class="lb-author">By Admin</a>
                                </div>
                            </div>
                            <div class="lb-item">
                                <div class="lb-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/latest-blog/2.jpg"></div>
                                <div class="lb-content">
                                    <div class="lb-date">June 21, 2018</div>
                                    <p>Ipsum dolor sit amet, consectetur adipisc ing consecips</p>
                                    <a href="#" class="lb-author">By Admin</a>
                                </div>
                            </div>
                            <div class="lb-item">
                                <div class="lb-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/latest-blog/3.jpg"></div>
                                <div class="lb-content">
                                    <div class="lb-date">June 21, 2018</div>
                                    <p>Ipsum dolor sit amet, consectetur adipisc ing consecips</p>
                                    <a href="#" class="lb-author">By Admin</a>
                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- widget -->
                    <div class="widget-item">
                        <h4 class="widget-title">Top Comments</h4>
                        <div class="top-comment">
                            <div class="tc-item">
                                <div class="tc-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/authors/1.jpg"></div>
                                <div class="tc-content">
                                    <p><a href="#">James Smith</a> <span>on</span> Lorem consec ipsum dolor sit amet, co
                                    </p>
                                    <div class="tc-date">June 21, 2018</div>
                                </div>
                            </div>
                            <div class="tc-item">
                                <div class="tc-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/authors/2.jpg"></div>
                                <div class="tc-content">
                                    <p><a href="#">Michael James</a> <span>on</span>Cras sit amet sapien aliquam</p>
                                    <div class="tc-date">June 21, 2018</div>
                                </div>
                            </div>
                            <div class="tc-item">
                                <div class="tc-thumb set-bg" data-setbg="${pageContext.request.contextPath}/resources/img/authors/3.jpg"></div>
                                <div class="tc-content">
                                    <p><a href="#">Justin More</a> <span>on</span> Lorem ipsum dolor consecsit amet, co
                                    </p>
                                    <div class="tc-date">June 21, 2018</div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </section>
    <!-- Page section end -->
    <!-- ##### Game Review Area End ##### -->

      <!-- ##### Footer Area Start ##### -->
    <footer class="footer-area">
        <!-- Main Footer Area -->
        <div class="main-footer-area section-padding-100-0">
            <div class="container">
                <div class="row">
                    <!-- Single Footer Widget -->
                    <div class="col-12 col-sm-6 col-lg-3">
                        <div class="single-footer-widget mb-70 wow fadeInUp" data-wow-delay="100ms">
                            <div class="widget-title">
                                <a href="home.do"><img src="${pageContext.request.contextPath}/resources/img/core-img/logo2.png" alt=""></a>
                            </div>
                            <div class="widget-content">
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris velit
                                    arcu,
                                    scelerisque dignissim massa quis, mattis facilisis erat. Aliquam erat
                                    volutpat. Sed
                                    efficitur diam ut interdum ultricies.</p>
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
                        <div class="single-footer-widget mb-70 wow fadeInUp" data-wow-delay="500ms">
                            <div class="widget-title">
                                <h4>Usefull Links</h4>
                            </div>
                            <div class="widget-content">
                                <nav>
                                    <ul>
                                        <li><a href="https://store.steampowered.com/" target="_blank">Steam</a></li>
                                        <li><a href="https://store.playstation.com/" target="_blank">PlayStation</a>
                                        </li>
                                        <li><a href="http://blizzard.com" target="_blank">Blizzard
                                                Entertainment</a>
                                        </li>
                                        <li><a href="https://www.origin.com/" target="_blank">Origin</a>
                                        </li>
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
                        <p class="copywrite-text">
                            Copyright &copy; All rights reserved | This Website is made with <i class="fa fa-heart-o"
                                aria-hidden="true"></i> by Team2
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- ##### Footer Area End ##### -->

    <!-- ##### All Javascript Script ##### -->
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
    <script src="${pageContext.request.contextPath}/resources/js/jquery.marquee.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/reviews.js"></script>
</body>

</html>

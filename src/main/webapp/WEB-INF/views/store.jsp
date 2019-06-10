<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="kr">

<head>
<meta charset="UTF-8">
<meta name="description" content="">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- 상위 4줄은 반드시 head 최상위에 위치해야함. -->

<!-- Title -->
<title>GAMESPOT | Store</title>

<!-- Favicon (브라우저 탭에 로고 노출) -->
<link rel="icon" type="image/png" sizes="16x16"
	href="${pageContext.request.contextPath}/resources/img/core-img/favicon.ico">

<!-- font-awesome CSS -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/fonts/font-awesome-4.7.0/css/font-awesome.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/fonts/iconic/css/material-design-iconic-font.min.css">
<!-- animate CSS -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/animate.css">

<!-- slick CSS -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/slick.css">

<!--magnific-popup CSS -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/magnific-popup.css">

<!-- Stylesheet(css파일 따로 작성, 임포트 해서 적용.) -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/style.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/store.css">

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

<<<<<<< HEAD
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
=======
	<!-- ##### Header 영역 시작 ##### -->
	<header class="header-area wow fadeInDown" data-wow-delay="500ms">
		<!-- Header 상단 영역 -->
		<div class="top-header-area">
			<div class="container h-100">
				<div class="row h-100 align-items-center">
					<div
						class="col-12 d-flex align-items-center justify-content-between">
						<!-- Logo 영역 -->
						<div class="logo">
							<a href="home.do"><img
								src="${pageContext.request.contextPath}/resources/img/core-img/logo2.png"
								alt="gamespot"></a>
						</div>
>>>>>>> branch 'master' of https://github.com/sunkingdon/team.git

						<!-- Search & Login 영역 -->
						<div class="search-login-area d-flex align-items-center">
							<!-- 상단 Search 영역 -->
							<div class="top-search-area">
								<form action="#" method="post">
									<input type="search" name="top-search" id="topSearch"
										placeholder="Search">
									<button type="submit" class="btn">
										<i class="fa fa-search"></i>
									</button>
								</form>
							</div>
							<!-- Login 영역 -->
							<div class="login-area">

								<!-- login session -->
								<c:choose>
									<c:when test="${sessionScope.id eq null }">
										<a href="loginView"><span>Login / Register</span> <i
											class="fa fa-lock" aria-hidden="true"></i></a>
									</c:when>
									<c:otherwise>
										<a href="/project/myInfo?id=${sessionScope.id }">${sessionScope.name }
											접속중</a>
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
								<div class="cross-wrap">
									<span class="top"></span><span class="bottom"></span>
								</div>
							</div>

							<!-- Nav Start -->
							<div class="classynav">
								<ul>
									<li><a href="home.do">Home</a></li>
									<!-- <li><a href="store.html">Store</a></li>                           -->
									<li><a href="store.do">Store</a></li>
									<li><a href="reviews">Reviews</a></li>
									<li><a href="support.html">Support</li>
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
	<div class="breadcrumb-area bg-img bg-overlay"
		style="background-image: url(${pageContext.request.contextPath}/resources/img/bg-img/27.jpg);">
		<div class="container h-100">
			<div class="row h-100 align-items-center">
				<!-- Breadcrumb Text -->
				<div class="col-12">
					<div class="breadcrumb-text">
						<h2>Store</h2>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- ##### Breadcrumb Area End ##### -->

	<!-- #### Store Area Start #### -->

<<<<<<< HEAD
                                        </div>
                                        <div class="product-caption">
                                            <span class="posted_in"><a href="#" rel="tag">Strategy</a></span>
                                            <h4 class="product-title">
                                                <a href="gamesingle.do" title="">Total War: THREE KINGDOMS</a>
                                            </h4>
                                            <div class="product-form-cart">
                                                <div class="product-price">
                                                    <ins>
                                                        <span class="amout">$58.00</span>
                                                    </ins>
                                                </div>
                                                <a href="product_single.html" class="add_to_cart_button">
                                                    <i class="fa fa-shopping-basket" aria-hidden="true"></i></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 col-md-6 col-sm-6">
                                    <div class="product-block">
                                        <div class="product-image ">
                                            <div class="product-thumbnail">
                                                <a href="gamesingle.do" title="">
                                                    <img class="product-featured-image" src="${pageContext.request.contextPath}/resources/img/bg-img/store2.jpg"
                                                        alt="">
                                                </a>
                                            </div>
=======
	<!-- Container -->
	<div class="store-container">
		<div class="row flex-row-reverse">
			<div class="col-lg-9 col-md-8">
				<!-- product-shorting -->
				<div
					class="product-shorting d-flex align-items-center justify-content-between">
					<div class="toolbar-sorter">
						<span>Sort by : </span> <select name="orderby" class="orderby">
							<option value="menu_order" selected="selected">filter</option>
							<option value="popularity">popularity</option>
							<option value="date">newness</option>
							<option value="price">low to high</option>
							<option value="price-desc">high to low</option>
						</select>
					</div>
>>>>>>> refs/remotes/origin/master

					<div class="toolbar-sorter">
						<span>Genre : </span> <select name="orderby" class="orderby">
							<option value="menu_order" selected="selected">filter</option>
							<option value="popularity">popularity</option>
							<option value="date">newness</option>
							<option value="price">low to high</option>
							<option value="price-desc">high to low</option>
						</select>
					</div>

					<div class="toolbar-sorter">
						<span>Search : </span>
						<div class="top-search-area">
							<form action="#" method="post">
								<input type="search" name="top-search" class="toolbar-search"
									placeholder="Search by title, genre, publisher, or developer..">
								<button type="submit" class="btn">
									<i class="fa fa-search"></i>
								</button>
							</form>
						</div>
					</div>

					<div class="grid-list-view">
						<ul class="nav nav-tabs" role="tablist">
							<li class="nav-item"><a class="nav-link active"
								href="#grid-view" role="tab" data-toggle="tab"> <i
									class="fa fa-th"></i>
							</a></li>
							<li class="nav-item"><a class="nav-link" href="#list-view" role="tab" data-toggle="tab"> 
								<i class="fa fa-list-ul"></i>
							</a></li>
						</ul>
					</div>
				</div>
				<!--/product-shorting -->

				<!-- tab-content -->
				<div class="tab-content">
					<div role="tabpanel" class="tab-pane fade show active"
						id="grid-view">
						<div class="product products-grid">
							<div class="row row-products">
								<c:forEach var="g" items="${list}">
									<div class="col-lg-4 col-md-6 col-sm-6">
										<div class="product-block">
											<div class="product-image ">
												<div class="product-thumbnail">
													<a href="${pageContext.request.contextPath}/gamesingle.do?title=${g.title }" title=""> 
														<img class="product-featured-image" src="${pageContext.request.contextPath}/resources/image/${g.path}" alt="">
													</a>
												</div>
											</div>
											<div class="product-caption">
												<span class="posted_in"><a href="#" rel="tag">${g.genrename }</a></span>
												<h4 class="product-title">
													<a href="${pageContext.request.contextPath}/gamesingle.do?title=${g.title }" title="">${g.title }</a>
												</h4>
												<div class="product-form-cart">
													<div class="product-price">
														<ins>
															<span class="amout">${g.price } &#8361; </span>
														</ins>
													</div>
													<a href="product_single.html" class="add_to_cart_button">
														<i class="fa fa-shopping-basket" aria-hidden="true"></i>
													</a>
												</div>
											</div>
										</div>
									</div>
								</c:forEach>
							</div>
						</div>
					</div>


					<!-- ***************************************************************************************************************************** -->


					<div role="tabpanel" class="tab-pane fade" id="list-view">
						<div class="product products-list">
							<div class="row row-products">
								<c:forEach var="g" items="${list }">
									<div class="col-md-12 product-block-list">
										<div class="row">
											<div class="col-lg-4 col-md-12 col-sm-12">
												<figure class="product-image">
													<div class="product-thumbnail">
														<a href="${pageContext.request.contextPath}/gamesingle.do?title=${g.title }" title=""> 
															<img class="product-featured-image" src="${pageContext.request.contextPath}/resources/image/${g.path }" alt="">
														</a>
													</div>
												</figure>
												<!-- /.product-image -->
											</div>
											<div class="col-lg-8 col-md-12 col-sm-12">
												<div class="product-caption">
													<span class="posted_in"><a href="#" rel="tag">${g.genrename }</a></span>
													<div class="product-meta">
														<h4 class="product-name">
															<a href="${pageContext.request.contextPath}/gamesingle.do?title=${g.title }" title="">${g.title }</a>
														</h4>
														<div class="product-price">
															<ins>
																<span class="amout">${g.price } &#8361;</span>
															</ins>
														</div>
													</div>
													<div class="excerpt">${g.info }</div>
													<div class="product-footer">
														<i class="fa fa-shopping-basket" aria-hidden="true"></i>
														<div class="container-cart-form-btn">
															<button class="cart-form-btn">Add to Cart</button>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
								</c:forEach>
							</div>
						</div>
					</div>
				</div>
				<!-- /tab-content -->
				<nav class="pagination clearfix">
					<ul class="page-numbers">
						<li><a class="prev page-numbers" href="#"><i
								class="fa fa-angle-left" aria-hidden="true"></i></a></li>
						<li><span class="page-numbers current">1</span></li>
						<li><a class="page-numbers" href="#">2</a></li>
						<li><a class="page-numbers" href="#">3</a></li>
						<li><a class="page-numbers" href="#">4</a></li>
						<li><a class="next page-numbers" href="#"><i
								class="fa fa-angle-right" aria-hidden="true"></i></a></li>
					</ul>
				</nav>
				<!-- /pagination -->
			</div>
			<div class="col-lg-3 col-md-4">
				<aside class="sidebar product-filter">
					<!-- Categories -->
					<section class="widget widget-categories-cat">
						<h3 class="widget-title widget-title__large">Store all
							categories</h3>
						<div class="widget-content">
							<ul class="list-categories list-widget">
								<li><a class="genre" href="${pageContext.request.contextPath}/categorylist.do?genrename=액션">Action</a></li>
								<li><a class="genre" href="${pageContext.request.contextPath}/categorylist.do?genrename=어드벤쳐">Adventure</a></li>
								<li><a class="genre" href="${pageContext.request.contextPath}/categorylist.do?genrename=캐쥬얼">Casual</a></li>
								<li><a class="genre" href="${pageContext.request.contextPath}/categorylist.do?genrename=레이싱">Racing</a></li>
								<li><a class="genre" href="${pageContext.request.contextPath}/categorylist.do?genrename=리듬">Rhythm</a></li>
								<li><a class="genre" href="${pageContext.request.contextPath}/categorylist.do?genrename=시뮬레이션">Simulation</a></li>
								<li><a class="genre" href="${pageContext.request.contextPath}/categorylist.do?genrename=스포츠">Sports</a></li>
								<li><a class="genre" href="${pageContext.request.contextPath}/categorylist.do?genrename=전략">Strategy</a></li>
							</ul>
						</div>
					</section>
					<!-- /Categories -->
					<div class="widget-woof">
						<h3 class="widget-title widget-title__large">Refine by</h3>
						<div class="widget-woof-content">


							<!-- Color -->
							<section class="widget section-price">
								<h3 class="widget-title widget_collapse">Price</h3>
								<div class="widget-content">
									<form class="login100-form validate-form">
										<div class="contact100-form-checkbox">
											<input class="input-checkbox100" id="ckb1" type="checkbox"
												name="price"> <label class="label-checkbox100"
												for="ckb1"> $5 - $15 </label>
										</div>
									</form>
									<form class="login100-form validate-form">
										<div class="contact100-form-checkbox">
											<input class="input-checkbox100" id="ckb2" type="checkbox"
												name="price"> <label class="label-checkbox100"
												for="ckb2"> $15 - $25 </label>
										</div>
									</form>
									<form class="login100-form validate-form">
										<div class="contact100-form-checkbox">
											<input class="input-checkbox100" id="ckb3" type="checkbox"
												name="price"> <label class="label-checkbox100"
												for="ckb3"> $25 - $35 </label>
										</div>
									</form>
									<form class="login100-form validate-form">
										<div class="contact100-form-checkbox">
											<input class="input-checkbox100" id="ckb4" type="checkbox"
												name="price"> <label class="label-checkbox100"
												for="ckb4"> $35 - $45 </label>
										</div>
									</form>
									<form class="login100-form validate-form">
										<div class="contact100-form-checkbox">
											<input class="input-checkbox100" id="ckb5" type="checkbox"
												name="price"> <label class="label-checkbox100"
												for="ckb5"> $45 - $55 </label>
										</div>
									</form>
								</div>
							</section>
							<!--/Color -->

							<!-- Price -->
							<section class="widget section-price widget_filter">
								<h3 class="widget-title widget_collapse">Price range</h3>
								<div class="widget-content">
									<div
										class="ps-slider ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content"
										data-default-min="0" data-default-max="500" data-max="1000"
										data-step="100" data-unit="$">
										<div class="ui-slider-range ui-corner-all ui-widget-header"
											style="left: 0%; width: 50%;"></div>
										<span tabindex="0"
											class="ui-slider-handle ui-corner-all ui-state-default"
											style="left: 0%;"></span><span tabindex="0"
											class="ui-slider-handle ui-corner-all ui-state-default"
											style="left: 50%;"></span>
									</div>
									<p class="ps-slider__meta">
										Price:<span class="ps-slider__value ps-slider__min">$0</span>-<span
											class="ps-slider__value ps-slider__max">$500</span>
									</p>
								</div>
							</section>
							<!--/Price -->
						</div>
					</div>
				</aside>
			</div>
		</div>
	</div>

	<!-- #### End archive-product #### -->






	<!-- ##### Footer Area Start ##### -->
	<footer class="footer-area">
		<!-- Main Footer Area -->
		<div class="main-footer-area section-padding-100-0">
			<div class="container">
				<div class="row">
					<!-- Single Footer Widget -->
					<div class="col-12 col-sm-6 col-lg-3">
						<div class="single-footer-widget mb-70 wow fadeInUp"
							data-wow-delay="100ms">
							<div class="widget-title">
								<a href="home.do"><img
									src="${pageContext.request.contextPath}/resources/img/core-img/logo2.png"
									alt=""></a>
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
						<div class="single-footer-widget mb-70 wow fadeInUp"
							data-wow-delay="300ms">
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
										<li><a href="https://store.steampowered.com/"
											target="_blank">Steam</a></li>
										<li><a href="https://store.playstation.com/"
											target="_blank">PlayStation</a></li>
										<li><a href="http://blizzard.com" target="_blank">Blizzard
												Entertainment</a></li>
										<li><a href="https://www.origin.com/" target="_blank">Origin</a>
										</li>
									</ul>
								</nav>
							</div>
						</div>
					</div>

					<!-- Single Footer Widget -->
					<div class="col-12 col-sm-6 col-lg-3">
						<div class="single-footer-widget mb-70 wow fadeInUp"
							data-wow-delay="700ms">
							<div class="widget-title">
								<h4>What’s new</h4>
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
				</div>
			</div>
		</div>
		<div class="copywrite-content">
			<div class="container h-100">
				<div class="row h-100 align-items-center">
					<div class="col-12 col-sm-5">
						<!-- Copywrite Text -->
						<p class="copywrite-text">
							Copyright &copy; All rights reserved | This Website is made with
							<i class="fa fa-heart-o" aria-hidden="true"></i> by Team2
						</p>
					</div>
				</div>
			</div>
		</div>
	</footer>
	<!-- ##### Footer Area End ##### -->

	<!-- ##### All Javascript Script ##### -->
	<!-- jQuery js -->
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery/jquery-2.2.4.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>


	<!-- waypoints js-->
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.waypoints.js"></script>

	<!-- counterup js-->
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.counterup.min.js"></script>

	<!-- Popper js -->
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap/popper.min.js"></script>

	<!-- Bootstrap js -->
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.min.js"></script>

	<!-- All Plugins js -->
	<script
		src="${pageContext.request.contextPath}/resources/js/plugins/plugins.js"></script>

	<!-- Active js -->
	<script src="${pageContext.request.contextPath}/resources/js/active.js"></script>

	<!-- custom js-->
	<script src="${pageContext.request.contextPath}/resources/js/custom.js"></script>
</body>

</html>
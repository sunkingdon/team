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
    <title>GAMESPOT | Store</title>

    <!-- Favicon (브라우저 탭에 로고 노출) -->
    <link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/resources/img/core-img/favicon.ico">

    <!-- font-awesome CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts/font-awesome-4.7.0/css/font-awesome.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts/iconic/css/material-design-iconic-font.min.css">
    <!-- animate CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/animate.css">

    <!-- slick CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/slick.css">

    <!--magnific-popup CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/magnific-popup.css">

    <!-- Stylesheet(css파일 따로 작성, 임포트 해서 적용.) -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/game-single.css">

	<script>
		function pur_click() {
			alert("구매가 성공적으로 완료되었습니다.");
			location.href="${pageContext.request.contextPath}/pur.do";
		}
	</script>
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
                            <a href="home.do">
                           	 	<img src="${pageContext.request.contextPath}/resources/img/core-img/logo2.png" alt="gamespot">
                            </a>
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
                            <c:otherwise><a href="/project/myInfo?id=${sessionScope.id }">${sessionScope.name } 접속중</a>
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
    <div class="breadcrumb-area bg-img bg-overlay" style="background-image: url(${pageContext.request.contextPath}/resources/img/bg-img/27.jpg);">
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

    <!-- ##### Game-single Area Start #####-->
    <c:forEach var="g" items="${singlelist }">
    <div class="main-content">
        <div class="single-product">
            <!-- Container -->
            <div class="container">
                <!-- Row -->
                <div class="row">
                    <div class="col-lg-9 col-md-8 product-info">
                        <div class="product-header">
                            <div class="product-header__left">
                                <h1 class="product-title"> ${g.title } </h1>
                            </div>
                            <div class="product-header__right">
                                <div class="product-nav">
                                    <a href="product_single2.html" class="left psnav">
                                        <i class="fa fa-angle-left"></i>
                                    </a>
                                    <a href="product_single2.html" class="right psnav">
                                        <i class="fa fa-angle-right"></i>
                                    </a>
                                </div>
                            </div>
                        </div>
                        <div class="row product-slider">
                            <div class="col-lg-6 col-md-12">
                                <div class="main_image_product">
                                    <div class="slider slider-for">
                                        <div><img src="${pageContext.request.contextPath}/resources/image/${g.path }" alt=""></div>
<%--                                         <div><img src="${pageContext.request.contextPath}/resources/img/bg-img/46.jpg" alt=""></div> --%>
<%--                                         <div><img src="${pageContext.request.contextPath}/resources/img/bg-img/47.jpg" alt=""></div> --%>
<%--                                         <div><img src="${pageContext.request.contextPath}/resources/img/bg-img/48.jpg" alt=""></div> --%>
<%--                                         <div><img src="${pageContext.request.contextPath}/resources/img/bg-img/49.jpg" alt=""></div> --%>
<%--                                         <div><img src="${pageContext.request.contextPath}/resources/img/bg-img/45.jpg" alt=""></div> --%>
<%--                                         <div><img src="${pageContext.request.contextPath}/resources/img/bg-img/46.jpg" alt=""></div> --%>
                                    </div>
                                    <div class="slider slider-nav">
                                        <div><img src="${pageContext.request.contextPath}/resources/image/${g.path }" alt=""></div>
<%--                                         <div><img src="${pageContext.request.contextPath}/resources/img/bg-img/46.jpg" alt=""></div> --%>
<%--                                         <div><img src="${pageContext.request.contextPath}/resources/img/bg-img/47.jpg" alt=""></div> --%>
<%--                                         <div><img src="${pageContext.request.contextPath}/resources/img/bg-img/48.jpg" alt=""></div> --%>
<%--                                         <div><img src="${pageContext.request.contextPath}/resources/img/bg-img/49.jpg" alt=""></div> --%>
<%--                                         <div><img src="${pageContext.request.contextPath}/resources/img/bg-img/45.jpg" alt=""></div> --%>
<%--                                         <div><img src="${pageContext.request.contextPath}/resources/img/bg-img/46.jpg" alt=""></div> --%>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-12">
                                <div class="product-caption clearfix">
                                    <p>${g.info }</p>
                                    <div class="product-price">
                                        <ins>
                                            <span class="amout">${g.price }</span>
                                        </ins>
                                        <del>
                                            <span class="amout">$44.45</span>
                                        </del>
                                    </div><!-- /.product-price -->

                                    <div class="product-rating" data-rating="">
                                        <span class="star-rating">
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                            <i class="fa fa-star"></i>
                                        </span>
                                        <span class="customer_reviews">3 customer reviews</span>
                                    </div>
                                    <!-- end rating -->
                                    <div class="excerpt">
                                        <ul>
                                            <li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>FREE Shipping on orders over $49.</li>
                                            <li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>In Stock.</li>
                                            <li><i class="fa fa-long-arrow-right" aria-hidden="true"></i>Gift-wrap available.</li>
                                        </ul>
                                    </div>
                                    <div class="form_cart">
                                        <div class="form_cart__number">
                                            <span>Quantity :</span>
                                            <form action="#" class="add-to-cart" method="post" enctype="multipart/form-data">
                                                <input class="cart-qty-box" type="number" name="qtybutton" value="0">
                                                <input type="hidden" name="id" value="">
                                            </form>
                                        </div>
                                        <div class="container-cart-form-btn">
                                            <button class="cart-form-btn" onclick="pur_click();">
                                                <i class="fa fa-shopping-basket" aria-hidden="true"></i>Add to Cart
                                            </button>
                                        </div>
                                    </div>

                                    <div class="product-footer">
                                        <div class="product_meta">
                                            <div class="posted_in">
                                                <span>Category:</span>
                                                <a href="${pageContext.request.contextPath}/categorylist.do?genrename=${g.genrename }" rel="tag">${g.genrename }</a>
                                            </div>
                                            <div class="tagged_as">
                                                <span>Tags:</span>
                                                <a href="#" rel="tag">Luxury</a>,
                                                <a href="#" rel="tag">Skin Care</a>,
                                                <a href="#" rel="tag">Men's Grooming</a>
                                                <a href="#" rel="tag">Hair Care</a>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="product_social-sharing">
                                        <div class="social-icons share-row">
                                            <div class="a2a_kit a2a_kit_size_32 a2a_default_style">
                                                <a class="a2a_button_facebook"></a>
                                                <a class="a2a_button_twitter"></a>
                                                <a class="a2a_button_google_plus"></a>
                                                <a class="a2a_button_google_gmail"></a>
                                                <a class="a2a_button_print"></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
     </c:forEach>
                        <!-- product-tab-description -->
                        <div class="product-description-tabs">
                            <ul class="nav">
                                <li><a data-toggle="tab" href="#tab_description" class="active">Description</a></li>
                                <li><a data-toggle="tab" href="#tab_reviews">Customer Reviews (2)</a></li>
                            </ul>
                            <div class="tab-content">
                                <div id="tab_description" class="tab-pane fade show active">
                                    pre-shaving, soak clean towel with hot water. For post-shaving, use cold
                                    water instead. Ring out excess water and spray towel with the product. Apply to face
                                    for 30 seconds, avoiding eye area. Do not rinse. Product can also be used without a
                                    towel. Spray directly onto face after shaving, avoiding eye area. Do not rinse.
                                    After shaving, apply a small amount to the face and neck area, massaging in until
                                    completely absorbed.
                                    <div class="tab_description_info pt-20">
                                        <div class="pb-10">Description</div>
                                        <i>
                                            New shave duo featuring shave tonic & after shave balm shave tonic:
                                        </i>
                                    </div>
                                    <div class="tab_description_info pt-20">
                                        <div class="pb-10">Benefits</div>
                                        <i>
                                            Nourishing post-shave moisturizer for men with aloe and tea tree oil
                                        </i>
                                    </div>
                                    <div class="tab_description_info pt-20">
                                        <div class="pb-10">Suggested Use</div>
                                        <i>
                                            Helps soothe and protect skin from shaving irritation, dryness and razor
                                            burn.
                                        </i>
                                    </div>
                                </div>
                                <div id="tab_information" class="tab-pane fade">
                                    For use pre-shaving, soak clean towel with hot water. For post-shaving, use cold
                                    water instead. Ring out excess water and spray towel with the product. Apply to face
                                    for 30 seconds, avoiding eye area. Do not rinse. Product can also be used without a
                                    towel. Spray directly onto face after shaving, avoiding eye area. Do not rinse.
                                    After shaving, apply a small amount to the face and neck area, massaging in until
                                    completely absorbed.
                                </div>
                                <div id="tab_reviews" class="tab-pane fade">
                                    <div class="rattings-wrapper">
                                        <div class="review-ratting">
                                            <div class="star-author-all">
                                                <div class="ratting-author">
                                                    <h3 class="ratting__name">Jane Watson</h3>
                                                    <span>12:24</span>
                                                    <span>9 March 2018</span>
                                                </div>
                                                <div class="star-rating">
                                                    <span class="fa fa-star" aria-hidden="true"></span>
                                                    <span class="fa fa-star" aria-hidden="true"></span>
                                                    <span class="fa fa-star" aria-hidden="true"></span>
                                                    <span class="fa fa-star" aria-hidden="true"></span>
                                                    <span class="fa fa-star" aria-hidden="true"></span>
                                                    <span>(5)</span>
                                                </div>
                                            </div>

                                            <div class="reviews_content clearfix">Lorem ipsum dolor sit amet,
                                                consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore
                                                et dolore magna aliqua. Utenim ad minim veniam, quis nost rud
                                                exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                                                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                                                tempor incididunt ut labore et dolore magna aliqua. Utenim ad minim
                                                veniam, quis nost.</div>
                                        </div>
                                        <div class="review-ratting">
                                            <div class="star-author-all">
                                                <div class="ratting-author">
                                                    <h3 class="ratting__name">Emma Doe</h3>
                                                    <span>12:24</span>
                                                    <span>9 March 2018</span>
                                                </div>
                                                <div class="star-rating">
                                                    <span class="fa fa-star" aria-hidden="true"></span>
                                                    <span class="fa fa-star" aria-hidden="true"></span>
                                                    <span class="fa fa-star" aria-hidden="true"></span>
                                                    <span class="fa fa-star" aria-hidden="true"></span>
                                                    <span class="fa fa-star" aria-hidden="true"></span>
                                                    <span>(5)</span>
                                                </div>
                                            </div>

                                            <div class="reviews_content clearfix">Lorem ipsum dolor sit amet,
                                                consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore
                                                et dolore magna aliqua. Utenim ad minim veniam, quis nost rud
                                                exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                                                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
                                                tempor incididunt ut labore et dolore magna aliqua. Utenim ad minim
                                                veniam, quis nost.</div>
                                        </div>
                                    </div>
                                    <form class="form-product-review" action="" method="post">
                                        <h5>ADD YOUR REVIEW</h5>
                                        <div class="form-group">
                                            <label class="control-label">Your Rating</label>
                                            <p class="star-rating">
                                                <span class="fa fa-star" aria-hidden="true"></span>
                                                <span class="fa fa-star" aria-hidden="true"></span>
                                                <span class="fa fa-star" aria-hidden="true"></span>
                                                <span class="fa fa-star" aria-hidden="true"></span>
                                                <span class="fa fa-star" aria-hidden="true"></span>
                                            </p>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label" for="comment">Your Review</label>
                                            <textarea id="comment" class="form-control" name="comment" cols="45"
                                                rows="8" aria-required="true"></textarea>
                                        </div>
                                        <div class="row">
                                            <div class="form-group col-md-6">
                                                <label for="author" class="control-label">Name
                                                    <span class="required">*</span>
                                                </label>
                                                <input id="author" class="form-control" name="author" type="text"
                                                    value="" size="30" aria-required="true">
                                            </div>
                                            <div class="form-group col-md-6">
                                                <label for="email" class="control-label">Password
                                                    <span class="required">*</span>
                                                </label>
                                            
                                                <input class="form-control" type="password" name="pass" value=""
                                                    size="30" aria-required="true">
                                                    
                                            </div>
                                            <div class="form-submit col-md-12">
                                                <input name="submit" type="submit" id="submit" class="btn btn-primary"
                                                    value="Send">
                                                
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <!--/product-tab-description -->
                    </div>
                    <div class="col-lg-3 col-md-4">
                        <div class="sidebar">
                            <div class="may_also">
                                <h3 class="may_also__title">You may also like</h3>
                                <p>Extra 12% off on Credit/Debit Card</p>
                            </div>
                            <ul class="product-list-siderbar">
                                <li>
                                    <div class="inner">
                                        <a class="product-thumbnail" href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/bg-img/45.jpg" alt="">
                                        </a>
                                        <div class="product-content">
                                            <h3 class="product-title">
                                                <a href="#">Game 1</a>
                                            </h3>
                                            <div class="star-rating">
                                                <span class="product-rating" data-rating="">
                                                    <span class="star-rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </span>
                                                </span>
                                                <div class="product-price">
                                                    <ins>
                                                        <span class="amout">$14.38</span>
                                                    </ins>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="inner">
                                        <a class="product-thumbnail" href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/bg-img/46.jpg" alt="">
                                        </a>
                                        <div class="product-content">
                                            <h3 class="product-title">
                                                <a href="#">Game 1</a>
                                            </h3>
                                            <div class="star-rating">
                                                <span class="product-rating" data-rating="">
                                                    <span class="star-rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </span>
                                                </span>
                                            </div>
                                            <div class="product-price">
                                                <ins>
                                                    <span class="amout">$14.38</span>
                                                </ins>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="inner">
                                        <a class="product-thumbnail" href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/bg-img/47.jpg" alt="">
                                        </a>
                                        <div class="product-content">
                                            <h3 class="product-title">
                                                <a href="#">Game 1</a>
                                            </h3>
                                            <div class="star-rating">
                                                <span class="product-rating" data-rating="">
                                                    <span class="star-rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </span>
                                                </span>
                                            </div>
                                            <div class="product-price">
                                                <ins>
                                                    <span class="amout">$14.38</span>
                                                </ins>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="inner">
                                        <a class="product-thumbnail" href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/bg-img/47.jpg" alt="">
                                        </a>
                                        <div class="product-content">
                                            <h3 class="product-title">
                                                <a href="#">Game 1</a>
                                            </h3>
                                            <div class="star-rating">
                                                <span class="product-rating" data-rating="">
                                                    <span class="star-rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </span>
                                                </span>
                                            </div>
                                            <div class="product-price">
                                                <ins>
                                                    <span class="amout">$14.38</span>
                                                </ins>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="inner">
                                        <a class="product-thumbnail" href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/bg-img/48.jpg" alt="">
                                        </a>
                                        <div class="product-content">
                                            <h3 class="product-title">
                                                <a href="#">Game 1</a>
                                            </h3>
                                            <div class="star-rating">
                                                <span class="product-rating" data-rating="">
                                                    <span class="star-rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </span>
                                                </span>
                                            </div>
                                            <div class="product-price">
                                                <ins>
                                                    <span class="amout">$14.38</span>
                                                </ins>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="inner">
                                        <a class="product-thumbnail" href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/bg-img/49.jpg" alt="">
                                        </a>
                                        <div class="product-content">
                                            <h3 class="product-title">
                                                <a href="#">Game 1</a>
                                            </h3>
                                            <div class="star-rating">
                                                <span class="product-rating" data-rating="">
                                                    <span class="star-rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </span>
                                                </span>
                                            </div>
                                            <div class="product-price">
                                                <ins>
                                                    <span class="amout">$14.38</span>
                                                </ins>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="inner">
                                        <a class="product-thumbnail" href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/bg-img/45.jpg" alt="">
                                        </a>
                                        <div class="product-content">
                                            <h3 class="product-title">
                                                <a href="#">Game 1</a>
                                            </h3>
                                            <div class="star-rating">
                                                <span class="product-rating" data-rating="">
                                                    <span class="star-rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </span>
                                                </span>
                                            </div>
                                            <div class="product-price">
                                                <ins>
                                                    <span class="amout">$14.38</span>
                                                </ins>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="inner">
                                        <a class="product-thumbnail" href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/bg-img/46.jpg" alt="">
                                        </a>
                                        <div class="product-content">
                                            <h3 class="product-title">
                                                <a href="#">Game 1</a>
                                            </h3>
                                            <div class="star-rating">
                                                <span class="product-rating" data-rating="">
                                                    <span class="star-rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </span>
                                                </span>
                                            </div>
                                            <div class="product-price">
                                                <ins>
                                                    <span class="amout">$14.38</span>
                                                </ins>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                                <li>
                                    <div class="inner">
                                        <a class="product-thumbnail" href="#">
                                            <img src="${pageContext.request.contextPath}/resources/img/bg-img/46.jpg" alt="">
                                        </a>
                                        <div class="product-content">
                                            <h3 class="product-title">
                                                <a href="#">Game 1</a>
                                            </h3>
                                            <div class="star-rating">
                                                <span class="product-rating" data-rating="">
                                                    <span class="star-rating">
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                        <i class="fa fa-star"></i>
                                                    </span>
                                                </span>
                                            </div>
                                            <div class="product-price">
                                                <ins>
                                                    <span class="amout">$14.38</span>
                                                </ins>
                                            </div>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>
    <!-- ##### game-single Area End #####-->




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
    <!-- jQuery js -->
    <script src="${pageContext.request.contextPath}/resources/js/jquery/jquery-2.2.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/jquery.min.js"></script>


    <!-- waypoints js-->
    <script src="${pageContext.request.contextPath}/resources/js/jquery.waypoints.js"></script>

    <!-- counterup js-->
    <script src="${pageContext.request.contextPath}/resources/js/jquery.counterup.min.js"></script>

    <!-- Popper js -->
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap/popper.min.js"></script>

    <!-- Bootstrap js -->
    <script src="${pageContext.request.contextPath}/resources/js/bootstrap/bootstrap.min.js"></script>

    <!-- All Plugins js -->
    <script src="${pageContext.request.contextPath}/resources/js/plugins/plugins.js"></script>

    <!-- Active js -->
    <script src="${pageContext.request.contextPath}/resources/js/active.js"></script>

    <!-- custom js-->
    <script src="${pageContext.request.contextPath}/resources/js/custom.js"></script>
</body>

</html>
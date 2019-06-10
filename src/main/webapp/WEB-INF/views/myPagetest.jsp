<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/project/update.do/" method="post">
아이디 : <input type="text" value="${empVo.id }" name="id" readonly="readonly"> <br/>
이름 : ${empVo.name }<br/>
비밀번호  : <input type="text"  value="${empVo.pw }" name="pw"><br/>
이메일 : <input type="text" value="${empVo.email }" name="email"><br/>
생일 : ${empVo.birth }<br/>


<input type="submit" value="수정">
</form>
</body>
</html> --%>

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
    <title>GAMESPOT | User Page</title>

    <!-- Favicon (브라우저 탭에 로고 노출) -->
    <link rel="icon" type="image/png" sizes="16x16" href="${pageContext.request.contextPath}/resources/img/core-img/favicon.ico">

    <!-- Stylesheet(css파일 따로 작성, 임포트 해서 적용.) -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/user-info.css">
    <script src="https://kit.fontawesome.com/4e530a2d6a.js"></script>

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
                            
                            <c:otherwise><a href="/project/myInfo.do?id=${sessionScope.id }"><span>Welcome, ${sessionScope.name }</span><i class="fa fa-user" aria-hidden="true"></i> </a>
                            <button onclick="location.href='/project/logout.do'">Log out</button>
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
                                    <li><a href="support.html">Support</li>
                                </ul>
                            </div>
                            <!-- Nav End -->
                        </div>

                        <!-- Nav 소셜미디어 아이콘 -->
                        <div class="top-social-info">
                            <a href="#" data-toggle="tooltip" data-placement="top" title="Facebook"><i
                                    class="fab fa-facebook-f" aria-hidden="true"></i></a>
                            <a href="#" data-toggle="tooltip" data-placement="top" title="Twitter"><i
                                    class="fab fa-twitter" aria-hidden="true"></i></a>
                            <a href="#" data-toggle="tooltip" data-placement="top" title="Instagram"><i
                                    class="fab fa-instagram" aria-hidden="true"></i></a>
                        </div>
                    </nav>
                </div>
            </div>
        </div>
    </header>
    <!-- ##### Header Area End ##### -->
    <!-- ##### User info Area Start #####-->
    <section>
        <div class="db">
            <!--LEFT SECTION-->
            <div class="db-l">
                <div class="db-l-1">
                    <ul>
                        <li><img src="${pageContext.request.contextPath}/resources/img/authors/1.jpg" alt="" /></li>
                        <li><i class="fas fa-user"></i> Username</li>
                    </ul>
                </div>
                <div class="db-l-2">
                    <ul>
                        <li>
                            <a href="dashboard.html">
                        <li> <i class="fas fa-user"></i> User Information</a>
                        </li>
                        <li>
                            <a href="db-travel-booking.html"><i class="fas fa-user-times"></i> Delete Account</a>
                        </li>
                    </ul>
                </div>
            </div>
            <!--CENTER SECTION-->
            <div class="db-2">
                <div class="db-2-com db-2-main">
                    <h4>User Information</h4>
                    <div class="db-2-main-com">
                        <div class="db-2-main-2">
                            <ul class="user-info">
                                <li>Username : Wasabi Almond</li>
                                <li>Email : web1400@gmail.com</li>
                                <li>Date of Birth : 10/06/1994</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
            <div class="db-2">
                <div class="db-2-sort">
                    <div class="sorting">
                        <h4>My Board</h4>
                        <div class="sorter">
                            <select name="orderby" class="orderby">
                                <option value="menu_order" selected="selected">filter</option>
                                <option value="review">Review</option>
                                <option value="comment">Comment</option>
                            </select>
                        </div>

                    </div>
                    <div class="db-2-main-com">
                        <div class="db-2-main-2">
                            <div class="board-flex">
                                <div class="title">
                                    <div class="review">
                                        <input type="checkbox" name="delete" id="delete">
                                        <span>Review</span> This is review
                                    </div>
                                </div>
                                <div class="date">
                                    10/06/19
                                </div>
                                
                            </div>
                            <div class="board-flex">
                                <div class="title">
                                    <div class="comment">
                                        <input type="checkbox" name="delete" id="delete">
                                        <span>Comment</span> This is comment 
                                    </div>
                                </div>
                                <div class="date">
                                    10/06/19
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </section>


    <!-- ##### User info Area Start #####-->



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
                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris velit arcu,
                                    scelerisque dignissim massa quis, mattis facilisis erat. Aliquam erat volutpat. Sed
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
                                        <li><a href="http://blizzard.com" target="_blank">Blizzard Entertainment</a>
                                        </li>
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

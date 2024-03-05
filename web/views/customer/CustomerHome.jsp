<%-- 
    Document   : CustomerHome
    Created on : Mar 1, 2024, 7:05:02 PM
    Author     : Nguyen Quang Hau
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
	<title>Booking Hotel Home</title>
    <link rel="shortcut icon" type="image/x-icon" href='<c:url value="/assets/customer/assets/img/favicon.png"></c:url>'>
	<link rel="stylesheet" href='<c:url value="/assets/customer/assets/css/bootstrap.min.css"></c:url>'>
	<link rel="stylesheet" href='<c:url value="/assets/customer/assets/plugins/fontawesome/css/fontawesome.min.css"></c:url>'>
	<link rel="stylesheet" href='<c:url value="/assets/customer/assets/plugins/fontawesome/css/all.min.css"></c:url>'>
	<link rel="stylesheet" href='<c:url value="/assets/customer/assets/css/feathericon.min.css"></c:url>'>
	<link rel="stylehseet" href="https://cdn.oesmith.co.uk/morris-0.5.1.css">
	<link rel="stylesheet" href='<c:url value="/assets/customer/assets/plugins/morris/morris.css"></c:url>'>
	<link rel="stylesheet" href='<c:url value="/assets/customer/assets/css/style.css"></c:url>'> </head>
     <!-- Google Web Fonts -->
     <link rel="preconnect" href="https://fonts.googleapis.com">
     <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
     <link href="https://fonts.googleapis.com/css2?family=Jost:wght@500;600&family=Roboto&display=swap" rel="stylesheet"> 

     <!-- Icon Font Stylesheet -->
     <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css"/>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

     <!-- Libraries Stylesheet -->
     <link href='<c:url value="/assets/customer/lib/owlcarousel/assets/owl.carousel.min.css"></c:url>' rel="stylesheet">
     <link href='<c:url value="/assets/customer/lib/lightbox/css/lightbox.min.css"></c:url>' rel="stylesheet">

     <!-- Template Stylesheet -->
     <link href='<c:url value="/assets/customer/assets/css/style2.css"></c:url>' rel="stylesheet">

<body>
	<div class="main-wrapper">
		<div class="header">
			<div class="header-left">
				<a href='<c:url value="/HomeCustomerController?fetch=6&page=1"></c:url>' class="logo"> <img src='<c:url value="/assets/customer/assets/img/hotel_logo.png"></c:url>' width="50" height="70" alt="logo"> <span class="logoclass">Booking Hotel</span> </a>
				<a href='<c:url value="/HomeCustomerController?fetch=6&page=1"></c:url>' class="logo logo-small"> <img src='<c:url value="/assets/customer/assets/img/hotel_logo.png"></c:url>' alt="Logo" width="30" height="30"> </a>
			</div>
			<a href="javascript:void(0);" id="toggle_btn"> <i class="fe fe-text-align-left"></i> </a>
			<a class="mobile_btn" id="mobile_btn"> <i class="fas fa-bars"></i> </a>
			<ul class="nav user-menu">
				<li class="nav-item dropdown noti-dropdown">
					<a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown"> <i class="fe fe-bell"></i> <span class="badge badge-pill">3</span> </a>
					<div class="dropdown-menu notifications">
						<div class="topnav-dropdown-header"> <span class="notification-title">Notifications</span> <a href="javascript:void(0)" class="clear-noti"> Clear All </a> </div>
						<div class="noti-content">
							<ul class="notification-list">
								<li class="notification-message">
									<a href="#">
										<div class="media"> <span class="avatar avatar-sm">
											<img class="avatar-img rounded-circle" alt="User Image" src='<c:url value="/assets/customer/assets/img/profiles/avatar-02.jpg"></c:url>'>
											</span>
											<div class="media-body">
												<p class="noti-details"><span class="noti-title">Carlson Tech</span> has approved <span class="noti-title">your estimate</span></p>
												<p class="noti-time"><span class="notification-time">4 mins ago</span> </p>
											</div>
										</div>
									</a>
								</li>
								<li class="notification-message">
									<a href="#">
										<div class="media"> <span class="avatar avatar-sm">
											<img class="avatar-img rounded-circle" alt="User Image" src='<c:url value="/assets/customer/assets/img/profiles/avatar-11.jpg"></c:url>'>
											</span>
											<div class="media-body">
												<p class="noti-details"><span class="noti-title">International Software
													Inc</span> has sent you a invoice in the amount of <span class="noti-title">$218</span></p>
												<p class="noti-time"><span class="notification-time">6 mins ago</span> </p>
											</div>
										</div>
									</a>
								</li>
								<li class="notification-message">
									<a href="#">
										<div class="media"> <span class="avatar avatar-sm">
											<img class="avatar-img rounded-circle" alt="User Image" src='<c:url value="/assets/customer/assets/img/profiles/avatar-17.jpg"></c:url>'>
											</span>
											<div class="media-body">
												<p class="noti-details"><span class="noti-title">John Hendry</span> sent a cancellation request <span class="noti-title">Apple iPhone
													XR</span></p>
												<p class="noti-time"><span class="notification-time">8 mins ago</span> </p>
											</div>
										</div>
									</a>
								</li>
								<li class="notification-message">
									<a href="#">
										<div class="media"> <span class="avatar avatar-sm">
											<img class="avatar-img rounded-circle" alt="User Image" src='<c:url value="/assets/customer/assets/img/profiles/avatar-13.jpg"></c:url>'>
											</span>
											<div class="media-body">
												<p class="noti-details"><span class="noti-title">Mercury Software
												Inc</span> added a new product <span class="noti-title">Apple
												MacBook Pro</span></p>
												<p class="noti-time"><span class="notification-time">12 mins ago</span> </p>
											</div>
										</div>
									</a>
								</li>
							</ul>
						</div>
						<div class="topnav-dropdown-footer"> <a href="#">View all Notifications</a> </div>
					</div>
				</li>
				<li class="nav-item dropdown has-arrow">
					<a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown"> <span class="user-img"><img class="rounded-circle" src='<c:url value="/assets/customer/assets/img/profiles/avatar-01.jpg"></c:url>' width="31" alt="Soeng Souy"></span> </a>
					<div class="dropdown-menu">
						<div class="user-header">
							<div class="avatar avatar-sm"> <img src='<c:url value="/assets/customer/assets/img/profiles/avatar-01.jpg"></c:url>' alt="User Image" class="avatar-img rounded-circle"> </div>
							<div class="user-text">
								<h6>Soeng Souy</h6>
								<p class="text-muted mb-0">Administrator</p>
							</div>
						</div> <a class="dropdown-item" href="profile.html">My Profile</a> <a class="dropdown-item" href="settings.html">Account Settings</a> <a class="dropdown-item" href="login.html">Logout</a> </div>
				</li>
			</ul>
		</div>
		<div class="sidebar" id="sidebar">
			<div class="sidebar-inner slimscroll">
				<div id="sidebar-menu" class="sidebar-menu">
					<ul>
						<li class="active"> <a href='<c:url value="/HomeCustomerController?fetch=6&page=1"></c:url>'><i class="fas fa-tachometer-alt"></i> <span>Home</span></a> </li>
						<li class="list-divider"></li>
						<li class="submenu"> <a href="#"><i class="fas fa-suitcase"></i> <span> Booking </span> <span class="menu-arrow"></span></a>
							<ul class="submenu_class" style="display: none;">
								<li><a href="all-booking.html">Pending Booking</a></li>
								<li><a href="edit-booking.html">Denied Booking</a></li>
								<li><a href="add-booking.html">Completed Booking</a></li>
							</ul>
						</li>
						<li class=""> <a href="#"><i class="fas fa-user"></i> <span> Favourite List </span></a></li>
                        <li class=""> <a href="invoices.html"><i class="fas fa-user"></i> <span> Invoices</span></a></li>
                        <li class=""> <a href="payments.html"><i class="fas fa-user"></i> <span> Payments</span></a></li>
                        <li> <a href='<c:url value="/views/customer/Calendar.jsp"></c:url>'><i class="fas fa-calendar-alt"></i> <span>Calendar</span></a> </li>
						<li class="submenu"> <a href="#"><i class="fe fe-table"></i> <span> Reports </span> <span class="menu-arrow"></span></a>
							<ul class="submenu_class" style="display: none;">
								<li><a href="expense-reports.html">Spending </a></li>
								<li><a href="invoice-reports.html">Completion </a></li>
							</ul>
						</li>
					</ul>
				</div>
			</div>
		</div>
		<div class="page-wrapper">
            

            <!-- display room list -->
            <div class="container-fluid blog py-5">
                <!-- Search in right content -->
            <div class="row" style="margin-left: 0;">
                <div class="col-lg-12">
                    <form>
                        <div class="row formtype">
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label>Address</label>
                                    <input type="text" class="form-control datetimepicker">
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label>From</label>
                                    <div class="cal-icon">
                                        <input type="date" class="form-control datetimepicker"> </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label>To</label>
                                    <div class="cal-icon">
                                        <input type="date" class="form-control datetimepicker"> </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="form-group">
                                    <label> Search</label> <a href="#" class="btn btn-success btn-block mt-0 search_button"> Search </a> </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="container py-5">
                <div class="row g-4 justify-content-center">
                <c:if test="${not empty rooms}">
                    <c:forEach var="room" items="${rooms}">
                        <div class="col-lg-4 col-md-6 mt-2">
                            <div class="blog-item">
                                <div class="blog-img">
                                    <div class="blog-img-inner">
                                        <c:if test="${room.avatar != null}">
                                            <img class="img-fluid w-100 rounded-top" src='<c:url value="${room.avatar}"></c:url>' alt="Image">
                                        </c:if>
                                         <c:if test="${room.avatar == null}">
                                            <img class="img-fluid w-100 rounded-top" src='<c:url value="images/blog-1.jpg"></c:url>' alt="Image">
                                        </c:if>
                                        <div class="blog-icon">
                                            <a href="#" class="my-auto"><i class="fas fa-link fa-2x text-white"></i></a>
                                        </div>
                                    </div>
                                    <div class="blog-info d-flex align-items-center border border-start-0 border-end-0">
                                        <small class="flex-fill text-center border-end py-2 text-white"><i class="fa fa-calendar-alt text-white me-2 mr-1"></i>28 Jan 2050</small>
                                        <a href="#" class="btn-hover flex-fill text-center text-white border-end py-2"><i class="fa fa-thumbs-up text-white me-2"></i>1.7K</a>
                                        <a href="#" class="btn-hover flex-fill text-center text-white py-2"><i class="fa fa-comments text-white me-2"></i>1K</a>
                                    </div>
                                </div>
                                <div class="blog-content border border-top-0 rounded-bottom p-4">
                                    <p class="mb-3">${room.hotelName}</p>
                                    <a href="#" class="h4" style="color: #009688;">${room.roomTypeModel.roomType}</a>
                                    <p class="my-3">${room.roomTypeModel.money}vnd</p>
									<p class="mb-3">${room.hotelName}</p>
                                    <a href="#" class="btn btn-primary rounded-pill py-2 px-4">Read More</a>
                                    <a href="#" class="btn btn-primary rounded-pill py-2 px-4">Booking Now</a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </c:if>	
                </div>
                <!<!-- Paging -->
                <nav aria-label="..." class="mt-4">
                    <ul id="paging" class="pagination" style="justify-content: center">
                      <!-- <li class="page-item disabled">
                          <a class="page-link" href="#" tabindex="-1" style="color: #009688;">Previous</a>
                      </li> -->
					  
                    </ul>
                </nav>
            </div>
            </div>

		</div>
	</div>


   <script>
	       var url = "/BookingHotel_Prj301/HomeCustomerController?fetch=6&page=";  
		   var paging = document.getElementById("paging");

		   for(let i = 1; i <= ${totalPage}; i++){
			    
			    if(i === 1){
					var liTag = document.createElement("li");
					var aTag = document.createElement("a");
					var text  = document.createTextNode("Previous");
					liTag.classList.add("page-item");
					aTag.classList.add("page-link");
					if(${page} === 1){
						aTag.href=(url+${page});
					}else{
						aTag.href=(url+(${page-1}));
					}
					aTag.appendChild(text);
					liTag.appendChild(aTag);
					paging.appendChild(liTag);
				}

                var liTag = document.createElement("li");
                var aTag = document.createElement("a");
                var text  = document.createTextNode(i);
                liTag.classList.add("page-item");
                aTag.classList.add("page-link");
                aTag.href=(url+i);
                aTag.appendChild(text);
                liTag.appendChild(aTag);
                paging.appendChild(liTag);

				if(${page} === i){
                  liTag.classList.add("active");
                }    

				if(i === ${totalPage}){
					var liTag = document.createElement("li");
					var aTag = document.createElement("a");
					var text  = document.createTextNode("Next");
					liTag.classList.add("page-item");
					aTag.classList.add("page-link");
					if(${page} === ${totalPage}){
						aTag.href=(url+${totalPage});
					}else{
						aTag.href=(url+${page+1});
					}
					aTag.appendChild(text);
					liTag.appendChild(aTag);
					paging.appendChild(liTag);
				}
         
            }

   </script>


	<script data-cfasync="false" src="../../../cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script>
	<script src='<c:url value="/assets/customer/assets/js/jquery-3.5.1.min.js"></c:url>'></script>
	<script src='<c:url value="/assets/customer/assets/js/popper.min.js"></c:url>'></script>
	<script src='<c:url value="/assets/customer/assets/js/bootstrap.min.js"></c:url>'></script>
	<script src='<c:url value="/assets/customer/assets/plugins/slimscroll/jquery.slimscroll.min.js"></c:url>'></script>
	<script src='<c:url value="/assets/customer/assets/plugins/raphael/raphael.min.js"></c:url>'></script>
	<script src='<c:url value="/assets/customer/assets/plugins/morris/morris.min.js"></c:url>'></script>
	<script src='<c:url value="/assets/customer/assets/js/chart.morris.js"></c:url>'></script>
	<script src='<c:url value="/assets/customer/assets/js/script.js"></c:url>'></script>
    <!-- JavaScript Libraries -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src='<c:url value="/assets/customer/lib/easing/easing.min.js"></c:url>'></script>
    <script src='<c:url value="/assets/customer/lib/waypoints/waypoints.min.js"></c:url>'></script>
    <script src='<c:url value="/assets/customer/lib/owlcarousel/owl.carousel.min.js"></c:url>'></script>
    <script src='<c:url value="/assets/customer/lib/lightbox/js/lightbox.min.js"></c:url>'></script>
    <!-- Template Javascript -->
    <script src='<c:url value="/assets/customer/js/main.js"></c:url>'></script>
</body>

</html>

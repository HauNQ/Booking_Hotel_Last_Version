<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
        <title>Hotel Dashboard Template</title>
        <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/assets/supplier/img/favicon.png">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/supplier/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/supplier/plugins/fontawesome/css/fontawesome.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/supplier/plugins/fontawesome/css/all.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/supplier/css/feathericon.min.css">
        <link rel="stylehseet" href="https://cdn.oesmith.co.uk/morris-0.5.1.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/supplier/plugins/morris/morris.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/supplier/css/style.css"> </head>	
    <style>
        .pagination {
            display: flex;
            justify-content: center;
            margin-top: 20px;
        }

        .pagination a {
            color: #009688; /* Màu xanh lá cây */
            padding: 8px 16px;
            text-decoration: none;
            border: 1px solid #009688; /* Màu xanh lá cây */
            border-radius: 4px;
            margin: 0 4px;
            transition: background-color 0.3s;
        }

        .pagination a:hover {
            background-color: #009688; /* Màu xanh lá cây */
            color: #fff;
        }

        .pagination strong {
            color: #fff;
            background-color: #009688; /* Màu xanh lá cây */
            padding: 8px 16px;
            border: 1px solid #009688; /* Màu xanh lá cây */
            border-radius: 4px;
            margin: 0 4px;
        }
        
        
        .rounded-circle{
            height: 40px;
        }
    

    </style>


    <body>
        <div class="main-wrapper">
            <div class="header">
                <div class="header-left">
                    <a href="/BookingHotel_Prj301" class="logo"> <img src="${pageContext.request.contextPath}/assets/supplier/js/hotel_logo.png" width="50" height="70" alt="logo"> <span class="logoclass">HOTEL</span> </a>
                    <a href="/BookingHotel_Prj301" class="logo logo-small"> <img src="${pageContext.request.contextPath}/assets/supplier/js/hotel_logo.png" alt="Logo" width="30" height="30"> </a>
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
                                                    <img class="avatar-img rounded-circle" alt="User Image" src="${pageContext.request.contextPath}/assets/supplier/js/profiles/avatar-02.jpg">
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
                                                    <img class="avatar-img rounded-circle" alt="User Image" src="${pageContext.request.contextPath}/assets/supplier/js/profiles/avatar-11.jpg">
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
                                                    <img class="avatar-img rounded-circle" alt="User Image" src="${pageContext.request.contextPath}/assets/supplier/js/profiles/avatar-17.jpg">
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
                                                    <img class="avatar-img rounded-circle" alt="User Image" src="${pageContext.request.contextPath}/assets/supplier/js/profiles/avatar-13.jpg">
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
                        <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown"> <span class="user-img"><img class="rounded-circle" src="${pageContext.request.contextPath}/assets/supplier/js/profiles/avatar-01.jpg" width="31" alt="${user.fullname}"></span> </a>
                        <div class="dropdown-menu">
                            <div class="user-header">
                                <div class="avatar avatar-sm"> <img src="${pageContext.request.contextPath}/assets/supplier/js/profiles/avatar-01.jpg" alt="User Image" class="avatar-img rounded-circle"> </div>
                                <div class="user-text">
                                    <h6>${user.fullname}</h6>
                                    <p class="text-muted mb-0">Supplier</p>
                                </div>
                            </div> 
                                <a class="dropdown-item" href="supplierProfileServlet?action=showUpdateProfile&supplierId=${supplierId}">My Profile</a> 
                                <a class="dropdown-item" href="settings.html">Account Settings</a> 
                                <a class="dropdown-item" href="logOutServlet">Logout</a> 
                            </div>
                    </li>
                </ul>
            </div>
             <div class="sidebar" id="sidebar">
                <div class="sidebar-inner slimscroll">
                    <div id="sidebar-menu" class="sidebar-menu">
                        <ul>
                            <li> <a href="/BookingHotel_Prj301"><i class="fas fa-tachometer-alt"></i> <span>Dashboard</span></a> </li>
                            <li class="list-divider"></li>	
                               
                            
                            <li class="submenu"> <a href="#"><i class="fas fa-suitcase"></i> <span> Booking </span> <span class="menu-arrow"></span></a>
                                    <ul class="submenu_class" style="display: none;">
                                            <li><a href="${pageContext.request.contextPath}/displayBookingServlet"> Pending </a></li>
                                            <li><a href="${pageContext.request.contextPath}/displayAcceptedBooking"> Accepted </a></li>
                                            <li><a href="${pageContext.request.contextPath}/displayDeclinedBooking"> Declined </a></li>
                                            <li><a href="${pageContext.request.contextPath}/displayDoneBooking"> Done </a></li>
                                    </ul>
                            </li>
                            <li > <a href="displayCustomerServlet"><i class="fas fa-user"></i> <span> Customers </span></a></li>
                            <li class="submenu"> <a href="#"><i class="fas fa-key"></i> <span> Rooms </span> <span class="menu-arrow"></span></a>
                                <ul class="submenu_class" >
                                    <li><a href="roomManagementServlet?action=listRoom">All Rooms </a></li>

                                    <li><a href="roomManagementServlet?action=showAdd&supplierId=${supplierId}"> Add Rooms </a></li>
                                </ul>
                            </li>

                            <li> <a href="pricing.html"><i class="far fa-money-bill-alt"></i> <span>Pricing</span></a> </li>
                           

                            <li class="submenu"> <a href="#"><i class="far fa-money-bill-alt"></i> <span> Contract </span> <span class="menu-arrow"></span></a>
                                <ul class="submenu_class" style="display: none;">
                                    <li><a href="${pageContext.request.contextPath}/displayPendingContract">Pending </a></li>
                                    <li><a href="${pageContext.request.contextPath}/displayAcceptedContract">Accepted </a></li>
                                    <li><a href="${pageContext.request.contextPath}/displayDeclinedContract">Declined </a></li>
                                    <li><a href="${pageContext.request.contextPath}/displayDoneContract">Done </a></li>
                                </ul>
                            </li>

                            <li> <a href="calendar.html"><i class="fas fa-calendar-alt"></i> <span>Calendar</span></a> </li>
                            <li class="submenu"> <a href="#"><i class="fe fe-table"></i> <span> Reports </span> <span class="menu-arrow"></span></a>
                                <ul class="submenu_class" style="display: none;">
                                    <li><a href="expense-reports.html">Expense Report </a></li>
                                    <li><a href="invoice-reports.html">Invoice Report </a></li>
                                </ul>
                            </li>
 
                            
                        </ul>
                    </div>
                </div>
            </div>
            <div class="page-wrapper">
                <div class="content container-fluid">
                    <div class="page-header">
                        <div class="row align-items-center">
                            <div class="col">
                                <div class="mt-5">
                                    <h4 class="card-title float-left mt-2">Customers</h4> </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="card card-table">
                                <div class="card-body booking_card">
                                    <div class="table-responsive">
                                        <table class="datatable table table-stripped table table-hover table-center mb-0">
                                            <thead>
                                                <tr>
                                                    <th>Customer ID</th>
                                                    <th>Avatar</th>
                                                    <th>Name</th>
                                                    <th>DOB</th>
                                                    <th>Email</th>
                                                    <th>Phone</th>
                                                    <th>Address</th>
                                                    <th>Modified By</th>
                                                    <th>Modified Date</th>
                                                    <th>Created Date</th>
                                                </tr>
                                            </thead>
                                            <tbody>


                                                <c:forEach var="customer" items="${listPage}">
                                                    <tr>
                                                        <td>${customer.id}</td>
                                                        <td><img class="rounded-circle"src="images/supplier/${customer.avatar}"></td>
                                                        <td>${customer.fullname}</td>
                                                        <td>${customer.dob}</td>
                                                        <td>${customer.email}</td>
                                                        <td>${customer.phone}</td>
                                                        <td>${customer.address}</td>

                                                        <td>${customer.modifiedBy}</td>
                                                        <td>${customer.modifiedDate}</td>
                                                        <td>${customer.createdDate}</td>



                                                    </tr>
                                                </c:forEach>



                                            </tbody>
                                        </table>



                                    </div>
                                    
                                    <div class="pagination">
                                        <c:if test="${currentPage > 1}">
                                            <a href="displayCustomerServlet?index=${currentPage - 1}">Previous</a>
                                        </c:if>

                                        <c:forEach begin="1" end="${endPage}" var="i">
                                            <c:choose>
                                                <c:when test="${i eq currentPage}">
                                                    <strong>${i}</strong>
                                                </c:when>
                                                <c:otherwise>
                                                    <a href="displayCustomerServlet?index=${i}">${i}</a>
                                                </c:otherwise>
                                            </c:choose>
                                        </c:forEach>

                                        <c:if test="${currentPage < endPage}">
                                            <a href="displayCustomerServlet?index=${currentPage + 1}">Next</a>
                                        </c:if>
                                    </div>
                                   
                                    
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
                <div id="delete_asset" class="modal fade delete-modal" role="dialog">
                    <div class="modal-dialog modal-dialog-centered">
                        <div class="modal-content">
                            <div class="modal-body text-center"> <img src="assets/img/sent.png" alt="" width="50" height="46">
                                <h3 class="delete_class">Are you sure want to delete this Asset?</h3>
                                <div class="m-t-20"> <a href="#" class="btn btn-white" data-dismiss="modal">Close</a>
                                    <button type="submit" class="btn btn-danger">Delete</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
         <script data-cfasync="false" src="../../../cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/supplier/js/jquery-3.5.1.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/supplier/js/popper.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/supplier/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/supplier/plugins/slimscroll/jquery.slimscroll.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/supplier/plugins/raphael/raphael.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/supplier/plugins/morris/morris.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/supplier/js/chart.morris.js"></script>
        <script src="${pageContext.request.contextPath}/assets/supplier/js/script.js"></script>
    </body>

</html>


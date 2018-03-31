<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html  lang="en">
<head>
<meta charset="UTF-8">
<title>rabs 메인 화면입니다.</title>
<!--   <meta name="viewport" content="width=device-width, initial-scale=1"> -->
<!--   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> -->
<!-- Latest compiled and minified CSS -->

<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"> -->
<%-- <link rel="stylesheet" href="<c:url value='/css/bootstrap.min.css' />" type="text/css"> --%>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<!-- jQuery library -->
<script src="${pageContext.request.contextPath}/js/jquery/jquery.3.3.1.js"></script>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->
<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script> -->
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
    .row.content {height: 450px}
    
    /* Set gray background color and 100% height */
    .sidenav {
      padding-top: 20px;
      background-color: #f1f1f1;
      height: 100%;
    }
    
    /* Set black background color, white text and some padding */
    footer {
      background-color: #555;
      color: white;
      padding: 15px;
    }
    
    /* On small screens, set height to 'auto' for sidenav and grid */
    @media screen and (max-width: 767px) {
      .sidenav {
        height: auto;
        padding: 15px;
      }
      .row.content {height:auto;} 
    }
    
    .vcenter {
    display: inline-block;
    vertical-align: middle;
    float: none;
    }
    
    .rowheader {
    display:block;
    vertical-align: middle;
    float: none;
    margin: 0;
    }
    
    .navheader{
    display:block;
    vertical-align: middle;
    float: none;
    height: 10px;
    }

    a:hover { color: #FF6666 !important;  cursor:pointer }
  </style>
</head>
<body>
  <div id="wrapper">
    
<div class="container">    
  <div class="row ">
    <div class="col-sm-12">
      <c:import url="/PageLink.do?link=main/inc/RabsIncHeader" />
    </div>
  </div>
</div>  

<nav class="navbar-inverse navheader">
  <div class="container-fluid">
    <div class="collapse navbar-collapse" id="myNavbar">
    <%--   <ul class="nav navbar-nav">
        <li class="active"><a href="<c:url value='menu_index4.do' />" target="_mainContents">TEST</a></li>
        <li><a href="<c:url value='menu_index2.do' />" target="_mainContents">About</a></li>
        <li><a href="#">Projects</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul> --%>
    </div>
  </div>
</nav>
 
        <div id="page-wrapper" >
            <div class="container-fluid">  
			  <div class="row content">
			    <div class="col-sm-2 sidenav">
			       <c:import url="/main/inc/Leftmenu.do" />
			    </div>
			    <div class="col-lg-12" id="mainContents" >
                 
                </div>
              </div>  
            </div>
         </div>     
                 
        
        

<!--     <div class="col-sm-2 sidenav">
      <div class="well">
        <p>ADS</p>
      </div>
      <div class="well">
        <p>ADS</p>
      </div>
    </div> -->

<!-- <footer class="container-fluid text-center">
  <p>Footer Text</p>
</footer>
 -->
  </div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>RABS 로그인 </title>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<script type="text/javascript">
$(function(){

	$('#loginBtn').on({'click': function(){
/* 	  	var inputValues =  $(this).parent().closest('form').children('input');
	  	alert( $(this).closest('form').children('input').attr('name')); 
	  	console.log(" xxxxxxxxinputValues" +  	$(inputValues)); */
	    var userId = $('#userId').val();
	  	var password = $('#password').val(); 

        if(userId == '' || password == '' ){
          alert('정보 입력 제대로 좀 ');	
        }else{
	        $('form').submit(function(event){
	          event.preventDefault();
	          console.log( $( this ).serialize() );
	        });
        }
	}});
});
</script>
</head>

<body>

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">로그인</h3>
                    </div>
                    <div class="panel-body"> 
                        <form role="form" action="<c:url value='/login/actionLogin.do' />" >
                            <fieldset>
                                <div class="form-group">
                                    <input id="userId" class="form-control" placeholder="아이디" name="userId" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input id="password" class="form-control" placeholder="비밀번호" name="password" type="password" value="">
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">로그인정보 저장
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <a class="btn btn-lg btn-success btn-block" id="loginBtn"> 로그인 </a>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</body>

</html>


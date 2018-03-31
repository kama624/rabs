<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
<div class="page-header">
  <h5>공통코드관리</h5>
</div>
 <div class="table-responsive">       
  <table class="table table-hover table-bordered table-condensed table-striped">
      <thead>
      <tr>
        <th>순번</th>
        <th>코드아이디</th>
        <th>코드명</th>
        <th>코드설명</th>
      </tr>
    </thead>
    <tbody>
   	<c:forEach var="result" items="${resultList}" varStatus="status">
	   <tr>
	    <td>${status.index + 1}</td>
        <td>${result.CODE_ID}</td>
        <td>${result.CODE_ID_NM}</td>
        <td>${result.CODE_ID_DC}</td>
      </tr>      
	</c:forEach>
    </tbody>
  </table>
  </div>

  </div>
</body>
</html>
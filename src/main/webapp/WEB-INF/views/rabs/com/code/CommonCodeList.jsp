<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
$(function(){
	$('#dataTables').DataTable({
	   // responsive: true
	    info: false
	    ,searching: true
	    ,select: true
	    
	});	
});
</script>
<meta charset="UTF-8">
<title>공통코드 관리 ui 최초 샘플 작업</title>
</head>

<body>

<div class="row">
    <div class="col-lg-12">
          <h3 class="page-header">공통코드관리</h3>
    </div>
</div>

<div class="row">
   <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
<!--                         <div class="panel-heading">
                           
                        </div> -->
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <table width="100%" class="table table-striped table-bordered table-hover" id="dataTables">
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
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
</div>  
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
$(document).ready(function() {    
	$("a").on("click",function(){
		var link = $(this).attr('link'); 
		if(link != null){
			$('#mainContents').load(link, function(responseTxt, statusTxt, xhr){
		        if(404 == statusTxt){
		           $('#mainContents').remove().load("${pageContext.request.contextPath}" + "/PageLink.do?link=common/Error");
		        };
		      
			});
		} 
		else if(link == null)
		{
		  alert('메뉴 링크 주소가 잘못 되었습니다. ');	
		}
	});
	
}); 

</script>
<!-- 메뉴 시작 -->
  <ul class="nav" id="side-menu">
	<c:forEach var="result" items="${resultList}" varStatus="status">
	   	<li>
	   	   <a link = "${pageContext.request.contextPath}<c:out value="${result.listUrl}"/>" >
	   	     <i class="fa fa-dashboard fa-fw"></i>
	   	     <c:out value="${result.order}"/>. <c:out value="${result.name}"/>
	   	   </a>
	     </li>
	</c:forEach>
  </ul>
  
<%--     <div class="btn-group-vertical">
	<c:forEach var="result" items="${resultList}" varStatus="status">
	   	<button type="button" class="btn default " class="link" link = "${pageContext.request.contextPath}<c:out value="${result.listUrl}"/>"
	   	value = "<c:out value="${result.order}"/><c:out value="${result.name}"/>">
	    <p>	<c:out value="${result.order}"/>. <c:out value="${result.name}"/> </p>
	   	</button>
	</c:forEach>
  </div> --%>
<!-- //메뉴 끝 -->
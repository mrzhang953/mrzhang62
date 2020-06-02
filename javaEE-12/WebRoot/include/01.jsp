<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP '01.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%--  //嵌入java代码实现包含： 
     <% 
        // 动态包含：  
    	request.getRequestDispatcher("02.jsp").include(request,response );
     %>
     
      --%>
      
      <%--jsp的动作标签L能够取代java代码，实现包含 --%>
      <jsp:include page="02.jsp">
        	<jsp:param value="lilsi" name="username"/>
      </jsp:include>
  </body>
</html>

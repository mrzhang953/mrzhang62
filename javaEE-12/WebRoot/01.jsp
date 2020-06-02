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
     <!-- pageContext对象获得其他的内置对象 -->
     <%
          HttpServletRequest req= (HttpServletRequest)pageContext.getRequest();// 获得request对象的父对象： 
          HttpServletRequest res= (HttpServletRequest) pageContext.getResponse();//获得response对象：
          
          HttpSession ses= pageContext.getSession();
          
           JspWriter jspW = pageContext.getOut();
      %>
  </body>
</html>

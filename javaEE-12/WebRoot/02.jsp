<%@ page language="java" import="java.util.*,com.yidongxueyuan.bean.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP '02.jsp' starting page</title>
    
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
<%--   <%
     User user = new User();
     user.setUsername("lisi");
  	 pageContext.setAttribute("user",user ); 
   %> 
   --%>
   
   <!-- usrBean 标签： id="制定了属性的名称" class="属性的全路径" 
   	    将user对象创建， 并且存放在pageContext域对象当中
   -->
   <jsp:useBean id="user" class="com.yidongxueyuan.bean.User"></jsp:useBean>
   <jsp:setProperty property="username" value="lisi"  name="user"/>
   <jsp:setProperty property="password" value="212121" name="user"/>
   
  <%-- 	<%
  		User u = (User) pageContext.getAttribute("user");
  		out.println(u);
  		Stringh name = u.getUsername();
  		out.println(name);
  	 %> --%>
  	 
  	 <jsp:getProperty property="username" name="user"/>
  	 <jsp:getProperty property="password" name="user"/>
  </body>
</html>

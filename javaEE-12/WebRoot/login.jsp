<%@page import="java.net.URLDecoder"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <script type="text/javascript">
  
  	//定义js函数： 
  	function changeImage(){
  		//alert("xx");
  		
  		//获得img标签对应的对象：
  		var imageEle = document.getElementById("image1");
  		
  		//给当前的属性src赋值：  
  		imageEle.src="/javaEE-10/servlet/VerifyCodeServlet2?time="+new Date().getTime();
  	}
  </script>
  <%
   String msg = ""; 
  //获得了request对象当中的错误的信息
  	String message = (String) request.getAttribute("msg");
  	if(message !=null){
  		msg = message;
  	}
  	
  	
  	//获得cookie对象：
     Cookie cookies []= request.getCookies();
     String val =null; 
     if(cookies!=null){
     	 for(Cookie cookie :cookies){
     	    String name=  cookie.getName();
     	    if(name.equalsIgnoreCase("username")){
     	         val = cookie.getValue();
     	         //解码
     	         val = URLDecoder.decode(val, "gbk");
     	    }
     	 }
     }
  	
  	
   %>
  <font color='red' size="7">  <%=msg %> </font>
  <body>
     <form action="/javaEE-12/servlet/UserLoginServlet" method="post">
     	 用户名: <input type="text" name="username" value="<%=val %>" /><br/>
     	 密&nbsp;码<input type="password" name="password"/><br/>
     	 验证码：<input type="text" name="verifyCode" size="4"/>
     	  <img id="image1" alt="验证码的信息" src="/javaEE-10/servlet/VerifyCodeServlet2" onclick="changeImage();"  >
     	 <!--  <a href="javascript:changeImage();"> 看不清， 换一张</a> -->
     	 <input type="submit" value="提交"/>
     </form>
  </body>
  
</html>

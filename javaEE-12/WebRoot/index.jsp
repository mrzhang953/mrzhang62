<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>pageContext对象代理其他的域对象</title>
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
    <%
    	 //向pageContext当中存值：
    	 pageContext.setAttribute("page", "pageContext"); 
    	 
    	 //指定域存值： 
    	 pageContext.setAttribute("page", "pageContext2",  PageContext.PAGE_SCOPE );// 向PageContext域当中存值：
    	 pageContext.setAttribute("request", "request",  PageContext.REQUEST_SCOPE );// 向request域当中存值：
    	 pageContext.setAttribute("session", "session",  PageContext.SESSION_SCOPE );// 向session域当中存值：
    	 pageContext.setAttribute("application", "application",  PageContext.APPLICATION_SCOPE );// 向application域当中存值：
    	 
    	//制定域对象取值：  
    	 String val1 = (String)pageContext.getAttribute("page");// pageContext域对象当中取值：
    	 String val2 = (String)pageContext.getAttribute("request",PageContext.REQUEST_SCOPE);
    	 String val3 = (String)pageContext.getAttribute("session",PageContext.SESSION_SCOPE);
    	 String val4 = (String)pageContext.getAttribute("application",PageContext.APPLICATION_SCOPE);
    	 out.println(val1);
    	 out.println(val2);
    	 out.println(val3);
    	 out.println(val4);
    	 
    	 out.println("<hr/>");
    	 /*
    	 findAttribute(); 能够全域当中进行查询： 查询的顺序，小域到大域：  pageContext request Session  Application
    	 */
    	String v1=(String) pageContext.findAttribute("page");//pageContext
    	String v2= (String)pageContext.findAttribute("request");//request
    	String v3= (String)pageContext.findAttribute("session");//
    	String v4= (String)pageContext.findAttribute("application");//
    	  out.println(v1);
    	  out.println(v2);
    	  out.println(v3);
    	  out.println(v4);
    	  
    	 out.println("<hr/>");
    	//向不同的域当中存值： 属性的名称： 
    	// pageContext.setAttribute("name", "pageContext2",  PageContext.PAGE_SCOPE );// 向PageContext域当中存值：
    	// pageContext.setAttribute("name", "request",  PageContext.REQUEST_SCOPE );// 向request域当中存值：
    	// pageContext.setAttribute("name", "session",  PageContext.SESSION_SCOPE );// 向session域当中存值：
    	// pageContext.setAttribute("name", "application",  PageContext.APPLICATION_SCOPE );// 向application域当中存值：  
    	  
    		String value=(String) pageContext.findAttribute("name");//pageContext  
    		out.println(value);
    		
     %>
  </body>
</html>

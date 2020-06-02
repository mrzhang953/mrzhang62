package com.yidongxueyuan.web.servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.yidongxueyuan.bean.User;
import com.yidongxueyuan.util.ToBean;

public class UserLoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		try {
			//
/*			request.getParameter(arg0)
			Map<String,String> map = request.getParameterMap();// Map<String, String []>
			System.out.println(map);
			
			User user = new User();
			BeanUtils.populate(user, map);
			System.out.println(user);*/
			
			
			//使用工具类， 封装数据： 
			User user = ToBean.toBean(request.getParameterMap(), User.class);
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

package com.fuan.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * value 和 urlPatterns 功能一样，不可同时使用，所有属性中只有value可以省略
 * 
 * @author Login
 *
 */
@WebServlet(urlPatterns = { "/some", "/jjj" }, name = "Some-Servlet", // 设置Servlet名称
		initParams = { @WebInitParam(name = "company", value = "fulan"), // 设置初始化参数
				@WebInitParam(name = "myname", value = "zsg") }, loadOnStartup = 2// 应用启动时创建Servlet实例
)
public class SomeServlet extends javax.servlet.http.HttpServlet {

	public SomeServlet() {
		System.out.println("SomeServlet被创建了");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append("Saved at Servlet 3.0 <br>");
		
		//获取servletname 
		String servletName = this.getServletName();
		out.append("servletName:"+servletName+"<br><hr>");
		
		//获取初始化参数
		Enumeration<String> names = this.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = this.getInitParameter(name);
			out.append(name+" = "+value+"<br>");
		}
		
	}

}

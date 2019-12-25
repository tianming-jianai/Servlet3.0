package com.fuan.filter;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


//@WebFilter(dispatcherTypes = {
//				DispatcherType.REQUEST, 
//				DispatcherType.FORWARD, 
//				DispatcherType.INCLUDE, 
//				DispatcherType.ERROR
//		}
//					, urlPatterns = { "/*" })
//@WebFilter(servletNames="Some-Servlet")
//@WebFilter(value="/*",dispatcherTypes=DispatcherType.FORWARD)//只过滤请求转发
@WebFilter(value="/*",dispatcherTypes=DispatcherType.REQUEST)//只过滤请求转发
public class SomeFilter implements Filter {

    
    public SomeFilter() {
        
    }

	
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("=========== before ===========");
		chain.doFilter(request, response);
		System.out.println("=========== end ===========");
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}

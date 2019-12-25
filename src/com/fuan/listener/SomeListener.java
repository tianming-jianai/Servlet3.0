package com.fuan.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 	两种方式同时存在：(xml/注解)
 * 	
 * @author Login
 *
 */
@WebListener
public class SomeListener implements ServletContextListener {

    
    public SomeListener() {
        
    }

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("应用启动");
	}
	
}

package com.huluohu.learning.springboot.n2.core.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/19
 * Time           :   13:52
 * Description    :
 */
public class DemoContextListener implements ServletContextListener {
	@Override public void contextInitialized(ServletContextEvent sce) {
		System.out.println("context init:" + sce.getServletContext().getMinorVersion());
	}

	@Override public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("context destroy:" + sce.getServletContext().getMinorVersion());
	}
}

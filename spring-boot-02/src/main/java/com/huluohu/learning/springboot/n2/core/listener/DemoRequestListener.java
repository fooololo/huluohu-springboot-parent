package com.huluohu.learning.springboot.n2.core.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/19
 * Time           :   14:17
 * Description    :
 */
public class DemoRequestListener implements ServletRequestListener {
	@Override public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request destroy:" + sre.getServletRequest().getLocalName());
	}

	@Override public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("request init:" + sre.getServletRequest().getLocalName());
	}
}

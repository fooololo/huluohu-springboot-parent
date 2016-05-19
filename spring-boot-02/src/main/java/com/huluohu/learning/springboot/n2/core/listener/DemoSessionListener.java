package com.huluohu.learning.springboot.n2.core.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/19
 * Time           :   14:14
 * Description    :
 */
public class DemoSessionListener implements HttpSessionListener {
	@Override public void sessionCreated(HttpSessionEvent se) {
		System.out.println("session created:" + se.getSession());
	}

	@Override public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("session destroy:" + se.getSession());
	}
}

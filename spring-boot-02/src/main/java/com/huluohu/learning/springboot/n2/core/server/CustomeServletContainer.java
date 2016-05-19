package com.huluohu.learning.springboot.n2.core.server;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.http.HttpStatus;

import java.util.concurrent.TimeUnit;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/19
 * Time           :   14:25
 * Description    :	自定义容器配置，一般直接在配置文件里配置，
 * 此处配置优先级高于配置文件
 */
//@Component
public class CustomeServletContainer implements EmbeddedServletContainerCustomizer {
	@Override public void customize(ConfigurableEmbeddedServletContainer container) {
		container.setPort(9090);
		container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.html"));
		container.setSessionTimeout(30, TimeUnit.MINUTES);
	}
}

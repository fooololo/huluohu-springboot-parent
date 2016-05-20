package com.huluohu.learning.springboot.n2.core.config;

import com.huluohu.learning.springboot.n2.core.filter.DemoFilter;
import com.huluohu.learning.springboot.n2.core.listener.DemoContextListener;
import com.huluohu.learning.springboot.n2.core.listener.DemoRequestListener;
import com.huluohu.learning.springboot.n2.core.listener.DemoSessionListener;
import com.huluohu.learning.springboot.n2.core.properties.TomcatSSLProperties;
import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.boot.context.embedded.ServletListenerRegistrationBean;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/19
 * Time           :   12:00
 * Description    :  可以重写一下mvc的配置
 */
@Configuration
@EnableConfigurationProperties({ TomcatSSLProperties.class})
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Autowired
	TomcatSSLProperties tomcatSSLProperties;

	@Override public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/").setViewName("/");
		registry.addViewController("/ws").setViewName("/ws");
		registry.addViewController("/login").setViewName("/login");
		registry.addViewController("/").setViewName("/login");
		registry.addViewController("/chat").setViewName("/chat");
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean(){
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new DemoFilter());
		registrationBean.setOrder(2);
		return registrationBean;
	}

	@Bean
	public ServletListenerRegistrationBean<DemoContextListener> servletContextListener(){
		return new ServletListenerRegistrationBean<>(new DemoContextListener());
	}

	@Bean
	public ServletListenerRegistrationBean<DemoSessionListener> sessionListener(){
		return new ServletListenerRegistrationBean<>(new DemoSessionListener());
	}

	@Bean
	public ServletListenerRegistrationBean<DemoRequestListener> requestListener(){
		return new ServletListenerRegistrationBean<>(new DemoRequestListener());
	}

	@Bean
	public EmbeddedServletContainerFactory servletContainerFactory(){
		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
		//增加ssl连接器
		tomcat.addAdditionalTomcatConnectors(sslConnector());
		return tomcat;
	}

	private Connector sslConnector() {
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		Http11NioProtocol protocol = (Http11NioProtocol) connector.getProtocolHandler();
		connector.setPort(tomcatSSLProperties.getPort());
		connector.setSecure(tomcatSSLProperties.isSecure());
		connector.setScheme(tomcatSSLProperties.getSchema());

		protocol.setSSLEnabled(tomcatSSLProperties.isSsl());
		protocol.setKeystoreFile(tomcatSSLProperties.getKeyStore().getAbsolutePath());
		protocol.setKeystorePass(tomcatSSLProperties.getKeyStorePassword());
		protocol.setKeyPass(tomcatSSLProperties.getKeyPassword());
		protocol.setKeyAlias(tomcatSSLProperties.getKeyAlias());
		return connector;
	}

	@Override public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/static/**").addResourceLocations("/resources/static/");
		registry.addResourceHandler("/resources/templates/**").addResourceLocations("/resources/templates/");
	}

	//	@Bean
//	public EmbeddedServletContainerFactory servletContainerFactory(){
//		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
//			@Override protected void postProcessContext(Context context) {
//				SecurityConstraint securityConstraint = new SecurityConstraint();
//				securityConstraint.setUserConstraint("CONFIDENTIAL");
//
//				SecurityCollection securityCollection = new SecurityCollection();
//				securityCollection.addPattern("/*");
//
//				securityConstraint.addCollection(securityCollection);
//				context.addConstraint(securityConstraint);
//			}
//		};
//		tomcat.addAdditionalTomcatConnectors(httpConnection());
//		return tomcat;
//	}
//
//	private Connector httpConnection() {
//		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//		connector.setScheme("http");
//		connector.setPort(8080);
//		connector.setSecure(false);
//		connector.setRedirectPort(8443);
//		return connector;
//	}
}

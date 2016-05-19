package com.huluohu.learning.springboot.n2.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/19
 * Time           :   16:16
 * Description    :		WebSocket配置
 * 广播式：服务端有消息时，会将消息发送给所有连接了当前endpoint的浏览器
 */
@Configuration
@EnableWebSocketMessageBroker//开启STOMP协议
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
	/**
	 * 注册STOMO协议的节点，并映射URL
	 * @param registry
	 */
	@Override public void registerStompEndpoints(StompEndpointRegistry registry) {
		//使用SockJS协议
		registry.addEndpoint("/endpointHuluohu").withSockJS();
		registry.addEndpoint("/endpointChat").withSockJS();
	}

	/**
	 * 配置消息代理
	 * @param registry
	 */
	@Override public void configureMessageBroker(MessageBrokerRegistry registry) {
		//广播式应配置一个/topic消息代理
		registry.enableSimpleBroker("/topic");
		registry.enableSimpleBroker("/queue","/topic");
	}
}

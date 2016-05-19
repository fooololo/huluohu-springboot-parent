package com.huluohu.learning.springboot.n2.controller;

import com.huluohu.learning.springboot.n2.vo.HuluohuMessage;
import com.huluohu.learning.springboot.n2.vo.HuluohuResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/19
 * Time           :   16:27
 * Description    :
 * @MessageMapping:类似于@RequestMapping,当浏览器想服务端发送请求时，映射这个地址
 * @SendTo:当服务端有消息时，会对订阅了此路径的浏览器发送消息
 */
@Controller
public class WebSocketController {
	@Autowired
	SimpMessagingTemplate messagingTemplate;

	/**
	 * 广播式测试
	 * @param message
	 * @return
	 * @throws InterruptedException
	 */
	@MessageMapping("/welcome")
	@SendTo("/topic/getResponse")
	public HuluohuResponse say(HuluohuMessage message) throws InterruptedException {
		Thread.sleep(2000);
		HuluohuResponse huluohuResponse = new HuluohuResponse("Welcome," + message.getName());
		return huluohuResponse;
	}

	/**
	 * 点对点测试
	 */
	@MessageMapping("/chat")
	public void handleChat(Principal principal,String msg){
		if("huluohu".equals(principal.getName())){
			messagingTemplate.convertAndSendToUser("admin","/queue/notifications",principal.getName()+"-send:" + msg);
		}else{
			messagingTemplate.convertAndSendToUser("huluohu","/queue/notifications",principal.getName()+"-send:" + msg);
		}
	}
}

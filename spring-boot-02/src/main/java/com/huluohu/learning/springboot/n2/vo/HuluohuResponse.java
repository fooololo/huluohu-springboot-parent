package com.huluohu.learning.springboot.n2.vo;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/19
 * Time           :   16:26
 * Description    :		服务端向浏览器发送的消息
 */
public class HuluohuResponse {
	private String responseMsg;

	public HuluohuResponse() {
	}

	public HuluohuResponse(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
}

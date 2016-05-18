package com.huluohu.learning.springboot.n1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/18
 * Time           :   16:23
 * Description    :
 */
//开启自动配置
@SpringBootApplication(exclude = {},scanBasePackages = "com.huluohu.learning.springboot.n1")
public class Application {

	//启动内嵌容器
	public static void main(String[] args) {
		SpringApplication.run(Application.class,args);

		/** 定制 **/
//		SpringApplication app = new SpringApplication(Application.class);
//		app.setShowBanner(false);
	}
}

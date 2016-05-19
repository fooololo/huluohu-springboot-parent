package com.huluohu.learning.springboot.n2;

import com.huluohu.learning.springboot.n2.core.converter.MyMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by huluohu on 2016/5/18.
 */
@SpringBootApplication(scanBasePackages = {"com.huluohu.learning.springboot.n2"})
public class Application extends WebMvcConfigurerAdapter{
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Bean
    public HttpMessageConverters httpMessageConverters(){
		HttpMessageConverter<?> converter = new MyMessageConverter();
		return new HttpMessageConverters(converter);
	}
}

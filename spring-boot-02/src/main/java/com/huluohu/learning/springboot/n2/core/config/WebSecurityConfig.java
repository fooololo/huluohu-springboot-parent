package com.huluohu.learning.springboot.n2.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/19
 * Time           :   18:31
 * Description    :
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Override protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.antMatchers("/","/login").permitAll()//不拦截
				.anyRequest().authenticated()
				.and()
				.formLogin()
				.loginPage("/login")//设置登录页的访问路径
				.defaultSuccessUrl("/chat")//设置登录成功后转向路径
				.permitAll()
				.and()
				.logout()
				.permitAll();
	}

	@Override protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
				.inMemoryAuthentication()//在内存中配置两个用户
				.withUser("huluohu").password("huluohu").roles("USER")
				.and()
				.withUser("admin").password("admin").roles("USER");
	}

	@Override public void configure(WebSecurity web) throws Exception {
		web
				.ignoring()//设置不拦截的路径
				.antMatchers("/resources/static/**");
	}
}

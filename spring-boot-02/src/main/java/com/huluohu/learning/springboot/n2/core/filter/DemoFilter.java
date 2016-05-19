package com.huluohu.learning.springboot.n2.core.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/19
 * Time           :   13:51
 * Description    :
 */
public class DemoFilter extends OncePerRequestFilter {
	@Override protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
			FilterChain filterChain) throws ServletException, IOException {
		System.out.println("demo filter:" + request.getRequestURL());
		filterChain.doFilter(request,response);
	}
}

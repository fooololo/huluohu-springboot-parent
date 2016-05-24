package com.huluohu.learning.springboot.n2.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Company        :   mamahao.com
 * author         :   guxiaolong
 * Date           :   2016/5/24
 * Time           :   18:18
 * Description    :
 */
@Configuration
public class DataSourceConfiguration {

	@Bean(name = "primaryDataSource")
	@Qualifier("primaryDataSource")
	@ConfigurationProperties(prefix="spring.datasource.primary")
	public DataSource primaryDataSource(){
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "secondaryDataSource")
	@Qualifier("secondaryDataSource")
	@ConfigurationProperties(prefix="spring.datasource.secondary")
	public DataSource secondaryDataSource(){
		return DataSourceBuilder.create().build();
	}
}

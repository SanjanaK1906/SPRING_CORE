package com.cdac.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.cdac.spring")
@EnableWebMvc
public class ProjectConfig {
	@Bean
	public ViewResolver getResolver() {
		InternalResourceViewResolver view= new InternalResourceViewResolver();
		view.setSuffix(".jsp");
		view.setPrefix("/WEB-INF/views/");
		return view;
	}
}

package com.springcookbook.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Spring configuration class. (Java class replacement to spring-servlet.xml.)
 * 
 * @author Inka
 */

// This declares it as a Spring configuration class
@Configuration
//This enables Spring's ability to receive and process web requests
@EnableWebMvc
//This scans the com.springcookbook.controller package for Spring components
@ComponentScan(basePackages = "com.springcookbook.controller")

public class AppConfig {
	 @Bean
	    public ViewResolver viewResolver() {
	        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setViewClass(JstlView.class);
	        viewResolver.setPrefix("/WEB-INF/views/");
	        viewResolver.setSuffix(".jsp");
	 
	        return viewResolver;
	    }
}

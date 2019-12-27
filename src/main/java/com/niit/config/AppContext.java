package com.niit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.niit.*")
public class AppContext implements WebMvcConfigurer
{
	
	@Bean
	public ViewResolver viewResolver()
	{
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	 public void addResourceHandlers(ResourceHandlerRegistry registry) 
	   {
//	       registry.addResourceHandler("/images/**") 
//	                 .addResourceLocations("/WEB-INF/resources/images/");
	       registry.addResourceHandler("/css/**") 
         			.addResourceLocations("/WEB-INF/css/")
         			.setCachePeriod(999999);
//	       registry.addResourceHandler("/js/**") 
//					.addResourceLocations("/WEB-INF/resources/js/");
//	       registry.addResourceHandler("/videos/**") 
//					.addResourceLocations("/WEB-INF/resources/videos/");
//	       registry.addResourceHandler("/data1/**") 
//			.addResourceLocations("/WEB-INF/resources/data1/");
//	       registry.addResourceHandler("/engine1/**") 
//			.addResourceLocations("/WEB-INF/resources/engine1/");
//	       registry.addResourceHandler("/resources/**").addResourceLocations("/WEB-INF/resources/*");
	   }
	 
	    
	   public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) 
	   {
	       configurer.enable();
	   }
}

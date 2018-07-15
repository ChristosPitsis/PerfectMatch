package com.christos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
public class Config extends WebMvcConfigurerAdapter {

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {

	    //set path extension to true
	    configurer.favorPathExtension(false).
	    //set favor parameter to false
	    favorParameter(true).
	    //the favour parameter is set to "mediaType" instead of default "format"
	    parameterName("mediaType").
	    //ignore the accept headers
	    ignoreAcceptHeader(true).
	    //dont use Java Activation Framework since we are manually specifying the mediatypes required below
	    useJaf(false).
	    defaultContentType(MediaType.APPLICATION_XML).
	    mediaType("xml", MediaType.APPLICATION_XML).
	    mediaType("json", MediaType.APPLICATION_JSON);
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	    configurer.enable();
	}
}
package com.restFull_services.resFull_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.MessageSourceResourceBundle;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;
import java.util.ResourceBundle;

@SpringBootApplication
public class ResFullDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResFullDemoApplication.class, args);
	}
 @Bean
	public LocaleResolver localeResolver(){
		SessionLocaleResolver localeResolver = new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
          return localeResolver;
	}

	@Bean
	public ResourceBundleMessageSource resourceBundleMessageSource(){
		 ResourceBundleMessageSource  messageSource= new ResourceBundleMessageSource();
          messageSource.setBasename("message");
		  return messageSource;
	}



}

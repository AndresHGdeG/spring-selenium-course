package com.udemy.spring.springseleniumcourse.config;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BrowserScopeConfig {

    /**
     * Connect spring with the new scope
     * @return Bean scope
     */
    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new BrowserScopePostProcessor();
    }

}

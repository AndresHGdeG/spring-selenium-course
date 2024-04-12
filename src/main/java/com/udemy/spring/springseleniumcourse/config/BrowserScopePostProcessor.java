package com.udemy.spring.springseleniumcourse.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BrowserScopePostProcessor implements BeanFactoryPostProcessor {

    /**
     * Register the new scope
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        beanFactory.registerScope("browserscope", new BrowserScope());
    }
}

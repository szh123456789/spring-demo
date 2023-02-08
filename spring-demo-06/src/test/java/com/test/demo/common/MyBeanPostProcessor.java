package com.test.demo.common;

import com.test.beans.BeanException;
import com.test.beans.factory.config.BeanPostProcessor;
import com.test.demo.bean.UserService;

import javax.jnlp.UnavailableServiceException;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessorBeforeInitialization(Object bean, String beanName) throws BeanException {
        if ("userService".equals(beanName)){
            UserService userService = (UserService) bean;
            userService.setLocation("改为北京");
        }
        return bean;
    }

    @Override
    public Object postProcessorAfterInitialization(Object bean, String beanName) throws BeanException {
        return bean;
    }
}

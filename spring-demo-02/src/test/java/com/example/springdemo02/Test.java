package com.example.springdemo02;

import factory.config.BeanDefinition;
import factory.suuport.DefaultListableBeanFactory;


public class Test {

    @org.junit.Test
    public void beanTest(){

        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        defaultListableBeanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) defaultListableBeanFactory.getBean("userService");
        userService.setBeanSuccess();

        UserService userService1 = (UserService) defaultListableBeanFactory.getBean("userService");
        userService1.setBeanSuccess();
    }
}

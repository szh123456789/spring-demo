package com.example.springdemo01;

import Bean.BeanDefinition;
import Bean.BeanFactory;



public class Test {

    @org.junit.Test
    public void beanTest(){
        BeanDefinition beanDefinition =new BeanDefinition(new UserService());

        BeanFactory beanFactory = new BeanFactory();

        beanFactory.setBeanMap("userBean", beanDefinition.getBean());

        UserService userService = (UserService)beanFactory.getBeanByName("userBean");

        userService.setBeanSuccess();
    }
}

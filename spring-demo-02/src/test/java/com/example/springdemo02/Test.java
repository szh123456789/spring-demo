package com.example.springdemo02;

import factory.config.BeanDefinition;
import factory.suuport.DefaultListableBeanFactory;


public class Test {

    @org.junit.Test
    public void beanTest(){

        //实例化beanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();

        //向beanFactory注册bean对象
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        defaultListableBeanFactory.registerBeanDefinition("userService", beanDefinition);

        //根据beanName获取bean的单例
        UserService userService = (UserService) defaultListableBeanFactory.getBean("userService");
        userService.setBeanSuccess();

        //因为第一次获取后，进行了缓存，所以第二次是在内存中获取
        UserService userService1 = (UserService) defaultListableBeanFactory.getBean("userService");
        userService1.setBeanSuccess();
    }
}

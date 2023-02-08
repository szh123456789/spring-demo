package com.test.demo;

import com.test.beans.factory.support.DefaultListableBeanFactory;
import com.test.beans.factory.xml.XmlBeanDefinitionReader;
import com.test.context.support.ClassPathXmlApplicationContext;
import com.test.demo.bean.UserService;
import com.test.demo.common.MyBeanFactoryPostProcessor;
import com.test.demo.common.MyBeanPostProcessor;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_BeanFactoryPostProcessorAndBeanPostProcessor(){

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        MyBeanFactoryPostProcessor beanFactoryPostProcessor = new MyBeanFactoryPostProcessor();
        beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);

        MyBeanPostProcessor beanPostProcessor = new MyBeanPostProcessor();
        beanFactory.addBeanPostProcessor(beanPostProcessor);

        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

    @Test
    public void test_xml(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:springPostProcessor.xml");

        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果:"+result);
    }
}
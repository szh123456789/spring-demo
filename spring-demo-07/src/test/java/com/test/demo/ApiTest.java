package com.test.demo;

import com.test.context.support.ClassPathXmlApplicationContext;
import com.test.demo.bean.UserService;
import org.junit.Test;

public class ApiTest {

    /**
     * 使用上下文
     */
    @Test
    public void test_xml(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果:"+result);
    }

    @Test
    public void test_hook(){
        Runtime.getRuntime().addShutdownHook(new Thread(() -> System.out.println("close!")));
    }
}

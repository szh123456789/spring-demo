package com.test.facaory.config;

/**
 * bean对象单例的注册与获取
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}

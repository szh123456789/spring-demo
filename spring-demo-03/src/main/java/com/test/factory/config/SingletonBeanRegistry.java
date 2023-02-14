package com.test.factory.config;

/**
 * 单例对象注册，获取
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}

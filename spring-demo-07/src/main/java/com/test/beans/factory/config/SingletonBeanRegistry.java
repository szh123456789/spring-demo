package com.test.beans.factory.config;

/**
 * 单例对象注册
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}

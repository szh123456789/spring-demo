package com.test.beans.factory.support;

import com.test.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 对象实例化接口
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args);
}

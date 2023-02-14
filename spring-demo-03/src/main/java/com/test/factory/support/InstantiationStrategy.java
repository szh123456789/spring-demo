package com.test.factory.support;

import com.test.BeanException;
import com.test.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 对象实例化接口类
 */
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeanException;
}

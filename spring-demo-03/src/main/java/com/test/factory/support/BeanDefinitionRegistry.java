package com.test.factory.support;

import com.test.factory.config.BeanDefinition;

/**
 * 注册bean对象
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}

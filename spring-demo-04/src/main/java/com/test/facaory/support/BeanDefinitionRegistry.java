package com.test.facaory.support;

import com.test.facaory.config.BeanDefinition;

/**
 * bean对象注册
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}

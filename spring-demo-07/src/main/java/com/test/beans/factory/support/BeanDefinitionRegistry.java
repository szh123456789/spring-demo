package com.test.beans.factory.support;

import com.test.beans.factory.config.BeanDefinition;

/**
 * bean对象的注册与获取
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    BeanDefinition getBeanDefinition(String beanName);

    boolean containsBeanDefinition(String beanName);

    String[] getBeanDefinitionNames();
}

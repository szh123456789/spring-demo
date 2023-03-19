package com.test.beans.factory.config;

import com.test.beans.BeanException;
import com.test.beans.factory.ConfigurableListableBeanFactory;

/**
 *
 * 允许自定义修改 BeanDefinition 属性信息
 *
 */
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition加载完成后，实例化Bean对象之前，提供修改BeanDefinition属性的机制
     * @param beanFactory
     * @throws BeanException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeanException;
}

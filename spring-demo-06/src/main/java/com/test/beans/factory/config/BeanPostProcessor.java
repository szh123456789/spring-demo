package com.test.beans.factory.config;

import com.test.beans.BeanException;

public interface BeanPostProcessor {

    /**
     * bean对象执行初始化方法之前，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeanException
     */
    Object postProcessorBeforeInitialization(Object bean, String beanName) throws BeanException;

    /**
     * bean对象执行初始化方法后，执行此方法
     * @param bean
     * @param beanName
     * @return
     * @throws BeanException
     */
    Object postProcessorAfterInitialization(Object bean, String beanName) throws BeanException;
}

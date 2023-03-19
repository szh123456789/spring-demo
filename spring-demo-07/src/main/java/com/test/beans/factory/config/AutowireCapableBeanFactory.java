package com.test.beans.factory.config;

import com.test.beans.BeanException;
import com.test.beans.factory.BeanFactory;

public interface AutowireCapableBeanFactory extends BeanFactory {

    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeanException;

    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeanException;
}

package com.test.beans.factory;

import com.test.beans.BeanException;

import java.util.Map;

/**
 * 返回注册的bean对象
 */
public interface ListableBeanFactory extends BeanFactory{

    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeanException;

    String[] getBeanDefinitionNames();
}

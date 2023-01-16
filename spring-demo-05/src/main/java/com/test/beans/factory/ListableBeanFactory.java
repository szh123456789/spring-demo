package com.test.beans.factory;

import com.test.beans.BeanException;

import java.util.Map;

public interface ListableBeanFactory extends BeanFactory{

    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeanException;

    String[] getBeanDefinitionNames();
}

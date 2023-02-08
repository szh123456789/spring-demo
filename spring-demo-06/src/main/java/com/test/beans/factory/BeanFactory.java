package com.test.beans.factory;

import com.test.beans.BeanException;

public interface BeanFactory {

    Object getBean(String name) throws BeanException;

    Object getBean(String name, Object... args) throws BeanException;

    <T> T  getBean(String name, Class<T> requiredType) throws BeanException;
}

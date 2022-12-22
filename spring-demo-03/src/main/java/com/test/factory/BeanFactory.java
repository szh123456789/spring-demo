package com.test.factory;

import com.test.BeanException;

public interface BeanFactory {

    Object getBean(String name) throws BeanException;

    Object getBean(String name, Object... args) throws BeanException;
}

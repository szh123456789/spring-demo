package com.test.factory;

import com.test.BeanException;

/**
 * 获取bean实例
 */
public interface BeanFactory {

    Object getBean(String name) throws BeanException;

    Object getBean(String name, Object... args) throws BeanException;
}

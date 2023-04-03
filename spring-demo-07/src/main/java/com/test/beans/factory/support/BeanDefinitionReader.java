package com.test.beans.factory.support;

import com.test.beans.BeanException;
import com.test.core.io.Resource;
import com.test.core.io.ResourceLoader;

/**
 * 加载bean对象所处的资源文件
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeanException;

    void loadBeanDefinitions(Resource... resources) throws BeanException;

    void loadBeanDefinitions(String location) throws BeanException;

    void loadBeanDefinitions(String[] locations) throws BeanException;
}

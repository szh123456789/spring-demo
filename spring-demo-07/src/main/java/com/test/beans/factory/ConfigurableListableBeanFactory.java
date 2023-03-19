package com.test.beans.factory;

import com.test.beans.BeanException;
import com.test.beans.factory.config.AutowireCapableBeanFactory;
import com.test.beans.factory.config.BeanDefinition;
import com.test.beans.factory.config.ConfigurableBeanFactory;

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeanException;

    void preInstantiateSingletons() throws BeanException;
}

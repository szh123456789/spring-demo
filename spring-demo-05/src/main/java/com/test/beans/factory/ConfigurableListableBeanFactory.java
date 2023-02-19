package com.test.beans.factory;

import com.test.beans.BeanException;
import com.test.beans.factory.config.AutowireCapableBeanFactory;
import com.test.beans.factory.config.BeanDefinition;
import com.test.beans.factory.config.ConfigurableBeanFactory;

/**
 * 配置修改bean工厂列表中存放的bean对象，也可以分析与修改bean对象的定义，以及提前实例化bean
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeanException;
}

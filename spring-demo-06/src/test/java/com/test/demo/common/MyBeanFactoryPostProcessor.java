package com.test.demo.common;

import com.test.beans.BeanException;
import com.test.beans.PropertyValue;
import com.test.beans.PropertyValues;
import com.test.beans.factory.ConfigurableListableBeanFactory;
import com.test.beans.factory.config.BeanDefinition;
import com.test.beans.factory.config.BeanFactoryPostProcessor;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeanException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();
        propertyValues.addPropertyValues(new PropertyValue("company", "改为字节跳动"));
    }
}

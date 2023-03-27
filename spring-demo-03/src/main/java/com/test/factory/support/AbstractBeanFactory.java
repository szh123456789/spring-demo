package com.test.factory.support;

import com.test.BeanException;
import com.test.factory.BeanFactory;
import com.test.factory.config.BeanDefinition;

/**
 * 根据beanName获取bean对象
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    @Override
    public Object getBean(String name) throws BeanException {
        return doGetBean(name, null);
    }

    @Override
    public Object getBean(String name, Object... args) throws BeanException {
        return doGetBean(name, args);
    }

    /**
     * 根据beanName和参数列表来选择要获取的bean对象
     * @param name
     * @param args
     * @param <T>
     * @return
     */
    protected <T> T doGetBean(final String name, final Object[] args){
        Object bean = getSingleton(name);

        if (bean != null){
            return (T)bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return (T) createBean(name, beanDefinition, args);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);
}

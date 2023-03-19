package com.test.context.support;

import com.test.beans.BeanException;
import com.test.beans.factory.ConfigurableListableBeanFactory;
import com.test.beans.factory.config.BeanFactoryPostProcessor;
import com.test.beans.factory.config.BeanPostProcessor;
import com.test.context.ConfigurableApplicationContext;
import com.test.core.io.DefaultResourceLoader;

import java.util.Map;

/**
 * 处理spring.xml配置文件资源的加载
 */
public abstract class AbstractApplicationContext extends DefaultResourceLoader implements ConfigurableApplicationContext {

    @Override
    public void refresh() throws BeanException {

        //1. 创建BeanFactory，并加载BeanDefinition
        refreshBeanFactory();

        //2.获取beanFactory
        ConfigurableListableBeanFactory beanFactory = getBeanFactory();

        //3.在Bean实例化之前，激活BeanFactoryPostProcessors
        invokeBeanFactoryPostProcessors(beanFactory);

        //4.BeanPostProcessors需要提前与其他Bean对象实例化之前实现注册
        registerBeanPostProcessors(beanFactory);

        //5.提前实例化单例Bean对象
        beanFactory.preInstantiateSingletons();
    }

    @Override
    public void registerShutdownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread(this::close));
    }

    @Override
    public void close() {
        getBeanFactory().destroySingletons();
    }

    protected abstract void refreshBeanFactory() throws BeanException;

    protected abstract ConfigurableListableBeanFactory getBeanFactory();

    private void invokeBeanFactoryPostProcessors(ConfigurableListableBeanFactory beanFactory) {
        Map<String, BeanFactoryPostProcessor> beanFactoryPostProcessorMap = beanFactory.getBeansOfType(BeanFactoryPostProcessor.class);
        for (BeanFactoryPostProcessor beanFactoryPostProcessor : beanFactoryPostProcessorMap.values()){
            beanFactoryPostProcessor.postProcessBeanFactory(beanFactory);
        }
    }

    private void registerBeanPostProcessors(ConfigurableListableBeanFactory beanFactory){
        Map<String, BeanPostProcessor> beanPostProcessorMap = beanFactory.getBeansOfType(BeanPostProcessor.class);
        for (BeanPostProcessor beanPostProcessor : beanPostProcessorMap.values()){
            beanFactory.addBeanPostProcessor(beanPostProcessor);
        }
    }

    @Override
    public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeanException {
        return getBeanFactory().getBeansOfType(type);
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return getBeanFactory().getBeanDefinitionNames();
    }

    @Override
    public Object getBean(String name, Object... args) throws BeanException {
        return getBeanFactory().getBean(name, args);
    }

    @Override
    public Object getBean(String name) throws BeanException {
        return getBeanFactory().getBean(name);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeanException {
        return getBeanFactory().getBean(name, requiredType);
    }
}

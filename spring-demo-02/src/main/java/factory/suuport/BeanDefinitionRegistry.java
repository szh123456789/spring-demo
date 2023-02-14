package factory.suuport;

import factory.config.BeanDefinition;

/**
 * 注册bean实例
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String BeanName, BeanDefinition beanDefinition);
}

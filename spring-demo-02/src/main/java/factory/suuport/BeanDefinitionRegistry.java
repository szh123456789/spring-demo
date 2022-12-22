package factory.suuport;

import factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String BeanName, BeanDefinition beanDefinition);
}

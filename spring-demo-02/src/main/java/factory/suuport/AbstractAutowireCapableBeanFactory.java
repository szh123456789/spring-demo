package factory.suuport;

import factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;

        try {
            bean = beanDefinition.getClass().newInstance();
        }catch (Exception e){
            throw new RuntimeException("Instantiation of bean failed", e);
        }

        registerSingleton(beanName, beanDefinition);

        return bean;
    }
}

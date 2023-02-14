package factory.suuport;

import factory.config.BeanDefinition;

public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory{

    @Override
    public Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;

        try {
            //bean类型实例化
            bean = beanDefinition.getBean().newInstance();
        }catch (Exception e){
            throw new RuntimeException("Instantiation of bean failed", e);
        }

        //bean对象单例注册
        registerSingleton(beanName, bean);

        return bean;
    }
}

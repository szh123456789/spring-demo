package factory.suuport;

import factory.BeanFactory;
import factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    /**
     * 根据beanName获取bean对象，
     * @param beanName
     * @return
     */
    @Override
    public Object getBean(String beanName) {
        //获取bean单例
        Object bean =  getSingleton(beanName);

        if (null != bean){
            return bean;
        }

        //如果没有获取bean实例，获取bean的Class信息
        BeanDefinition beanDefinition = getBeanDefinition(beanName);

        //创建bean对象
        return createBean(beanName, beanDefinition);
    }

    public abstract BeanDefinition getBeanDefinition(String beanName);

    public abstract Object createBean(String beanName, BeanDefinition beanDefinition);
}

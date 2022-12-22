package factory.suuport;

import factory.config.BeanDefinition;

import java.util.Map;

public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry{

    public Map<String, BeanDefinition> beanDefinitionMap;

    @Override
    public BeanDefinition getBeanDefinition(String beanName) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);

        if (null == beanDefinition){
            throw new RuntimeException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public void registerBeanDefinition(String BeanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(BeanName, beanDefinition);
    }
}

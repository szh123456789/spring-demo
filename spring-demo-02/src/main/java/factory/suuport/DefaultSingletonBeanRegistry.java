package factory.suuport;

import factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> mapBean = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return mapBean.get(beanName);
    }

    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        mapBean.put(beanName, singletonObject);
    }
}

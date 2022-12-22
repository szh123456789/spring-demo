package factory.config;

public interface SingletonBeanRegistry {


    public Object getSingleton(String beanName);

    public void registerSingleton(String beanName, Object singletonObject);
}

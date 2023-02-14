package factory.config;

/**
 * 单例对象存储与获取接口
 */
public interface SingletonBeanRegistry {


    Object getSingleton(String beanName);

    void registerSingleton(String beanName, Object singletonObject);
}

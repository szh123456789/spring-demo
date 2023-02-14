package factory;

/**
 * 获取对象工厂类接口
 */
public interface BeanFactory {

    Object getBean(String beanName);
}

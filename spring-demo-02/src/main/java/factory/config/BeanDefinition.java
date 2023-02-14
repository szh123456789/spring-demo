package factory.config;

/**
 * 定义bean实例信息
 */
public class BeanDefinition {

    Class bean;

    public BeanDefinition(Class bean){
        this.bean = bean;
    }

    public Class getBean(){
        return bean;
    }

    public void setBean(Class bean){this.bean = bean;}
}

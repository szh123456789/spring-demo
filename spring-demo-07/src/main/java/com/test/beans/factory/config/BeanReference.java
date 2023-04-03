package com.test.beans.factory.config;

/**
 * 目前理解为一个实体类作为另一个类的属性值的引用类型
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName){
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}

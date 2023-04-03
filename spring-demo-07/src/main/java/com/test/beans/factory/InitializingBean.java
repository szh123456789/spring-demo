package com.test.beans.factory;

/**
 * 初始化对象接口
 */
public interface InitializingBean {

    /**
     * 在bean对象属性填充完成后调用
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;
}

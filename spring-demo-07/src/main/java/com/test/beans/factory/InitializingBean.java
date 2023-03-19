package com.test.beans.factory;

public interface InitializingBean {

    /**
     * 在bean对象属性填充完成后调用
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;
}

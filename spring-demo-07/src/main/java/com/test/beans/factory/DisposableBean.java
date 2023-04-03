package com.test.beans.factory;

/**
 * 销毁对象接口
 */
public interface DisposableBean {

    void destroy() throws Exception;
}

package com.test.context;

import com.test.beans.BeanException;

/**
 * 第三方调用服务接口
 */
public interface ConfigurableApplicationContext extends ApplicationContext{

    /**
     * 刷新容器
     * @throws BeanException
     */
    void refresh() throws BeanException;

    void registerShutdownHook();

    void close();
}

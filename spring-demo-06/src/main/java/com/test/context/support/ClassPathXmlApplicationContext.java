package com.test.context.support;

import com.test.beans.BeanException;

/**
 * xml 文件应用上下文，是具体对外用户提供的
 */
public class ClassPathXmlApplicationContext extends AbstractXmlApplicationContext{

    private String[] configLocations;

    public ClassPathXmlApplicationContext(){
    }

    /**
     * 从XML中加载BeanDefinition，并刷新上下文
     * @param configLocations
     * @throws BeanException
     */
    public ClassPathXmlApplicationContext(String configLocations) throws BeanException{
        this(new String[]{configLocations});
    }

    /**
     * 从XML中加载BeanDefinition，并刷新上下文
     * @param configLocations
     * @throws BeanException
     */
    public ClassPathXmlApplicationContext(String[] configLocations) throws BeanException{
        this.configLocations = configLocations;
        refresh();
    }

    @Override
    protected String[] getConfigLocations() {
        return configLocations;
    }


}

package com.test.util;

/**
 * 类加载工具类
 */
public class ClassUtils {

    public static ClassLoader getDefaultClassLoader(){
        ClassLoader cl = null;
        try {
            cl = Thread.currentThread().getContextClassLoader();
        }catch (Throwable ex){

        }
        if (cl == null){
            cl = ClassUtils.class.getClassLoader();
        }
        return cl;
    }
}

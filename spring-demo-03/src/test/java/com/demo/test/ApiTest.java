package com.demo.test;

import com.demo.test.bean.UserService;
import com.test.factory.config.BeanDefinition;
import com.test.factory.support.DefaultListableBeanFactory;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService", "小哥哥");
        userService.queryUserInfo();
    }

    /**
     * 验证无构造函数实例化
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    @Test
    public void test_newInstance() throws IllegalAccessException, InstantiationException{
        UserService userService = UserService.class.newInstance();
        System.out.println(userService);
    }

    /**
     * 验证有构造函数的实例化
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws InstantiationException
     */
    @Test
    public void test_constructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException{
        Class<UserService> userServiceClass = UserService.class;
        Constructor<UserService> declaredConstructor = userServiceClass.getDeclaredConstructor(String.class);
        UserService userService = declaredConstructor.newInstance("小哥哥");
        System.out.println(userService);
    }

    /**
     * 获取构造函数
     * @throws Exception
     */
    @Test
    public void test_parameterTypes() throws Exception{
        Class<UserService> beanClass = UserService.class;
        Constructor<?>[] declaredConstructors = beanClass.getDeclaredConstructors();
        Constructor<?> constructor = declaredConstructors[0];
        Constructor<UserService> declaredConstructor = beanClass.getDeclaredConstructor(constructor.getParameterTypes());
        UserService userService = declaredConstructor.newInstance("小小哥");
        System.out.println(userService);
    }

    /**
     * cglib实例化
     */
    @Test
    public void test_cglib(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new NoOp() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        });
        Object obj = enhancer.create(new Class[]{String.class}, new Object[]{"小哥哥"});
        System.out.println(obj);
    }
}

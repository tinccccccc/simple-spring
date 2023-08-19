package com.study.simplespring;

import com.study.simplespring.step01.BeanDefinition;
import com.study.simplespring.step01.BeanFactory;

public class Test {
    public static void main(String[] args) {

        //初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //注册 bean 对象
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}

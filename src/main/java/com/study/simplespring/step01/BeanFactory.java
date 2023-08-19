package com.study.simplespring.step01;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {

    private Map<String,BeanDefinition> beanDefinitionMap = new HashMap<>();

    /**
     * 根据 beanName 获取 bean
     *
     * @param name
     * @return
     */
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    /**
     * 注册 bean 对象的定义信息
     *
     * @param name
     * @param beanDefinition
     */
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}

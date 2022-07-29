package com.zhs.dive.util;
 
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
 
@Component
public class ApplicationContextUtil implements ApplicationContextAware{
    private static ApplicationContext applicationContext;//spring上下文
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationContextUtil.applicationContext=applicationContext;
    }
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }
 
    public static <T> T getBean(String name) throws BeansException{
           return (T)applicationContext.getBean(name);
    }

    public static <T> T getBean(String name,Class<T> clazz) throws BeansException{
        return applicationContext.getBean(name,clazz);
    }
}
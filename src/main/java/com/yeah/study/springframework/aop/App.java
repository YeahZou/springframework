package com.yeah.study.springframework.aop;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        // 获取已定义的bean
        // System.out.println(Arrays.asList(ctx.getBeanDefinitionNames()));
        Chinese p = ctx.getBean("chinese", Chinese.class);
        
        System.out.println(p.sayHello("Nick"));
        
        
        p.eat("fruit");
    }
}

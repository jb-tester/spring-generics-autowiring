package com.mytests.spring.genericsAutowiringTests.test5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.applet.Main;

/**
 * *
 * <p>Created by irina on 21.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
public class RunTest5 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:test5.xml");
        MainBean mainBean = ctx.getBean(MainBean.class);
         mainBean.display();
    }
}

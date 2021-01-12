package com.mytests.spring.genericsAutowiringTests.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * *
 * <p>Created by irina on 12.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
public class RunTest1 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig1.class);
        UseGenericService0 useGenericService0 = ctx.getBean(UseGenericService0.class);
        System.out.println(useGenericService0.getService0_string().getArg());
        System.out.println(useGenericService0.getService0_number().getArg());
        System.out.println(useGenericService0.getService0_raw().getArg());
    }

}
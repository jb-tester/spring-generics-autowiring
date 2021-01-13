package com.mytests.spring.genericsAutowiringTests.test3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * *
 * <p>Created by irina on 13.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
public class RunTest3 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig3.class);
         UseEmptyServicesCollectionInConstructor compo1 = ctx.getBean(UseEmptyServicesCollectionInConstructor.class);
        System.out.println(compo1.getServices());
         UseEmptyServicesCollectionByFieldInjection compo2 = ctx.getBean(UseEmptyServicesCollectionByFieldInjection.class);
        System.out.println(compo2.getServices());
    }

}
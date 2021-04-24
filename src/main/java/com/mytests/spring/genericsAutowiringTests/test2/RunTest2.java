package com.mytests.spring.genericsAutowiringTests.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * *
 * <p>Created by irina on 12.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
public class RunTest2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig2.class);
        UseService1<Number> useService1 = ctx.getBean(UseService1.class);
        System.out.println("List<Service1<T>> case:");
        List<Service1<Number>> service1List1 =  useService1.getService1TList();
        for (Service1<Number> s1 : service1List1) {
            System.out.println(s1.getArg());
        }
        System.out.println("List<Service1> case:");
        
        List<Service1> service1List2 =  useService1.getService1RawList();
        for (Service1 s1 : service1List2) {
            System.out.println(s1.getArg());
        }
        System.out.println("List<Service1<Integer>> case:");
        
        List<Service1<Integer>> service1List3 =  useService1.getService1IntegerList();
        for (Service1<Integer> s1 : service1List3) {
            System.out.println(s1.getArg());
        }
        System.out.println("Service<T> case (should use primary candidate):");
        System.out.println(useService1.getTService1().getArg());
        System.out.println("Service<Integer> case (should use primary candidate):");
        System.out.println(useService1.getIntegerService1().getArg());
        System.out.println("Raw Service case (should use primary candidate):");
        System.out.println(useService1.getRawService1().getArg());
        System.out.println("Service<Integer> with qualifier case:");
        System.out.println(useService1.getIntegerService1Qualified().getArg());
        System.out.println("Service<Float> case:");
        System.out.println(useService1.getFloatService1().getArg());
        System.out.println("Component of generic type injecting as parameterized beans:");
        UseGenericService1 useGenericService1 = ctx.getBean(UseGenericService1.class);
        useGenericService1.display();
    }

}
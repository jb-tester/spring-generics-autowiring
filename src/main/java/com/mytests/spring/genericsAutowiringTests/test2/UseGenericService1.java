package com.mytests.spring.genericsAutowiringTests.test2;

import org.springframework.stereotype.Component;

@Component
public class UseGenericService1 {
    
    final GenericService1<String> s1;
    final GenericService1<Integer> s2;
    final GenericService1 s3;
    // attempts to inject the generic type bean using parameter
    public UseGenericService1(GenericService1<String> s1,
                              GenericService1<Integer> s2,
                              GenericService1 s3
    ) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    public void display(){
        
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}

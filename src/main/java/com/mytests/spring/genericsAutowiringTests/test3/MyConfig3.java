package com.mytests.spring.genericsAutowiringTests.test3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * *
 * <p>Created by irina on 13.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
@Configuration
@ComponentScan
public class MyConfig3 {

    @Bean
    Foo foo(List<Bar> bars)    // no autowiring error - ok
    {
        return new Foo();
    }
    @Bean 
    Boo boo(){
        return new Boo();
    }
    static class Foo {}
    static class Bar {}
    static class Boo {
        
        @Autowired(required = false) List<Bar> bars;   // no autowiring error if required is set to true - incorrect!
    }
}

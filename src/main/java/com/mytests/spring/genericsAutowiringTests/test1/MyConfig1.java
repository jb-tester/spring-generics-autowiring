package com.mytests.spring.genericsAutowiringTests.test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Date;

/**
 * *
 * <p>Created by irina on 12.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
@Configuration
@ComponentScan
public class MyConfig1 {

    @Bean
    public GenericService0<String> string() {
        return new GenericService0<String>("service2_string");
    }
    @Bean
    public GenericService0<Integer> number() {
        return new GenericService0<Integer>(1000);
    }
    @Bean @Primary
    public GenericService0<Date> date() {
        return new GenericService0<Date>(new Date());
    }
    @Bean
    public GenericService0 service0() {
        return new GenericService0<>(true);
    }
}

package com.mytests.spring.genericsAutowiringTests.test4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 13.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
@Configuration
@ComponentScan
public class MyConfig4 {

    @Bean
    public Bean4 bean41() {
        return new Bean4();
    }
    @Bean
    public Bean4 bean42() {
        return new Bean4();
    }
    @Bean
    public Bean4 bean43() {
        return new Bean4();
    }
    
}

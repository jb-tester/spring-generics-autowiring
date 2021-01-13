package com.mytests.spring.genericsAutowiringTests.test4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * *
 * <p>Created by irina on 13.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
@Component
public class UseBean4ListAsFieldInjection {
    
    @Autowired
    List<Bean4> bean4List;
    
    
}

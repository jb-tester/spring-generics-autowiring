package com.mytests.spring.genericsAutowiringTests.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 12.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
@Component
public class UseGenericService0 {
    // IDEA-158473 Spring: generics as autowiring qualifiers: multiple candidates are shown if bean of generic type w/o parameter exists
    @Autowired
    private GenericService0<String> service0_string; // incorrectly shows both 'string' and 'service2' as autowire candidates - fixed

    @Autowired
    private GenericService0<Integer> service0_number;  // incorrectly shows both 'number' and 'service2' as autowire candidates - fixed
    
    @Autowired
    private GenericService0 service0_raw;

    public GenericService0<String> getService0_string() {
        return service0_string;
    }

    public GenericService0<Integer> getService0_number() {
        return service0_number;
    }

    public GenericService0 getService0_raw() {
        return service0_raw;
    }
}

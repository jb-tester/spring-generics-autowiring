package com.mytests.spring.genericsAutowiringTests.test2;

import org.springframework.stereotype.Component;

@Component
public class GenericService1<T> {
    
    @Override
    public String toString() {
        return "GenericService1";
    }
}

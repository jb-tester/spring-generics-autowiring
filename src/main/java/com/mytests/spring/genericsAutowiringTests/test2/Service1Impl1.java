package com.mytests.spring.genericsAutowiringTests.test2;

import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 12.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
@Component
public class Service1Impl1<T> implements Service1<Integer> {
    @Override
    public Integer getArg() {
        return 100;
    }
}

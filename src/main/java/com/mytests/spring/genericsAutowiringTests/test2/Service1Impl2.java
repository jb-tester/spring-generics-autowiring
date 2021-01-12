package com.mytests.spring.genericsAutowiringTests.test2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 12.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
@Component 
public class Service1Impl2<T> implements Service1<Float> {
    @Override
    public Float getArg() {
        return 3.14f ;
    }
}

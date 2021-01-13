package com.mytests.spring.genericsAutowiringTests.test4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * *
 * <p>Created by irina on 13.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
@Component
public class UseBean4ArrayAsConstructorInjection {
    
    final
    Bean4[] bean4Array;


    public UseBean4ArrayAsConstructorInjection(Bean4[] bean4Array) {
        this.bean4Array = bean4Array;
    }
}

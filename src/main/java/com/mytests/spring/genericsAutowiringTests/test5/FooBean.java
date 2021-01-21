package com.mytests.spring.genericsAutowiringTests.test5;

/**
 * *
 * <p>Created by irina on 21.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
public class FooBean {
          String foo;

    public FooBean(String foo) {
        this.foo = foo;
    }

    @Override
    public String toString() {
        return "FooBean: " + foo;
    }
}

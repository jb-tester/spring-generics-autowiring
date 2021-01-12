package com.mytests.spring.genericsAutowiringTests.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * *
 * <p>Created by irina on 12.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
@Component
public class UseService1<T> {
    
    // IDEA-259324 Spring: no autowiring candidates are shown for injection of collection of parametrized type beans
    @Autowired
    List<Service1<T>> service1TList;  // no autowiring candidates are shown
    @Autowired 
    List<Service1<Integer>> service1IntegerList;   // no autowiring candidates are shown
    @Autowired
    List<Service1> service1RawList;  // ok

    // IDEA-259323 Spring: no autowiring candidates are shown for parametrized generic type injections
    @Autowired Service1 rawService1;  // ok
    @Autowired @Qualifier("service1Impl1") Service1<Integer> integerService1Qualified;  // ok
    @Autowired Service1<T> tService1;  // no autowiring candidates found error
    @Autowired Service1<Integer> integerService1; // no autowiring candidates found error
    @Autowired Service1<Float> floatService1; // no autowiring candidates found error

    
    public List<Service1<T>> getService1TList() {
        return service1TList;
    }

    public List<Service1> getService1RawList() {
        return service1RawList;
    }

    public List<Service1<Integer>> getService1IntegerList() {
        return service1IntegerList;
    }

    public Service1<T> getTService1() {
        return tService1;
    }

    public Service1<Integer> getIntegerService1() {
        return integerService1;
    }

    public Service1 getRawService1() {
        return rawService1;
    }

    public Service1<Float> getFloatService1() {
        return floatService1;
    }

    public Service1<Integer> getIntegerService1Qualified() {
        return integerService1Qualified;
    }
}

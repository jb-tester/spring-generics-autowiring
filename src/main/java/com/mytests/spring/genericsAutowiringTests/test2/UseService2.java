package com.mytests.spring.genericsAutowiringTests.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * *
 * <p>Created by irina on 12.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
@Component("useService2")
public class UseService2 {

    final
    List<Service2> service2List;
    // if the elements of the collection have the not-generic type, everything is ok
    public UseService2(List<Service2> service2List) {
        this.service2List = service2List;
    }
}

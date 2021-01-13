package com.mytests.spring.genericsAutowiringTests.test3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * *
 * <p>Created by irina on 13.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
@Component
public class UseEmptyServicesCollectionInConstructor {
    final
    List<NoImplementationsService> services;
    // IDEA-239923 Spring autowiring inspection reports false positive for List types - fixed
    public UseEmptyServicesCollectionInConstructor(List<NoImplementationsService> services) {
        this.services = services;
    }

    public List<NoImplementationsService> getServices() {
        return services;
    }
}

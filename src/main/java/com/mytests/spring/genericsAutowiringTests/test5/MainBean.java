package com.mytests.spring.genericsAutowiringTests.test5;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

/**
 * *
 * <p>Created -- by irina on 21.01.2021.</p>
 * <p>Project: spring-generics-autowiring</p>
 * *
 */
public class MainBean {
    
    @Autowired
    Set<FooBean> fooset;  // correct navigation and completion

    @Resource(name = "foo2")  // correct navigation and completion
    FooBean fooBean;
    
    @Resource(name = "fooList")  // completion suggest only <util:set> beans, but can show all beans of FooBean type also; attempt to populate with list causes error marker
    Set<FooBean> fooBeanSet;
    
    @Resource(name = "fooSet") // completion suggest only <util:list> beans, but can show all beans of FooBean type also; attempt to populate with set causes error marker
    List<FooBean> fooBeanList;
    
    @Autowired
    FooBean[] fooArray;   // correct navigation and completion

    @Resource(name = "typedFooList") // completion shows all beans from all contexts; error is shown on attempt to populate with list or set
    FooBean[] fooBeansArray;

    public FooBean[] getFooArray() {
        return fooArray;
    }

    public FooBean[] getFooBeansArray() {
        return fooBeansArray;
    }

    public Set<FooBean> getFooset() {
        return fooset;
    }

    public FooBean getFooBean() {
        return fooBean;
    }

    public Set<FooBean> getFooBeanSet() {
        return fooBeanSet;
    }

    public List<FooBean> getFooBeanList() {
        return fooBeanList;
    }

    public void display(){
        System.out.println("-- by resource name: " + getFooBean().toString());
        System.out.println("-- by set<FooBean> type: ");
        for (FooBean fooBean : getFooset()) {
            System.out.println(fooBean.toString());
        }
        System.out.println("-- by set<FooBean> resource name: ");
        for (FooBean fooBean : getFooBeanSet()) {
            System.out.println(fooBean.toString());
        }
        System.out.println("-- by list<FooBean> resource name: ");
        for (FooBean fooBean : getFooBeanList()) {
            System.out.println(fooBean.toString());
        }
        System.out.println("-- by FooBean[] type: ");
        for (FooBean fooBean : getFooArray()) {
            System.out.println(fooBean.toString());
        }
        System.out.println("-- by FooBean[] resource name: ");
        for (FooBean fooBean : getFooBeansArray()) {
            System.out.println(fooBean.toString());
        }
    }
}

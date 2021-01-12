package com.mytests.spring.genericsAutowiringTests.test1;

public class GenericService0<T> {
    public T getArg() {
        return arg;
    }

    private final T arg;

    public GenericService0(T arg) {
         this.arg = arg;
     }       
    
}
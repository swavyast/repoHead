package com.ml.creational.abstractFactory1;

/**
 * Abstract factory named Human
 * */
public interface Human<T> {
    
    T create(int age);
}

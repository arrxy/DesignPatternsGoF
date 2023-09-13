package com.example.designpatternsgof.Creational.Decorator.datasource;

// STEP 1 - create a product interface
public interface Datasource {
    String read();
    void write(String value);
}

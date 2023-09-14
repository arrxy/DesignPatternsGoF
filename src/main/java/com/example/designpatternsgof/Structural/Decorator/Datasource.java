package com.example.designpatternsgof.Structural.Decorator;

// STEP 1 - create a product interface
public interface Datasource {
    String read();
    void write(String value);
}

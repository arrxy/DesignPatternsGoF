package com.example.designpatternsgof.Structural.Decorator;

//STEP 2: Concrete Product Class
public class FileDataSource implements Datasource{
    @Override
    public String read() {
        return "Base";
    }

    @Override
    public void write(String value) {
        System.out.println(value);
    }
}

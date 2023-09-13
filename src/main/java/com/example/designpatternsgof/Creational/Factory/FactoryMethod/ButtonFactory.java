package com.example.designpatternsgof.Creational.Factory.FactoryMethod;

public interface ButtonFactory {
    Button createButton(Double radius, Double length, Double border);
}

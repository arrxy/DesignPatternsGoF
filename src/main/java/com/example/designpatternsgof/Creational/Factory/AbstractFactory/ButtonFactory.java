package com.example.designpatternsgof.Creational.Factory.AbstractFactory;

public interface ButtonFactory {
    Button createButton(Double radius, Double length, Double border);
}

package com.example.designpatternsgof.Creational.Factory.FactoryMethod;

public class RoundButtonFactory implements ButtonFactory{
    @Override
    public Button createButton(Double radius, Double length, Double border) {
        return new RoundBtn(radius, border);
    }
}

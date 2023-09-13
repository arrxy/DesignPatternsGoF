package com.example.designpatternsgof.Creational.Factory.AbstractFactory;

public class SquareButtonFactory implements ButtonFactory {
    @Override
    public Button createButton(Double radius, Double length, Double border) {
        return new SquareBtn(length, border) ;
    }
}

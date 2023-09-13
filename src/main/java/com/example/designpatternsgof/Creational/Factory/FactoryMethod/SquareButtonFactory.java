package com.example.designpatternsgof.Creational.Factory.FactoryMethod;

import com.example.designpatternsgof.Creational.Factory.FactoryMethod.ButtonFactory;

public class SquareButtonFactory implements ButtonFactory {
    @Override
    public Button createButton(Double radius, Double length, Double border) {
        return new SquareBtn(length, border) ;
    }
}

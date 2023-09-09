package com.example.designpatternsgof.Creational.Factory.SimpleFactory;

public class ButtonFactory {

    public static Button createButton(ScreenSize screenSize, Double border, Double radius, Double length) {
        switch (screenSize) {
            case PHONE : return new RoundBtn(radius, border);
            case DESKTOP: return new SquareBtn(length, border);
        }
        throw new IllegalArgumentException("Invalid type:" +screenSize);
    }
}

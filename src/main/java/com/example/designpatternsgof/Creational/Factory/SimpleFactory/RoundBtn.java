package com.example.designpatternsgof.Creational.Factory.SimpleFactory;

import com.example.designpatternsgof.Creational.Factory.SimpleFactory.Button;

public class RoundBtn extends Button {
    private Double radius;
    private Double border;

    public RoundBtn(Double radius, Double border) {
        super(border);
        this.radius = radius;
    }

    @Override
    public void onClick() {
        System.out.println("Round button was clicked !!");
    }

    @Override
    public void render() {
        System.out.println("Rendered");
    }

}

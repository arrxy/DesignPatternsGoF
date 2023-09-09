package com.example.designpatternsgof.Creational.Factory.SimpleFactory;


import com.example.designpatternsgof.Creational.Factory.SimpleFactory.Button;

public class SquareBtn extends Button {
    private Double length;
    private Double border;

    public SquareBtn(Double length, Double border) {
        super(border);
        this.length = length;
    }

    @Override
    public void onClick() {
        System.out.println("Square button was clicked !!");
    }

    @Override
    public void render() {
        System.out.println("Rendered");
    }
}

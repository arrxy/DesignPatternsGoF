package com.example.designpatternsgof.Creational.Factory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SquareBtn {
    private Double length;
    private Double border;

    void onClick() {
        System.out.println("Square button was clicked !!");
    }

    void render() {
        System.out.println("Rendered");
    }
}

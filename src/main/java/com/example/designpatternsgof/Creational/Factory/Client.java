package com.example.designpatternsgof.Creational.Factory;

public class Client {
    public static void main(String[] args) {
        RoundBtn roundBtn = new RoundBtn(10.0, 1.0);
        SquareBtn swBtn = new SquareBtn(10.0, 1.0);
    }
}

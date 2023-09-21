package com.example.designpatternsgof.Behavioral.Strategy;

import lombok.AllArgsConstructor;

public class Navigator {
    private NavigationStrategy navigationStrategy = new FourWheelerStrategy();

    public void setStrategy(NavigationStrategy strategy) {
        navigationStrategy = strategy;
    }

    public void navigate() {
        navigationStrategy.navigate();
    }

}

package com.example.designpatternsgof.Creational.Prototype;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

// STEP 2: Implement the clonable interface
@Setter
@NoArgsConstructor
@Data
public class BackgroundObject implements GraphicalObject {
    private Double x;
    private Double y;
    private Double width;
    private Double height;
    private BackgroundType type;

    @Setter(AccessLevel.NONE) // Do Not create a setter
    private List<Double> pixels = new ArrayList<>();

    public BackgroundObject(Double x, Double y, Double width, Double height, BackgroundType type) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.type = type;
        this.pixels = generatePixels();
    }

    public BackgroundObject(BackgroundObject backgroundObject) {
        this.x = backgroundObject.x;
        this.y = backgroundObject.y;
        this.width = backgroundObject.width;
        this.height = backgroundObject.height;
        this.type = backgroundObject.type;
        this.pixels = backgroundObject.pixels;
    }

    private List<Double> generatePixels() {
        return new ArrayList<>();
    }

    @Override
    public BackgroundObject clone() {
        return new BackgroundObject(this);
    }
}

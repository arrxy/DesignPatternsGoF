package com.example.designpatternsgof.Creational.Prototype.Game;

// STEP 1: CREATE A CLONABLE INTERFACE
@FunctionalInterface
public interface GraphicalObject {
    GraphicalObject clone();
}

package com.example.designpatternsgof.Creational.Prototype;

public class Client {
    public static void main(String[] args) {
        BackgroundObject tree = new BackgroundObject(0.0, 0.0, 10.0, 10.0, BackgroundType.TREE);
        BackgroundObjectRegistry.addPrototype(tree);
        BackgroundObject tr = BackgroundObjectRegistry.getPrototype(BackgroundType.TREE);
        BackgroundObject treeCopy = tr.clone();

        treeCopy.setX(11.0);
        treeCopy.setY(11.0);
    }
}

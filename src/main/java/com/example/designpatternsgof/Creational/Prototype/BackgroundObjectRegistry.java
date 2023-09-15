package com.example.designpatternsgof.Creational.Prototype;

import java.util.LinkedHashMap;
import java.util.Map;

public class BackgroundObjectRegistry {

    private static Map<BackgroundType, BackgroundObject> registry = new LinkedHashMap<>();
    public static void addPrototype(BackgroundObject backgroundObject) {
        registry.put(backgroundObject.getType(), backgroundObject);
    }

    public static void removePrototype(BackgroundType backgroundType) {
        registry.remove(backgroundType);
    }

    public static BackgroundObject getPrototype(BackgroundType backgroundType) {
        return registry.get(backgroundType);
    }
}

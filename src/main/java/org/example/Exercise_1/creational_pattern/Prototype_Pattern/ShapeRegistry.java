package org.example.Exercise_1.creational_pattern.Prototype_Pattern;

import java.util.HashMap;
import java.util.Map;

// Registry to store and clone shape prototypes
public class ShapeRegistry {
    private Map<String, Shape> shapes = new HashMap<>();

    public void addShape(String key, Shape shape) {
        shapes.put(key, shape);
    }

    public Shape getShape(String key) {
        return shapes.get(key).clone();
    }
}


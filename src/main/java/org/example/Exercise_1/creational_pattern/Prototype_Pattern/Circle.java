package org.example.Exercise_1.creational_pattern.Prototype_Pattern;

// Concrete prototype for Circle
public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    // Clone method for creating a new instance of Circle
    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }

    // Method to draw the Circle
    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}


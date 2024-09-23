package org.example.Exercise_1.creational_pattern.Prototype_Pattern;

// Concrete prototype for Rectangle
public class Rectangle implements Shape {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Clone method for creating a new instance of Rectangle
    @Override
    public Shape clone() {
        return new Rectangle(this.width, this.height);
    }

    // Method to draw the Rectangle
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width: " + width + " and height: " + height);
    }
}


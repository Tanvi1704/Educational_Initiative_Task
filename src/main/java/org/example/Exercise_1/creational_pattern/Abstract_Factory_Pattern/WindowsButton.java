package org.example.Exercise_1.creational_pattern.Abstract_Factory_Pattern;

// Concrete product: Windows button
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button");
    }
}


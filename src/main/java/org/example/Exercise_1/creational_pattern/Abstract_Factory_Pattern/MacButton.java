package org.example.Exercise_1.creational_pattern.Abstract_Factory_Pattern;

// Concrete product: Mac button
public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac Button");
    }
}


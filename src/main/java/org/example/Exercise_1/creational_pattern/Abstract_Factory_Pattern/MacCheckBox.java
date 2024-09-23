package org.example.Exercise_1.creational_pattern.Abstract_Factory_Pattern;

// Concrete product: Mac checkbox
public class MacCheckBox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Mac Checkbox");
    }
}


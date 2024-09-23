package org.example.Exercise_1.creational_pattern.Abstract_Factory_Pattern;

// Concrete product: Windows checkbox
public class WindowsCheckBox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows Checkbox");
    }
}


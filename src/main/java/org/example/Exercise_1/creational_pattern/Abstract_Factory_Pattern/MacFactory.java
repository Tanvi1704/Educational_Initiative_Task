package org.example.Exercise_1.creational_pattern.Abstract_Factory_Pattern;

// Concrete factory for creating Mac GUI components
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckBox();
    }
}


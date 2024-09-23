package org.example.Exercise_1.creational_pattern.Abstract_Factory_Pattern;

// Concrete factory for creating Windows GUI components
public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckBox();
    }
}


package org.example.Exercise_1.creational_pattern.Abstract_Factory_Pattern;

// Abstract factory interface for creating buttons and checkboxes
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

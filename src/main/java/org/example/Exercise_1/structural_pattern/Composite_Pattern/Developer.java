package org.example.Exercise_1.structural_pattern.Composite_Pattern;

// Leaf class, cannot have subordinates
public class Developer implements Employee {
    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String getDetails() {
        return "Developer: " + name + ", Position: " + position;
    }
}


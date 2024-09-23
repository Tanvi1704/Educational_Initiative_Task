package org.example.Exercise_1.structural_pattern.Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

// Composite class that can have subordinates
public class Manager implements Employee {
    private String name;
    private String department;
    private List<Employee> subordinates;

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
        this.subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public String getDetails() {
        return "Manager: " + name + ", Department: " + department;
    }

    public void showSubordinates() {
        for (Employee employee : subordinates) {
            System.out.println(employee.getDetails());
        }
    }
}


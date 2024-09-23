package org.example.Exercise_1.behavioural_pattern.State_Pattern;

// Base interface for different states
public interface State {
    void insertMoney(VendingMachine vendingMachine);
    void dispenseItem(VendingMachine vendingMachine);
}


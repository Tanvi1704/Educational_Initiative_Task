package org.example.Exercise_1.behavioural_pattern.State_Pattern;

// Context class for the vending machine
public class VendingMachine {
    private State state;

    public VendingMachine() {
        this.state = new IdleState(); // Initial state is idle
    }

    // Set the current state of the vending machine
    public void setState(State state) {
        this.state = state;
    }

    // Method to insert money
    public void insertMoney() {
        state.insertMoney(this);
    }

    // Method to dispense an item
    public void dispenseItem() {
        state.dispenseItem(this);
    }
}


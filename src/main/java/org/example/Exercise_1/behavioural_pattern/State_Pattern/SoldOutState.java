package org.example.Exercise_1.behavioural_pattern.State_Pattern;

// State representing the vending machine being sold out
public class SoldOutState implements State {
    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Vending machine is sold out.");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("No items to dispense.");
    }
}

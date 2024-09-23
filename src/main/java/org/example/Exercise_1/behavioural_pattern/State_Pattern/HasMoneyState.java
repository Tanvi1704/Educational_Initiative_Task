package org.example.Exercise_1.behavioural_pattern.State_Pattern;

// State representing the vending machine with money inserted
public class HasMoneyState implements State {
    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Money already inserted. Dispensing item...");
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Item dispensed.");
        vendingMachine.setState(new IdleState()); // Return to idle state
    }
}


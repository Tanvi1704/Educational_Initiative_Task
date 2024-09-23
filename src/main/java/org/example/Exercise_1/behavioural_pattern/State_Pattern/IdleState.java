package org.example.Exercise_1.behavioural_pattern.State_Pattern;

// State representing the idle state of the vending machine
public class IdleState implements State {
    @Override
    public void insertMoney(VendingMachine vendingMachine) {
        System.out.println("Money inserted. Ready to dispense item.");
        vendingMachine.setState(new HasMoneyState()); // Transition to 'HasMoney' state
    }

    @Override
    public void dispenseItem(VendingMachine vendingMachine) {
        System.out.println("Insert money first.");
    }
}

package org.example.Exercise_1.behavioural_pattern.Strategy_Pattern;

// Concrete strategy for PayPal payment
public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}


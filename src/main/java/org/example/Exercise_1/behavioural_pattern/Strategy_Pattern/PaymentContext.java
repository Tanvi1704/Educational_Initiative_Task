package org.example.Exercise_1.behavioural_pattern.Strategy_Pattern;

// Context class to set the payment strategy dynamically
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Execute payment using the chosen strategy
    public void executePayment(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("No payment strategy selected.");
        }
    }
}


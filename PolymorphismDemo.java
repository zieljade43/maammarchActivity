// PolymorphismDemo.java
// Real-world scenario: different payment methods process payments differently.

class Payment {
    public void processPayment(double amount) {
        System.out.println("Processing a general payment of PHP " + amount);
    }
}

class GCashPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid PHP " + amount + " using GCash.");
    }
}

class CardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paid PHP " + amount + " using a debit/credit card.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Parent-class references can refer to different child-class objects.
        Payment payment1 = new GCashPayment();
        Payment payment2 = new CardPayment();

        payment1.processPayment(250.00);
        payment2.processPayment(500.00);
    }
}

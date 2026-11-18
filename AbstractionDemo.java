// AbstractionDemo.java
// Real-world scenario: different delivery services calculate delivery details.

abstract class DeliveryService {
    // Abstract method: every delivery type must provide its own calculation.
    public abstract void calculateDeliveryFee(double distance);

    // Concrete method: shared behavior available to all delivery types.
    public void acceptOrder() {
        System.out.println("Delivery order accepted.");
    }
}

class MotorcycleDelivery extends DeliveryService {
    @Override
    public void calculateDeliveryFee(double distance) {
        double fee = 40 + (distance * 10);
        System.out.println("Motorcycle delivery fee: PHP " + fee);
    }
}

class CarDelivery extends DeliveryService {
    @Override
    public void calculateDeliveryFee(double distance) {
        double fee = 70 + (distance * 15);
        System.out.println("Car delivery fee: PHP " + fee);
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        DeliveryService motorcycle = new MotorcycleDelivery();
        DeliveryService car = new CarDelivery();

        motorcycle.acceptOrder();
        motorcycle.calculateDeliveryFee(5);

        System.out.println();

        car.acceptOrder();
        car.calculateDeliveryFee(5);
    }
}

# Lesson 6 – Polymorphism and Abstraction

## 1. PolymorphismDemo.java

This program shows a payment system with two payment options: GCash and debit/credit card. Both classes come from the `Payment` parent class, but each one gives its own result when `processPayment()` is called.

### How polymorphism works in this program

The parent class is `Payment`. Its child classes are `GCashPayment` and `CardPayment`. Both child classes override the `processPayment(double amount)` method using `@Override`.

In `main()`, the variables `payment1` and `payment2` are declared using the parent type `Payment`, but they refer to different child objects. When the method is called, Java runs the version belonging to the actual object. This lets the same method call produce different results.

### Expected output

```text
Paid PHP 250.0 using GCash.
Paid PHP 500.0 using a debit/credit card.
```

## 2. AbstractionDemo.java

This program represents a delivery service. A customer can choose motorcycle delivery or car delivery. Both services accept an order, but their delivery fees are calculated differently.

### How abstraction works in this program

`DeliveryService` is the abstract parent class. It contains the abstract method `calculateDeliveryFee(double distance)`, which has no method body in the parent class. The `MotorcycleDelivery` and `CarDelivery` child classes provide their own implementations of that method.

The parent class also has the concrete method `acceptOrder()`. Since this method is already written, both child classes can use it without rewriting it. The program creates child-class objects in `main()` and calls both the shared and specialized methods.

### Expected output

```text
Delivery order accepted.
Motorcycle delivery fee: PHP 90.0

Delivery order accepted.
Car delivery fee: PHP 145.0
```

## 3. Difference between polymorphism and abstraction

In my programs, polymorphism is about one method name behaving differently depending on the object that uses it. The payment program uses this when GCash and card payments respond differently to `processPayment()`.

Abstraction is about setting up the important actions that a group of classes must provide while keeping the specific details in the child classes. In the delivery program, the abstract class requires each delivery type to calculate a fee, but it does not decide the exact formula for every type.

They can be used together, but they solve different design problems: abstraction sets the common structure, while polymorphism lets different objects respond in their own way.

## 4. Reflection questions

### 1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?

Overriding allows a child class to change a method's behavior to match what that child represents. Without overriding, the child uses the inherited parent version instead. For example, if `GCashPayment` did not override `processPayment()`, it would display the general payment message from `Payment` rather than the GCash-specific message.

### 2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction?

An abstract class can contain methods that have no instructions yet. Creating an object from it would mean using a class that may not have all the behavior needed to work. The restriction makes sure we create an object from a concrete child class that supplies the missing method implementations.

### 3. If you need to add another child class to your polymorphism program, how would your existing code handle it?

I could add another class, such as `BankTransferPayment`, that extends `Payment` and overrides `processPayment()`. I could then create a `Payment` reference that points to a `BankTransferPayment` object. The existing parent-class method calls would work with the new object and Java would run its overridden method. The parent class would not need to be rewritten.

### 4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.

Yes. For example, an abstract `Payment` class could require every payment type to implement an abstract `pay()` method. Classes such as `GCashPayment` and `CardPayment` would implement it. In the main method, a `Payment` reference could point to either child object. The abstract class provides the required structure, and polymorphism makes the correct `pay()` implementation run for each object.

### 5. As a future programmer, when would you use polymorphism, and when would you use abstraction?

I would use polymorphism when several related objects need to respond to the same action in different ways, such as processing different payment types. I would use abstraction when I want to define the basic actions that every related class must have, without deciding all the details in the parent class. I would use both when designing a system with shared rules but different implementations, because this can make the code easier to extend and maintain.

## 5. How to compile and run

Open a terminal in this folder and run:

```bash
javac PolymorphismDemo.java
java PolymorphismDemo

javac AbstractionDemo.java
java AbstractionDemo
```

Make sure the file names match the public class names exactly.

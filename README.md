# Java OOP Project — E-Commerce Example

A simple Java console project built to practice Object-Oriented Programming (OOP) concepts, using an E-Commerce theme as the domain example. This project is a stepping stone toward Spring Boot backend development.

## Project Structure

```
java-oop-project/
├── Main.java
├── User.java
├── Customer.java
├── Admin.java
├── Product.java
├── Payment.java
└── PaymentMethod.java
```

## Class Relationships

```
                         User
                    (abstract class)
                         │
                ┌────────┴────────┐
                │                 │
                ▼                 ▼
            Customer             Admin
                │                 │
         buyProduct()      manageProduct()
                │                 │
                └────────┬────────┘
                         │
                         ▼
                      Product
                         │
                         │ getPrice()
                         ▼
                      Payment
                         ▲
                         │ implements
                  PaymentMethod
                    (interface)
```

## Class Overview

### `User` (abstract class)
- Fields: `name`, `email` (private)
- Getters / setters
- `introduce()` — prints name and email
- `login()` — abstract method, implemented differently by each subclass

### `Customer extends User`
- `login()` — overridden to identify as Customer
- `buyProduct(Product product)` — receives a `Product` object and prints the purchase result

### `Admin extends User`
- `login()` — overridden to identify as Admin
- `manageProduct(Product product)` — receives a `Product` object and prints management info

### `Product`
- Fields: `id`, `name`, `price`
- Getters, `setPrice()`, `displayProduct()`

### `PaymentMethod` (interface)
```java
void pay(double amount);
```

### `Payment implements PaymentMethod`
- Field: `paymentId`
- `pay(double amount)` — prints payment confirmation and payment ID

## Program Flow

```
JVM
 ↓
Main.main()
 ↓
Create Product → Display Product
 ↓
Create Customer → introduce() → login() → buyProduct(product)
 ↓
Create Admin → introduce() → login() → manageProduct(product)
 ↓
User user1 = new Customer(...)   // Polymorphism
User user2 = new Admin(...)
 ↓
Create Payment
 ↓
payment.pay(product.getPrice())
 ↓
Program ends
```

## OOP Concepts Practiced

| # | Concept | Status |
|---|---------|--------|
| 1 | Class | ✅ |
| 2 | Object | ✅ |
| 3 | Constructor | ✅ |
| 4 | `this` | ✅ |
| 5 | Encapsulation | ✅ |
| 6 | `private` | ✅ |
| 7 | Getter | ✅ |
| 8 | Setter | ✅ |
| 9 | Inheritance | ✅ |
| 10 | `extends` | ✅ |
| 11 | `super` | ✅ |
| 12 | Method Overriding | ✅ |
| 13 | `@Override` | ✅ |
| 14 | Polymorphism | ✅ |
| 15 | Abstraction | ✅ |
| 16 | `abstract class` | ✅ |
| 17 | `abstract method` | ✅ |
| 18 | Interface | ✅ |
| 19 | `implements` | ✅ |
| 20 | Passing objects as method parameters | ✅ |
| 21 | Object-to-object communication | ✅ |

## How to Compile & Run

```bash
javac -d out *.java
java -cp out Main
```

## Example Output

```
sopheak bought Laptop for $750.0
Admin manages product: Laptop
Payment success: $750.0
Payment ID: PAY-001
```


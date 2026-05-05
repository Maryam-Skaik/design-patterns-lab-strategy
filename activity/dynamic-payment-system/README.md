# 🧪 Activity 01: Dynamic Payment System (Strategy Pattern)

## 🎯 Objective

Design a system using the **Strategy Pattern** to support multiple payment methods while allowing **dynamic switching of behavior at runtime**.

---

## 📌 Scenario

You are building a **payment processing system** for an application.

In this system:

* Users can pay using different methods
* Each payment method follows a different processing logic
* The system must be able to **switch payment methods dynamically**

Examples:

* Credit Card → validation, authorization, transaction processing
* PayPal → login, token verification, payment execution
* Cash → simple confirmation handling

---

## ⚠️ Problem Context

Without a proper design:

* Payment logic may be handled using large `if-else` or `switch` statements
* Adding a new payment method requires modifying existing code
* Logic becomes tightly coupled inside one class
* System becomes harder to extend and maintain

This leads to:

* Poor scalability
* Violations of the Open/Closed Principle
* Reduced flexibility
* Increased complexity

---

## 🧠 Your Task

* Design a **Payment Processing System** using the **Strategy Pattern**
* Encapsulate each payment method into its own class
* Allow switching between payment methods at runtime
* Ensure the main system does not depend on concrete implementations

---

## 📏 Requirements

Your system must include:

* A **PaymentStrategy interface** defining the payment behavior
* Multiple **concrete strategies**, such as:

  * CreditCardPayment
  * PayPalPayment
  * CashPayment
* A **PaymentContext class** that:

  * Uses a strategy object
  * Delegates payment execution
  * Allows changing strategy dynamically

---

## 🧩 Design Expectations

Your design should:

* Use **composition, not inheritance**
* Separate **behavior (strategy)** from **execution (context)**
* Avoid conditional logic for selecting behavior
* Allow easy addition of new payment methods
* Keep each class focused on a single responsibility

---

## ✅ Expected Outcome

* A flexible system that supports multiple payment methods
* Ability to switch behavior without creating new context objects
* Clean separation between logic and execution
* Improved maintainability and extensibility

---

## 🚀 Example Use Case (Conceptual)

A user performs multiple payments:

* First uses Credit Card
* Then switches to PayPal
* Later uses Cash

The system:

* Uses the same context object
* Changes behavior dynamically
* Executes different logic each time

Focus on **behavior switching and clean design**, not UI or external integrations.

---

## 🧩 Challenge Extension (Optional)

* Add a new payment method (e.g., Cryptocurrency)
* Implement validation logic inside each strategy
* Introduce a factory to select strategies automatically
* Log each payment operation without modifying strategy classes

---

## 📌 Key Insight

This activity demonstrates how the **Strategy Pattern** enables **runtime flexibility** by encapsulating behaviors into interchangeable components, resulting in a system that is clean, extensible, and easy to maintain.

# 🎯 Strategy Design Pattern (Java)

![Java](https://img.shields.io/badge/Language-Java-blue.svg)
![Pattern](https://img.shields.io/badge/Design%20Pattern-Behavioral-green.svg)
![Level](https://img.shields.io/badge/Level-Beginner%20to%20Intermediate-orange.svg)
![Focus](https://img.shields.io/badge/Focus-OOP%20%26%20Design%20Thinking-purple.svg)

---

## 🎥 Lecture Video

This repository accompanies the lecture on the **Strategy Pattern**, focusing on runtime behavior flexibility.

▶️ Watch on YouTube:

[Lecture Video](#)

---

## 🧠 Overview

The **Strategy Pattern** is a behavioral design pattern that allows you to **define a family of algorithms**, put each one in a separate class, and **switch between them dynamically at runtime**.

It is used when multiple approaches exist for the same task, and the system needs the flexibility to choose between them **without modifying existing code**.

---

## 💡 Core Idea

> Encapsulate interchangeable behaviors and make them selectable at runtime.

---

## 🏗️ Real-World Analogy

Think about **navigation apps**:

* You want to go from A to B
* The app can choose different strategies:

  * 🚗 Fastest route
  * 🚶 Shortest walking path
  * 🚴 Bike-friendly route

The destination is the same, but the **strategy changes**.

👉 Same goal, different behaviors

---

## ⚙️ When to Use This Pattern

Use Strategy when:

* There are **multiple ways to perform a task**
* You need to **switch behavior at runtime**
* You want to avoid **large if-else or switch statements**
* You want to follow the **Open/Closed Principle**
* Behavior should be **independent and reusable**

---

## ❌ Problem Without This Pattern

Without Strategy:

* Classes become filled with `if-else` conditions
* Adding new behavior requires modifying existing code
* Code becomes harder to maintain
* Logic becomes tightly coupled

Example problem:

```java
if(type.equals("CS")) {
    // scoring logic
} else if(type.equals("Design")) {
    // scoring logic
} else if(type.equals("Business")) {
    // scoring logic
}
```

🚫 This does not scale.

---

## 🧩 Solution Approach

The pattern separates responsibilities into three parts:

### 🔵 Strategy Interface

* Defines a common contract
* Represents the behavior

### 🟢 Concrete Strategies

* Each class implements one algorithm
* Fully independent from others

### 🟣 Context Class

* Uses a strategy object
* Delegates execution to it
* Can switch strategy at runtime

---

## 📊 UML Structure

```
           <<interface>>
            ScoreStrategy
          -----------------
          + calculateScore()

                 ▲
      ┌──────────┼──────────┐
      │          │          │
CSScore   DesignScore   BusinessScore

                 ▲
                 │
         SubmissionContext
         ------------------
         - strategy
         + setStrategy()
         + process()
```

---

## 🧪 Example Scenario: University Submission System

We have a system that processes student submissions:

### Common Flow:

1. Receive file
2. Process submission
3. Calculate score

### Different Departments:

* 💻 Computer Science → correctness + plagiarism
* 🎨 Design → UI/UX quality
* 📊 Business → structure + citations

### Requirement:

> The system must switch scoring logic dynamically at runtime without changing the main processing class.

---

## 🔥 Core Behavior Explained

When the system runs:

* The **context does not know the algorithm**
* It only knows it has a strategy
* The strategy is **injected**
* Execution is **delegated**

This means:

* Behavior can change anytime
* No need to modify the context
* No conditional logic required

---

## ⚖️ Design Principle Behind It

This pattern follows:

> “Favor Composition Over Inheritance”

Instead of extending behavior, we **inject it**.

---

## 🧠 Key Insight

A critical mental model:

* **Context = uses behavior**
* **Strategy = defines behavior**

Or:

> Context decides *when* to execute
> Strategy decides *how* it executes

---

## 🔄 Runtime Flexibility Example

```java
SubmissionContext context = new SubmissionContext(new CSScoreStrategy());
context.process("file1.zip");

context.setStrategy(new DesignScoreStrategy());
context.process("design.fig");

context.setStrategy(new BusinessScoreStrategy());
context.process("report.docx");
```

Same object, different behaviors.

---

## 📌 Strategy vs Template Method

| Aspect       | Strategy        | Template Method        |
| ------------ | --------------- | ---------------------- |
| Approach     | Composition     | Inheritance            |
| Flexibility  | High (runtime)  | Low (compile-time)     |
| Control      | External        | Internal (base class)  |
| Change level | Entire behavior | Steps inside algorithm |

---

## 🧪 Practice Exercise

### 💳 Dynamic Payment System

Design a system with multiple payment methods:

### Strategies:

* CreditCardPayment
* PayPalPayment
* CashPayment

### Context:

* PaymentContext

### Requirement:

* Ability to switch payment method at runtime

---

## 🎯 Learning Outcome

After this pattern, you should be able to:

* Identify problems requiring runtime flexibility
* Replace conditional logic with polymorphism
* Apply composition correctly
* Design extensible systems without modification

---

## 🚀 Final Insight

The Strategy Pattern is most powerful when:

> You need to change behavior dynamically without changing the class that uses it.

# 🧪 Activity 02: Smart Sorting System (Strategy Pattern)

## 🎯 Objective

Design a system using the **Strategy Pattern** to support multiple sorting algorithms and allow **dynamic selection of sorting behavior at runtime**.

---

## 📌 Scenario

You are building a **data processing system** that needs to sort collections of data.

In this system:

* Sorting is a common operation
* Different sorting algorithms can be used
* Each algorithm has different performance characteristics

Examples:

* Bubble Sort → simple but inefficient for large data
* Quick Sort → fast and commonly used
* Selection Sort → predictable but not optimal

### Requirement:

> The system must be able to switch between sorting algorithms dynamically without modifying the main sorting logic.

---

## ⚠️ Problem Context

Without a proper design:

* Sorting logic may be implemented using `if-else` or flags
* Adding a new algorithm requires modifying existing code
* All algorithms may be mixed in one class
* Code becomes harder to maintain and extend

This leads to:

* Tight coupling
* Poor scalability
* Violations of the Open/Closed Principle
* Reduced code clarity

---

## 🧠 Your Task

* Design a **Sorting System** using the **Strategy Pattern**
* Encapsulate each sorting algorithm in its own class
* Allow switching between algorithms at runtime
* Ensure the system is extendable without modification

---

## 📏 Requirements

Your system must include:

* A **SortingStrategy interface** that defines a sorting method
* Multiple **concrete strategies**, such as:

  * BubbleSortStrategy
  * QuickSortStrategy
  * SelectionSortStrategy
* A **SortingContext class** that:

  * Uses a sorting strategy
  * Delegates sorting to it
  * Allows changing the strategy dynamically

---

## 🧩 Design Expectations

Your design should:

* Use **composition instead of inheritance**
* Separate **algorithm implementation** from **usage**
* Avoid conditional logic for selecting algorithms
* Allow easy addition of new sorting strategies
* Keep each class focused on a single responsibility

---

## ✅ Expected Outcome

* A flexible system that supports multiple sorting algorithms
* Ability to switch algorithms without changing the context class
* Clean separation between logic and execution
* Improved maintainability and scalability

---

## 🚀 Example Use Case (Conceptual)

A system processes different datasets:

* For small datasets → uses Bubble Sort
* For large datasets → switches to Quick Sort
* For predictable scenarios → uses Selection Sort

The system:

* Uses the same context object
* Changes sorting behavior dynamically
* Produces sorted output using different algorithms

Focus on **algorithm interchangeability**, not optimization details.

---

## 🧩 Challenge Extension (Optional)

* Add a new sorting algorithm (e.g., Merge Sort)
* Measure execution time for each strategy
* Automatically choose strategy based on input size
* Log which algorithm is used without modifying strategies

---

## 📌 Key Insight

This activity demonstrates how the **Strategy Pattern** allows multiple algorithms to be encapsulated and used interchangeably, enabling **runtime flexibility** and promoting clean, maintainable design.

# 📊 AlgorithmComplexity — Fibonacci Algorithms in Java

This project demonstrates three different approaches to calculating Fibonacci numbers in Java:

1.  **Iterative method**
2.  **Recursive method with memoization (dynamic programming)**
3.  **Recursive method**

---

## 📁 Project Structure

- `FibonacciIterative.java` — iterative approach
- `FibonacciDynamicProgramming.java` — recursive approach with caching (memoization)
- `FibonacciRecursive.java` — recursion without optimization
- `README.md` — project documentation
- `resources/` — UML activity diagrams in `.png` format

---
## ⏱ Time & Space Complexity

| Method      | Time Complexity | Space Complexity |
|-------------|------------------|------------------|
| Iterative   | O(n)             | O(1)             |
| Memoization | O(n)             | O(n)             |
| Recursion  | O(2ⁿ)            | O(n)             |

---

## 📊 UML Activity Diagrams

All diagrams were generated using [PlantUML](https://plantuml.com/activity-diagram).

| Method        | Diagram Type      | File                                |
|---------------|-------------------|-------------------------------------|
| Iterative     | Activity Diagram  | `resources/IterateMethod.png`       |
| Memoization  | Activity Diagram  | `resources/DynamicProgramming.png`  |
| Recursion   | Activity Diagram  | `resources/RecursiveMethod.png`     |

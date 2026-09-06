# oops‑question

> **A collection of tiny, self‑contained Java programs that demonstrate core object‑oriented concepts.**  
> Each file is an independent Java application with a `main` method and relies only on the standard JDK 8+ API.

[![Java 8+](https://img.shields.io/badge/Java-8%2B-brightgreen.svg)](https://openjdk.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

---

## Table of contents

- [Overview](#overview)
- [Features](#features)
- [Getting started](#getting-started)
- [Running the examples](#running-the-examples)
- [Contributing](#contributing)
- [Style guidelines](#style-guidelines)
- [License](#license)
- [Changelog](#changelog)

---

## Overview

`oops-question` provides a small, focused set of Java programs that each illustrate a single object‑oriented principle:

| File | Concept | Quick description |
|------|----------|-------------------|
| `Question1.java` | **Encapsulation** | A bank account with private fields, public getters/setters, and basic balance operations. |
| `Question2.java` | **Inheritance** | A simple vehicle hierarchy (`Vehicle → Car → ElectricCar`). |
| `Question3.java` | **Polymorphism** | An `Employee` interface with concrete `Manager` and `Developer` implementations. |
| `Question4.java` | **Abstraction** | An abstract `Shape` class used by concrete `Circle` and `Rectangle` classes. |

All files compile without external dependencies and can be run from the command line.

---

## Features

* **Minimal footprint:** No third‑party libraries.  
* **Single responsibility:** One file per concept.  
* **Easy to run:** Compile and execute with standard `javac`/`java`.  
* **Self‑contained:** Each example is a small, runnable `main` method.

---

## Getting started

```bash
# Clone the repository
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question
```

No additional setup is required beyond a Java 8+ JDK.

---

## Running the examples

### Compile and run a single example

```bash
javac Question1.java
java Question1
```

### Compile and run all examples

```bash
javac *.java
java Question1
java Question2
java Question3
java Question4
```

Each program prints a short demo of the concept it illustrates.

---

## Contributing

1. **Fork** the repo and create a feature branch.  
   ```bash
   git checkout -b feature/your-contribution
   ```

2. **Add or update an example**:  
   * Keep focus on a single OOP concept.  
   * Use only standard Java APIs.  
   * Provide a `main` method that demonstrates the concept.

3. **Verify build**:  
   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```

4. **Push** and open a pull request.  
   A concise title and clean build are appreciated.

---

## Style guidelines

| Guideline | Explanation |
|-----------|-------------|
| **Descriptive names** | Class and method names should clearly convey intent. |
| **Single responsibility** | One file per concept, no cross‑file dependencies. |
| **Minimal coupling** | Avoid unnecessary references between files. |
| **Sparse comments** | Document only non‑obvious logic. |
| **No third‑party libraries** | Stick to the JDK. |

---

## License

MIT – see the [LICENSE](LICENSE) file.

---

## Changelog

| Date | Notes |
|------|-------|
| 2026‑09‑06 | Minor cleanup of the README, added quick‑start section, simplified instructions. |
| 2026‑09‑05 | Updated wording and added quick‑start section. |
| 2026‑09‑02 | Updated grammar, simplified sections. |
| 2026‑08‑26 | Refined description, clarified setup instructions. |

---

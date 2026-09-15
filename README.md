# oops‑question
A collection of minimal Java programs that each demonstrate a single object‑oriented principle.  
All examples use only the standard JDK (Java 8+) and contain a `main` method so they can be compiled and run directly from the command line.

**Java 8+ · MIT**

[![Java](https://img.shields.io/badge/Java-8%2B-brightgreen.svg?style=flat-square)](https://openjdk.org/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)](LICENSE)

---

## Table of contents

- [Overview](#overview)
- [Concepts & files](#concepts--files)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting started](#getting-started)
- [Building & running](#building--running)
- [Contributing](#contributing)
- [Style guidelines](#style-guidelines)
- [Changelog](#changelog)
- [License](#license)

---

## Overview

`oops‑question` contains four single‑class Java applications, each focused on a core OOP concept:

| File | Concept | Quick description |
|------|---------|------------------|
| `Question1.java` | **Encapsulation** | `BankAccount` with private fields and public getters/setters. |
| `Question2.java` | **Inheritance** | Simple vehicle hierarchy (`Vehicle → Car → ElectricCar`). |
| `Question3.java` | **Polymorphism** | `Employee` interface with concrete `Manager` and `Developer` implementations. |
| `Question4.java` | **Abstraction** | Abstract `Shape` class used by `Circle` and `Rectangle`. |

Each file compiles independently and demonstrates its concept in the console output.

---

## Features

- Zero external dependencies – only the JDK is required.
- One class per file, one concept per file – keeps examples focused.
- Easy to compile and run with standard `javac` and `java`.
- Clear, concise examples without unnecessary complexity.

---

## Prerequisites

- JDK 8 or newer (Java 8+).  
- `javac` and `java` should be in your `PATH`.

---

## Getting started

```bash
# Clone the repository
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question
```

---

## Building & running

### Compile and run a single example

```bash
javac Question1.java
java Question1
```

Replace `Question1` with any other file name to run a different example.

### Compile and run all examples

```bash
javac *.java
java Question1
java Question2
java Question3
java Question4
```

Each program prints a short demonstration of the concept it illustrates.

---

## Contributing

1. Fork the repository and create a feature branch.  
   ```bash
   git checkout -b feature/your-contribution
   ```
2. Add or update an example.  
   - Keep the focus on a single OOP concept.  
   - Use only standard Java APIs.  
   - Include a `main` method that demonstrates the concept.
3. Verify that the example builds and runs.  
   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```
4. Push your changes and open a pull request.  
   A clear title and concise description of the contribution are appreciated.

---

## Style guidelines

| Guideline | What it means |
|------------|---------------|
| **Descriptive names** | Class and method names should clearly convey intent. |
| **Single responsibility** | One file per concept, no cross‑file coupling. |
| **Minimal coupling** | Avoid unnecessary references between files. |
| **Sparse comments** | Comment only non‑obvious logic. |
| **No external libraries** | Stick to the JDK. |

---

## Changelog

| Date | Notes |
|------|-------|
| 2026‑09‑15 | Minor README cleanup – fixed grammar, reorganised sections, added concise feature list and running instructions. |
| 2026‑09‑14 | Updated README – cleaned grammar, reorganised sections, added concise feature list and running instructions. |
| 2026‑09‑06 | Minor cleanup, added quick‑start section. |
| 2026‑09‑02 | Simplified wording, clarified setup instructions. |
| 2026‑08‑26 | Refined description, clarified instructions. |

---

## License

MIT – see the [LICENSE](LICENSE) file.

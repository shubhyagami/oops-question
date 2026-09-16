# oops‑question

A collection of tiny single‑class Java programs that each illustrate a single object‑oriented principle.  
All examples use only the standard JDK (Java 8+) and contain a `main` method so they can be compiled and run directly from the command line.

**Java 8+ · MIT**

![Java](https://img.shields.io/badge/Java-8%2B-brightgreen.svg?style=flat-square)  
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)

---

## Table of contents

- [Overview](#overview)
- [Concepts & files](#concepts--files)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting started](#getting-started)
- [Build & run](#build--run)
- [Contributing](#contributing)
- [Style guidelines](#style-guidelines)
- [Changelog](#changelog)
- [License](#license)

---

## Overview

`oops‑question` contains four independent Java applications, each focused on one core OOP concept:

| File           | Concept        | Quick description                                  |
|----------------|----------------|----------------------------------------------------|
| `Question1.java` | **Encapsulation** | A `BankAccount` with private fields and public accessors. |
| `Question2.java` | **Inheritance**   | A simple vehicle hierarchy (`Vehicle → Car → ElectricCar`). |
| `Question3.java` | **Polymorphism** | An `Employee` interface with concrete `Manager` and `Developer` classes. |
| `Question4.java` | **Abstraction**   | An abstract `Shape` class used by `Circle` and `Rectangle`. |

Each file can be compiled and executed in isolation, printing a short demonstration of its concept.

---

## Features

- No external dependencies – only the JDK is required.
- One class per file, one concept per file – keeps examples easy to understand.
- Simple, self‑contained `main` methods for quick experimentation.
- Clear, concise code suitable for teaching or reference.

---

## Prerequisites

- JDK 8 or newer (Java 8+).
- `javac` and `java` available in your `PATH`.

---

## Getting started

```bash
# Clone the repository
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question
```

---

## Build & run

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

Each command prints a concise demonstration of the associated OOP principle.

---

## Contributing

1. Fork the repository and create a feature branch.  
   ```bash
   git checkout -b feature/your-contribution
   ```
2. Add or update an example.
   * Keep the focus on a single OOP concept.
   * Use only standard Java APIs.
   * Include a `main` method that demonstrates the concept.
3. Verify that the example builds and runs.  
   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```
4. Push your changes and open a pull request with a clear title and concise description.

---

## Style guidelines

| Guideline | Explanation |
|-----------|-------------|
| **Descriptive names** | Class and method names should clearly convey intent. |
| **Single responsibility** | One file per concept; avoid cross‑file coupling. |
| **Minimal coupling** | Refrain from unnecessary references between files. |
| **Sparse comments** | Comment only non‑obvious logic. |
| **No external libraries** | Stick to the JDK. |

---

## Changelog

| Date | Notes |
|------|-------|
| 2026‑09‑16 | Updated README – fixed grammar, reorganised sections, added concise feature list and running instructions. |
| 2026‑09‑15 | Minor cleanup – fixed grammar, reorganised sections, added concise feature list and running instructions. |
| 2026‑09‑14 | Updated README – cleaned grammar, reorganised sections, added concise feature list and running instructions. |

---

## License

MIT – see the [LICENSE](LICENSE) file.

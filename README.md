# oops‑question

A collection of tiny Java programs, each illustrating a single object‑oriented principle. The code is minimal, uses only the standard Java 8+ API, and is ready to compile and run from the command line.

**Java 8+ · MIT**

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
- [Changelog](#changelog)
- [License](#license)

---

## Overview

`oops‑question` contains four single‑class Java applications, each focused on a core OOP concept:

| File          | Concept        | Quick description |
|---------------|----------------|------------------|
| `Question1.java` | **Encapsulation** | `BankAccount` with private fields and public getters/setters. |
| `Question2.java` | **Inheritance**  | Simple vehicle hierarchy (`Vehicle → Car → ElectricCar`). |
| `Question3.java` | **Polymorphism** | `Employee` interface with concrete `Manager` and `Developer` implementations. |
| `Question4.java` | **Abstraction**  | Abstract `Shape` class used by `Circle` and `Rectangle`. |

All examples compile without third‑party dependencies and are self‑contained; each file contains its own `main` method.

---

## Features

- **Zero external dependencies** – only the JDK is required.
- **Single‑responsibility files** – one class per file, one concept per file.
- **Easy to compile & run** – standard `javac` and `java` commands.
- **Clear, focused examples** – no unnecessary complexity.

---

## Getting started

```bash
# Clone the repository
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question
```

> **Prerequisites**  
> JDK 8 or newer.  
> `javac` and `java` should be on your PATH.

No additional configuration is needed.

---

## Running the examples

### Compile and run a single example

```bash
javac Question1.java
java Question1
```

Replace `Question1` with any of the other files to run a different example.

### Compile and run all examples

```bash
javac *.java
java Question1
java Question2
java Question3
java Question4
```

All four programs will print a short demonstration of the concept they illustrate.

---

## Contributing

1. Fork the repository and create a feature branch.  
   ```bash
   git checkout -b feature/your-contribution
   ```
2. Add or update an example.  
   * Keep the focus on a single OOP concept.  
   * Use only standard Java APIs.  
   * Provide a `main` method that demonstrates the concept.
3. Verify the example builds and runs.  
   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```
4. Push your changes and open a pull request.  
   A clear title and concise description of the contribution are appreciated.

---

## Style guidelines

| Guideline          | What it means |
|--------------------|---------------|
| **Descriptive names** | Class and method names should clearly convey intent. |
| **Single responsibility** | One file per concept, no cross‑file coupling. |
| **Minimal coupling** | Avoid unnecessary references between files. |
| **Sparse comments** | Comment only non‑obvious logic. |
| **No external libraries** | Stick to the JDK. |

---

## Changelog

| Date       | Notes |
|------------|-------|
| 2026‑09‑14 | Updated README – cleaned grammar, reorganised sections, added concise feature list and running instructions. |
| 2026‑09‑06 | Minor cleanup, added quick‑start section. |
| 2026‑09‑02 | Simplified wording, clarified setup instructions. |
| 2026‑08‑26 | Refined description, clarified instructions. |

---

## License

MIT – see the [LICENSE](LICENSE) file.

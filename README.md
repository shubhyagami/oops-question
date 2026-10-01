# oops-question

A collection of self-contained Java programs that demonstrate the four core pillars of Object-Oriented Programming (OOP). Every file compiles and runs on its own — no external libraries, no build tools, just the JDK.

![Java](https://img.shields.io/badge/Java-8%2B-brightgreen.svg?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)
![Build](https://img.shields.io/badge/Build-javac-success.svg?style=flat-square)

---

## Overview

Each file in this repository is a standalone program focused on a single OOP principle, with a `main` method that prints a short demonstration to the console.

| File | Concept | Description |
|------|---------|-------------|
| `Question1.java` | Encapsulation | A `BankAccount` that keeps its balance private, exposing it only through getters and setters. |
| `Question2.java` | Inheritance | A three-level class hierarchy: `Vehicle → Car → ElectricCar`. |
| `Question3.java` | Polymorphism | An `Employee` interface with `Manager` and `Developer` implementations. |
| `Question4.java` | Abstraction | An abstract `Shape` class with concrete `Circle` and `Rectangle` subclasses. |

---

## Features

- **Zero dependencies** — only the JDK is required.
- **One file per concept** — each example lives in its own `.java` file.
- **Runnable out of the box** — every class has a `main` method.
- **Beginner-friendly** — suited to students, interview preparation, or a quick refresher.

---

## Getting Started

### Prerequisites

- JDK 8 or newer
- `javac` and `java` available on your `PATH`

### Clone the repository

    git clone https://github.com/shubhyagami/oops-question.git
    cd oops-question

### Run a single example

    javac Question1.java
    java Question1

### Run all examples

    javac *.java
    for f in Question*.java; do
      java "${f%.java}"
      echo "-------------------"
    done

---

## Contributing

Contributions are welcome. To add a new example or improve an existing one:

1. Fork the repository and create a branch, e.g. `feature/new-concept`.
2. Keep each example focused on a single OOP pillar and stick to standard Java APIs.
3. Include a `main` method that demonstrates the concept clearly.
4. Compile and run your code locally, then open a pull request.

### Style guidelines

- Use descriptive, intent-revealing names.
- Keep one top-level class per file.
- Avoid external dependencies.
- Comment the *why*, not the *what*.

---

## Changelog

| Date | Version | Notes |
|------|---------|-------|
| 2026-10-01 | 1.1.3 | README polish: clarified descriptions and simplified usage instructions. |
| 2026-09-30 | 1.1.2 | README cleanup: clarified examples, usage, and contribution notes. |
| 2026-09-27 | 1.1.1 | Improved table formatting and usage section. |
| 2026-09-24 | 1.1.0 | Refined README structure; streamlined usage guide. |
| 2026-09-17 | 1.0.0 | Initial release. |

---

## License

Distributed under the MIT License. See the [LICENSE](LICENSE) file for details.

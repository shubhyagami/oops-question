# oops‑question

> A small set of self‑contained Java programs that each demonstrate a single object‑oriented principle.

**Java 8+** · **MIT**  

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

`oops-question` contains a handful of tiny Java applications.  
Each file is a single‑class program that illustrates one core OOP concept. The code is intentionally minimal and uses only the standard JDK 8+ API.

| File          | Concept      | Quick description |
|---------------|--------------|-------------------|
| `Question1.java` | **Encapsulation** | A `BankAccount` with private fields and public getters/setters. |
| `Question2.java` | **Inheritance** | A simple vehicle hierarchy (`Vehicle → Car → ElectricCar`). |
| `Question3.java` | **Polymorphism** | An `Employee` interface with concrete `Manager` and `Developer` implementations. |
| `Question4.java` | **Abstraction** | An abstract `Shape` class used by concrete `Circle` and `Rectangle` classes. |

All the files compile without external dependencies and can be run directly from the command line.

---

## Features

- **No external libraries** – only the JDK is required.
- **Single responsibility** – one file per concept, no cross‑file coupling.
- **Easy to run** – standard `javac`/`java` commands.
- **Self‑contained** – each example has its own `main` method.

---

## Getting started

```bash
# Clone the repository
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question
```

No further setup is needed apart from a Java 8+ JDK.

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

1. **Fork** the repository and create a feature branch.  
   ```bash
   git checkout -b feature/your-contribution
   ```

2. **Add or update an example**  
   - Keep the focus on one OOP concept.  
   - Use only standard Java APIs.  
   - Provide a `main` method that demonstrates the concept.

3. **Verify the build**  
   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```

4. **Push** your changes and open a pull request.  
   A concise title and clean build are appreciated.

---

## Style guidelines

| Guideline | What it means |
|-----------|---------------|
| Descriptive names | Class and method names should clearly convey intent. |
| Single responsibility | One file per concept, no cross‑file dependencies. |
| Minimal coupling | Avoid unnecessary references between files. |
| Sparse comments | Comment only non‑obvious logic. |
| No third‑party libraries | Stick to the JDK. |

---

## Changelog

| Date | Notes |
|------|-------|
| 2026‑09‑06 | Minor cleanup of the README, added quick‑start section, simplified instructions. |
| 2026‑09‑05 | Updated wording and added quick‑start section. |
| 2026‑09‑02 | Updated grammar, simplified sections. |
| 2026‑08‑26 | Refined description, clarified setup instructions. |

---

## License

MIT – see the [LICENSE](LICENSE) file.

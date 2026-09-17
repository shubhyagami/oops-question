# oops‑question

A small collection of single‑class Java programs, each demonstrating a single object‑oriented principle.  
All examples use only the standard JDK (Java 8+) and include a `main` method for quick compilation and execution from the command line.

![Java](https://img.shields.io/badge/Java-8%2B-brightgreen.svg?style=flat-square)  
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)

---

## Table of contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting started](#getting-started)
- [Build & run](#build--run)
- [Run all examples](#run-all-examples)
- [Contributing](#contributing)
- [Style guidelines](#style-guidelines)
- [Changelog](#changelog)
- [License](#license)

---

## Overview

| File           | Concept        | Quick description |
|----------------|----------------|-------------------|
| `Question1.java` | Encapsulation | A `BankAccount` with private fields and public accessors. |
| `Question2.java` | Inheritance   | A simple vehicle hierarchy (`Vehicle → Car → ElectricCar`). |
| `Question3.java` | Polymorphism | An `Employee` interface with concrete `Manager` and `Developer` classes. |
| `Question4.java` | Abstraction | An abstract `Shape` class used by `Circle` and `Rectangle`. |

Each file can be compiled and run independently:

```bash
javac Question1.java
java Question1
```

The program prints a concise demonstration of the associated OOP principle.

---

## Features

- **No external dependencies** – only the JDK is required.
- **One class per file** – keeps examples focused and easy to read.
- **Clear `main` methods** – immediate execution for experimentation.
- **Self‑contained and educational** – suitable for teaching or quick reference.

---

## Prerequisites

- JDK 8 or newer (Java 8+)
- `javac` and `java` must be in your `PATH`

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
# Compile
javac Question1.java
# Run
java Question1
```

Replace `Question1` with any of the other file names (`Question2.java`, `Question3.java`, `Question4.java`) to run a different example.

### Compile all examples

```bash
javac *.java
```

Now each class can be run individually:

```bash
java Question1
java Question2
java Question3
java Question4
```

---

## Run all examples

The following shell loop compiles and runs every example in the repository:

```bash
#!/usr/bin/env bash
for f in *.java; do
  javac "$f" && java "${f%.java}"
done
```

Copy the script into a file (e.g., `run-all.sh`), make it executable (`chmod +x run-all.sh`), and execute it.

---

## Contributing

1. Fork the repository and create a feature branch:

   ```bash
   git checkout -b feature/<your-feature>
   ```

2. Add or update an example:
   - Keep the focus on a single OOP concept.
   - Stick to standard Java APIs only.
   - Include a `main` method that clearly demonstrates the concept.

3. Verify the example builds and runs:

   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```

4. Push your changes and open a pull request with a concise title and description.

---

## Style guidelines

- **Descriptive names** – Class and method names should reflect intent.
- **Single responsibility** – One file per concept; avoid cross‑file coupling.
- **Minimal coupling** – Do not reference unrelated classes in the same package.
- **Sparse comments** – Comment only non‑obvious logic.
- **No external libraries** – Use only the JDK.

---

## Changelog

| Date | Notes |
|------|-------|
| 2026‑09‑17 | Updated README – cleaned grammar, reorganised sections, added concise feature list and running instructions. |
| 2026‑09‑16 | Minor cleanup – removed duplicate changelog entries. |

---

## License

MIT – see the [LICENSE](LICENSE) file.

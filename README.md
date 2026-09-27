# oops-question

A curated collection of standalone Java programs that illustrate core Object-Oriented Programming (OOP) concepts through simple, executable examples.

![Java](https://img.shields.io/badge/Java-8%2B-brightgreen.svg?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)
![Build](https://img.shields.io/badge/Build-Pass-success.svg?style=flat-square)

---

## Overview

Each file in this repository is a self-contained example focused on a single OOP pillar. All code runs on JDK 8+ and requires no external dependencies.

| File | Concept | Description |
| :--- | :--- | :--- |
| `Question1.java` | **Encapsulation** | Demonstrates data hiding with a `BankAccount` class: private fields exposed through public accessors. |
| `Question2.java` | **Inheritance** | A three-level class hierarchy: `Vehicle` → `Car` → `ElectricCar`. |
| `Question3.java` | **Polymorphism** | An `Employee` interface implemented by `Manager` and `Developer` classes. |
| `Question4.java` | **Abstraction** | An abstract `Shape` class extended by `Circle` and `Rectangle`. |

---

## Features

- **Zero dependencies** — only the standard JDK is required.
- **Single-file examples** — each concept is isolated in one file for clarity.
- **Runs out of the box** — every class has a `main` method, so each example is instant to test.
- **Educational focus** — aimed at students or anyone needing a quick OOP refresher.

---

## Getting Started

### Prerequisites

- JDK 8 or newer.
- `javac` and `java` available on your system's `PATH`.

No build tool or dependency manager is needed — a JDK is all it takes.

### Installation

```bash
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question
```

---

## Usage

### Running a single example

Compile and execute the file you want to study:

```bash
javac Question1.java
java Question1
```

### Running all examples

Compile everything at once:

```bash
javac *.java
```

Then run each example in sequence:

```bash
for f in *.java; do java "${f%.java}"; done
```

Alternatively, save this as `run-all.sh` for a reusable script:

```bash
#!/usr/bin/env bash
for f in *.java; do
  echo "Running ${f}..."
  javac "$f" && java "${f%.java}"
  echo "-------------------"
done
```

Make it executable and run it:

```bash
chmod +x run-all.sh
./run-all.sh
```

---

## Contributing

Contributions are welcome! To add a new example:

1. **Fork and branch** — create a feature branch: `git checkout -b feature/new-concept`.
2. **Keep it simple** — each example should focus on one OOP concept and use only standard Java APIs.
3. **Stay self-contained** — include a `main` method that clearly demonstrates the concept in action.
4. **Verify** — compile and run your code locally before opening a pull request.

### Style guidelines

- Use descriptive, intent-based naming.
- Maintain a one-class-per-file structure.
- Avoid external libraries.
- Use comments to explain "why," not restate "what."

---

## Changelog

| Date | Version | Notes |
| :--- | :--- | :--- |
| 2026-09-27 | 1.1.1 | README cleanup: removed stray artifacts, fixed table arrows, reorganized the usage section. |
| 2026-09-24 | 1.1.0 | Refined README structure and streamlined the usage guide. |
| 2026-09-17 | 1.0.0 | Initial release with the four core OOP examples and the run-all script. |

---

## License

Distributed under the MIT License. See the [LICENSE](LICENSE) file for more details.

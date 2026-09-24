[K[2m  [2mmodel deepseek-ai/deepseek-v4.1-flash failed, trying next...[0m[0m
[K[2m  [2mmodel openai/gpt-oss-20b failed, trying next...[0m[0m
[K[2m  [2mmodel openai/gpt-oss-120b failed, trying next...[0m[0m
# oops-question

A curated collection of standalone Java programs designed to illustrate core Object-Oriented Programming (OOP) concepts through simple, executable examples.

![Java](https://img.shields.io/badge/Java-8%2B-brightgreen.svg?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)
![Build](https://img.shields.io/badge/Build-Pass-success.svg?style=flat-square)

---

## Overview

Each file in this repository is a self-contained example focusing on a specific OOP pillar. All code is compatible with JDK 8+ and requires no external dependencies.

| File | Concept | Description |
| :--- | :--- | :--- |
| `Question1.java` | **Encapsulation** | Demonstrates data hiding using a `BankAccount` class with private fields and public accessors. |
| `Question2.java` | **Inheritance** | Shows a class hierarchy: `Vehicle` $\rightarrow$ `Car` $\rightarrow$ `ElectricCar`. |
| `Question3.java` | **Polymorphism** | Implements an `Employee` interface across `Manager` and `Developer` classes. |
| `Question4.java` | **Abstraction** | Utilizes an abstract `Shape` class extended by `Circle` and `Rectangle`. |

---

## Features

- **Zero Dependencies**: Only the standard JDK is required.
- **Single-File Examples**: Each concept is isolated in one file for maximum clarity.
- **Immediately Executable**: Every class contains a `main` method for instant testing.
- **Educational Focus**: Designed for students or developers needing a quick refresher on OOP.

---

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or newer.
- `javac` and `java` added to your system's `PATH`.

### Installation
```bash
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question
```

---

## Usage

### Running a Single Example
Compile and execute the specific file you wish to study:
```bash
javac Question1.java
java Question1
```

### Running All Examples
To compile all files at once:
```bash
javac *.java
```

To execute every example sequentially, you can use this one-liner:
```bash
for f in *.java; do javac "$f" && java "${f%.java}"; done
```

Alternatively, create a shell script:
```bash
# Save as run-all.sh
#!/usr/bin/env bash
for f in *.java; do
  echo "Running ${f}..."
  javac "$f" && java "${f%.java}"
  echo "-------------------"
done

# Execute
chmod +x run-all.sh
./run-all.sh
```

---

## Contributing

Contributions are welcome! Please follow these guidelines:

1. **Fork and Branch**: Create a feature branch (`git checkout -b feature/new-concept`).
2. **Keep it Simple**: Ensure each example focuses on one specific OOP concept using only standard Java APIs.
3. **Self-Contained**: Include a `main` method that clearly demonstrates the concept in action.
4. **Verify**: Compile and run your code locally before submitting a Pull Request.

### Style Guidelines
- Use descriptive, intent-based naming.
- Maintain a one-class-per-file structure.
- Avoid external libraries.
- Use comments only to explain "why," not "what."

---

## Changelog

| Date | Version | Notes |
| :--- | :--- | :--- |
| 2026-09-24 | 1.1.0 | Refined README structure, improved documentation, and streamlined usage guide. |
| 2026-09-17 | 1.0.0 | Initial release with core OOP questions and run-all script. |

---

## License

Distributed under the MIT License. See the [LICENSE](LICENSE) file for more details.

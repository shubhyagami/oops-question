[K[2m  [2mmodel z-ai/glm-5.3-flash failed, trying next...[0m[0m
[K[2m  [2mmodel deepseek-ai/deepseek-v4.1-flash failed, trying next...[0m[0m
# oops-question

A collection of self‑contained Java programs that illustrate the core pillars of Object‑Oriented Programming (OOP) with clear, executable examples.

![Java](https://img.shields.io/badge/Java-8%2B-brightgreen.svg?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)
![Build](https://img.shields.io/badge/Build-Pass-success.svg?style=flat-square)

---

## Overview

Each file in this repository is a standalone program focusing on a single OOP principle. All examples compile and run with JDK 8+ and do not rely on external libraries.

| File           | Concept       | Description                                                                 |
|----------------|----------------|-----------------------------------------------------------------------------|
| `Question1.java` | Encapsulation | A `BankAccount` with private fields and public getters/setters.               |
| `Question2.java` | Inheritance | A three‑level hierarchy: `Vehicle → Car → ElectricCar`.                       |
| `Question3.java` | Polymorphism | An `Employee` interface implemented by `Manager` and `Developer`.            |
| `Question4.java` | Abstraction | An abstract `Shape` class with concrete `Circle` and `Rectangle` subclasses. |

---

## Features

- **Zero dependencies** – only the JDK is required.
- **One‑file examples** – each concept lives in its own `.java` file.
- **Immediate execution** – every class contains a `main` method.
- **Educational** – suitable for students, interview preparation, or a quick refresher.

---

## Getting Started

### Prerequisites

- Java JDK 8 or newer.
- `javac` and `java` on your `PATH`.

### Clone the repository

```bash
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question
```

### Run an example

```bash
javac Question1.java
java Question1
```

### Run all examples

```bash
javac *.java
for f in *.java; do java "${f%.java}"; echo "-------------------"; done
```

Alternatively, use the provided `run-all.sh` script:

```bash
#!/usr/bin/env bash
for f in *.java; do
  echo "Running ${f}..."
  javac "$f" && java "${f%.java}"
  echo "-------------------"
done
```

Make it executable and run:

```bash
chmod +x run-all.sh
./run-all.sh
```

---

## Contributing

Feel free to add more examples or improve existing ones.

1. Fork the repository and create a branch, e.g., `feature/new-concept`.
2. Keep each example focused on one OOP pillar and use only standard Java APIs.
3. Include a `main` method that demonstrates the concept clearly.
4. Compile and run your code locally before submitting a pull request.

### Style guidelines

- Use descriptive, intent‑based names.
- Preserve the one‑class‑per‑file rule.
- Avoid external dependencies.
- Explain the “why” in comments, not the “what”.

---

## Changelog

| Date       | Version | Notes |
|------------|---------|-------|
| 2026‑09‑27 | 1.1.1   | README cleanup; improved table formatting and usage section. |
| 2026‑09‑24 | 1.1.0   | Refined README structure; streamlined usage guide. |
| 2026‑09‑17 | 1.0.0   | Initial release. |

---

## License

Distributed under the MIT License. See the [LICENSE](LICENSE) file for details.

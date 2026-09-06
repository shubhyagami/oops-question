# oops‑question

**A collection of tiny, self‑contained Java programs that illustrate core object‑oriented concepts.**  
Each file is an independent Java application with a `main` method and uses only the standard JDK 8+ API.

[![Java 8+](https://img.shields.io/badge/Java-8%2B-brightgreen.svg)](https://openjdk.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

## Table of contents

- [What’s in the repo](#whats-in-the-repo)
- [Getting started](#getting-started)
- [How to run the examples](#how-to-run-the-examples)
- [Contributing](#contributing)
- [Style guidelines](#style-guidelines)
- [License](#license)
- [Changelog](#changelog)

## What’s in the repo

| File | OOP concept | Short description |
|------|-------------|-------------------|
| `Question1.java` | Encapsulation | A bank account with private fields, public getters/setters and simple balance operations |
| `Question2.java` | Inheritance | A single‑inheritance vehicle hierarchy (`Vehicle → Car → ElectricCar`) |
| `Question3.java` | Polymorphism | An `Employee` interface and multiple implementations (`Manager`, `Developer`) |
| `Question4.java` | Abstraction | An abstract `Shape` class used by concrete `Circle` and `Rectangle` classes |

All files compile without external dependencies and can be executed from the command line.

## Getting started

```bash
# Clone the repository
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question
```

## How to run the examples

Compile a single example:

```bash
javac Question1.java
java Question1
```

Compile and run all:

```bash
javac *.java
java Question1
java Question2
java Question3
java Question4
```

Each program prints a short demo of the concept it illustrates.

## Contributing

1. Fork the repo and create a feature branch:

   ```bash
   git checkout -b feature/your-contribution
   ```

2. Add or update an example file:

   * Keep the focus on one OOP concept.
   * Use only standard Java APIs.
   * Include a `main` method that demonstrates the concept.

3. Verify compilation and execution:

   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```

4. Push your branch and open a pull request. A concise title and a clean build are appreciated.

## Style guidelines

| Guideline | What it means |
|-----------|---------------|
| **Descriptive names** | Class and method names should convey intent. |
| **Single responsibility** | One file per concept. |
| **Minimal coupling** | Avoid unnecessary dependencies between files. |
| **Sparse comments** | Explain only non‑obvious logic. |
| **No third‑party libraries** | Stick to the JDK. |

## License

MIT – see the [LICENSE](LICENSE) file.

## Changelog

- **2026‑09‑06** – Minor cleanup of README, added quick‑start section, simplified instructions.  
- **2026‑09‑05** – Minor cleanup of README, improved wording, added quick‑start section.  
- **2026‑09‑02** – Updated grammar, simplified sections.  
- **2026‑08‑26** – Refined description, clarified setup instructions.

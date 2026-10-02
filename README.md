[K[2m  [2mmodel z-ai/glm-5.3-flash failed, trying next...[0m[0m
[K[2m  [2mmodel deepseek-ai/deepseek-v4.1-flash failed, trying next...[0m[0m
# oops‑question

A small collection of **self‑contained Java programs** that illustrate the four pillars of Object‑Oriented Programming.  
Each file compiles and runs on its own – no external libraries, no build tools, just the JDK.

![Java](https://img.shields.io/badge/Java-8%2B-brightgreen.svg?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)
![Build](https://img.shields.io/badge/Build-javac-success.svg?style=flat-square)

---

## Overview

| File           | OOP Pillar    | Short Description |
|----------------|---------------|-------------------|
| `Question1.java` | **Encapsulation** | `BankAccount` keeps its balance private and exposes it via getters/setters. |
| `Question2.java` | **Inheritance**   | `Vehicle → Car → ElectricCar` hierarchy. |
| `Question3.java` | **Polymorphism**  | `Employee` interface implemented by `Manager` and `Developer`. |
| `Question4.java` | **Abstraction**   | Abstract `Shape` with `Circle` and `Rectangle` subclasses. |

Each example contains a `main` method that prints a short demonstration to the console.

---

## Features

- ✅ **Zero dependencies** – only the JDK is required.  
- 📁 **One file per concept** – keep examples isolated and easy to locate.  
- 🚀 **Runnable out of the box** – a dedicated `main` method in every class.  
- 👶 **Beginner friendly** – great for learning, interview prep, or quick refresher.

---

## Getting Started

### Prerequisites

- JDK 8 or newer (ensure `javac` and `java` are on your `PATH`).

### Clone the repo

```bash
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question
```

### Run a single example

```bash
javac Question1.java
java Question1
```

### Run all examples

```bash
# Compile every file in the directory
javac *.java

# Execute each example in turn
for f in Question*.java; do
  java "${f%.java}"
  echo "-------------------"
done
```

---

## Contributing

Feel free to submit PRs. When adding or editing an example:

1. Keep it focused on a single OOP pillar.  
2. Use standard Java APIs only – no external dependencies.  
3. Include a clear `main` method that demonstrates the concept.  
4. Verify it compiles and runs on your machine before submitting.

### Style guidelines

- Descriptive, intent‑revealing names.  
- One public class per file.  
- Comment the *why* instead of the *what*.  
- Avoid magic numbers; prefer constants or enums if needed.

---

## Changelog

| Date       | Version | Notes |
|------------|---------|-------|
| 2026‑10‑02 | 1.1.4   | Cleaned up README, added concise usage section. |
| 2026‑10‑01 | 1.1.3   | Minor wording updates. |
| 2026‑09‑30 | 1.1.2   | Clarified example table. |
| 2026‑09‑27 | 1.1.1   | Improved usage instructions. |
| 2026‑09‑24 | 1.1.0   | README restructure. |
| 2026‑09‑17 | 1.0.0   | Initial release. |

---

## License

MIT License – see the [LICENSE](LICENSE) file.

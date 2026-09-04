# oops‑question

**A tiny set of Java programs that showcase the core principles of object‑oriented programming.**  
Each example is a single, self‑contained file that can be compiled and run with any JDK 8+ installation.

[![Java 8+](https://img.shields.io/badge/Java-8%2B-brightgreen.svg)](https://openjdk.java.net/install/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

## Example Files

| File | OOP Concept | Description |
|------|-------------|-------------|
| `Question1.java` | Encapsulation | Demonstrates a bank account with private fields and public getters/setters |
| `Question2.java` | Inheritance | Shows single inheritance through a vehicle hierarchy |
| `Question3.java` | Polymorphism | Implements an `Employee` interface and a concrete implementation |
| `Question4.java` | Abstraction | Uses an abstract class to represent shapes |

All examples contain a `main` method and rely only on the standard Java API.

## Getting Started

```bash
# Clone the repository
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question

# Compile and run a single example
javac Question1.java
java Question1
```

To compile and run all examples:

```bash
javac *.java
java Question1
java Question2
java Question3
java Question4
```

## Contributing

1. Fork the repo and create a topic branch

   ```bash
   git checkout -b feature/your-contribution
   ```

2. Add or modify a file

   * Keep a single file focused on one OOP principle.  
   * Use only the standard Java API.  
   * Include a `main` method that demonstrates the feature.

3. Verify it compiles

   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```

4. Push the branch and open a pull request.  
   A clear title and clean build are appreciated.

### Style Guidelines

| Guideline | What it means |
|-----------|---------------|
| **Descriptive names** | Classes and methods should convey intent |
| **Single responsibility** | One file per concept |
| **Minimal coupling** | Avoid unnecessary inter‑file dependencies |
| **Comment sparingly** | Explain only non‑obvious logic |
| **No third‑party libraries** | Keep everything in the JDK |

## License

MIT – see the [LICENSE](LICENSE) file.

## Changelog

| Date | Change |
|------|--------|
| 2026‑09‑05 | Minor cleanup of README, improved wording, added quick‑start section |
| 2026‑09‑04 | Minor cleanup of README, improved wording, added quick‑start section |
| 2026‑09‑02 | Updated README: grammar, badges, streamlined sections |
| 2026‑08‑26 | Refined description, clarified setup instructions |
| 2026‑08‑21 | Simplified feature list and contribution guide |

---

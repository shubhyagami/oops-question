# oops‑question

A small collection of Java programs that demonstrate the fundamental principles of object‑oriented programming.  
Each example is contained in a single file, focuses on one OOP concept (encapsulation, inheritance, polymorphism, or abstraction), and can be compiled and run independently with the standard JDK.

[![Java 8+](https://img.shields.io/badge/Java-8%2B-brightgreen.svg)](https://openjdk.java.net/install/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

## Example Files

| File | OOP Concept | Purpose |
|------|-------------|---------|
| `Question1.java` | Encapsulation | Demonstrates a bank account with private state and getters/setters |
| `Question2.java` | Inheritance | Shows single inheritance through a vehicle hierarchy |
| `Question3.java` | Polymorphism | Implements an employee interface and a concrete implementation |
| `Question4.java` | Abstraction | Uses an abstract class to represent shapes |

All files contain a `main` method for instant execution and rely only on the standard library.

## Quick Start

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

1. Fork the repo and create a feature branch

   ```bash
   git checkout -b feature/your-contribution
   ```

2. Add or modify a file

   * Keep a single file focused on one OOP principle.
   * Use only the standard Java API.
   * Include a `main` method that demonstrates the functionality.

3. Verify it compiles

   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```

4. Push the branch and open a pull request. A clear title and clean build are appreciated.

### Style Guidelines

| Guideline | What it means |
|-----------|---------------|
| **Descriptive names** | Class/method names should clearly express intent |
| **Single responsibility** | One file per concept |
| **Minimal coupling** | Avoid unnecessary inter‑file dependencies |
| **Comment sparingly** | Explain only non‑obvious logic |
| **No third‑party libraries** | Keep everything in the JDK |

## License

MIT – see the [LICENSE](LICENSE) file.

## Changelog

| Date | Change |
|------|--------|
| 2026‑09‑04 | Minor cleanup of README, improved wording, added quick‑start section |
| 2026‑09‑02 | Updated README: grammar, badges, streamlined sections |
| 2026‑08‑26 | Refined description, clarified setup instructions |
| 2026‑08‑21 | Simplified feature list and contribution guide |

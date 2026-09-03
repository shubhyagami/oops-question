# oops‑question

A small collection of Java programs that demonstrate core object‑oriented concepts in a single, self‑contained file. Each example focuses on a single principle—encapsulation, inheritance, polymorphism, or abstraction—so you can compile and run it independently with the standard JDK.

[![Java 8+](https://img.shields.io/badge/Java-8%2B-brightgreen.svg)](https://openjdk.java.net/install/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

## Example files

| File            | Problem description | OOP concept |
|-----------------|---------------------|-------------|
| `Question1.java` | Demonstrates encapsulation of a bank account | Encapsulation |
| `Question2.java` | Shows single inheritance with a vehicle hierarchy | Inheritance |
| `Question3.java` | Implements polymorphism through an employee interface | Polymorphism |
| `Question4.java` | Uses abstract classes to represent shapes | Abstraction |

All examples use only the standard Java API. Each file contains a `main` method for quick testing and requires no external libraries.

## Getting Started

1. **Prerequisites**

   * Java 8 or newer (OpenJDK or Oracle JDK)

2. **Clone the repository**

   ```bash
   git clone https://github.com/shubhyagami/oops-question.git
   cd oops-question
   ```

3. **Compile and run an example**

   ```bash
   javac Question1.java
   java Question1
   ```

   Replace `Question1.java` with any file from the repository.

4. **Compile and run all examples at once**

   ```bash
   javac *.java
   java Question1
   java Question2
   java Question3
   java Question4
   ```

## Contributing

1. Fork the repository and create a feature branch:

   ```bash
   git checkout -b feature/your-contribution
   ```

2. Add or modify a file:

   * Keep the file focused on a single OOP principle.
   * Use only the standard library.
   * Include a `main` method that exercises the code.

3. Verify that it compiles and runs:

   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```

4. Push the branch and open a pull request.  
   A clear, descriptive title and a clean, warning‑free build are appreciated.

### Style guidelines

| Guideline | What it means |
|-----------|---------------|
| **Descriptive names** | Class and method names should convey intent. |
| **Single responsibility** | One file per concept. |
| **Minimal coupling** | Avoid heavy inter‑file dependencies. |
| **Comment sparingly** | Only explain non‑obvious logic. |
| **No third‑party libraries** | Keep all code within the JDK. |

## License

This project is licensed under the MIT License – see the [LICENSE](LICENSE) file for details.

## Changelog

| Date | Change |
|------|-------|
| 2026‑09‑04 | Minor cleanup of README, improved wording, added a quick‑start section. |
| 2026‑09‑02 | Updated README: improved grammar, added badges, streamlined sections. |
| 2026‑08‑26 | Refined description, clarified setup instructions. |
| 2026‑08‑21 | Simplified feature list and contribution guide. |

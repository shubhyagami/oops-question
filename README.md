# oops‑question

**A collection of tiny, self‑contained Java programs that illustrate core object‑oriented concepts.**  
Each file is independent, contains a `main` method, and uses only the standard JDK 8+ API.

[![Java 8+](https://img.shields.io/badge/Java-8%2B-brightgreen.svg)](https://openjdk.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

## What’s in the repo

| File | OOP concept | Description |
|------|-------------|-------------|
| `Question1.java` | Encapsulation | A bank account with private fields and public getters/setters |
| `Question2.java` | Inheritance | A simple vehicle hierarchy demonstrating single inheritance |
| `Question3.java` | Polymorphism | An `Employee` interface and concrete implementation |
| `Question4.java` | Abstraction | An abstract `Shape` class used by concrete shape classes |

These demos are ready to compile and run out of the box.

## Quick start

```bash
# Clone the repository
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question

# Compile a single example
javac Question1.java
java Question1

# Compile and run all examples
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

2. Add or update an example file

   * Keep the file focused on a single OOP concept.
   * Use only the standard Java API.
   * Include a `main` method that demonstrates the feature.

3. Verify the change compiles:

   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```

4. Push and open a pull request.  
   A clear title and a clean build are appreciated.

### Style guidelines

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

- **2026‑09‑05** – Minor cleanup of README, improved wording, added quick‑start section.  
- **2026‑09‑02** – Updated grammar, simplified sections.  
- **2026‑08‑26** – Refined description, clarified setup instructions.  

---

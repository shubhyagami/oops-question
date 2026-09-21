# oops‑question

A tiny collection of single‑file Java programs that each illustrate a core object‑oriented principle.  
All examples compile with the standard JDK (Java 8+) and expose a `main` method so they can be run immediately from the command line.

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

| File           | Concept        | One‑line description |
|----------------|----------------|----------------------|
| `Question1.java` | Encapsulation | Private fields with public getters and setters on a `BankAccount`. |
| `Question2.java` | Inheritance | A vehicle hierarchy: `Vehicle → Car → ElectricCar`. |
| `Question3.java` | Polymorphism | An `Employee` interface implemented by `Manager` and `Developer`. |
| `Question4.java` | Abstraction | An abstract `Shape` class extended by `Circle` and `Rectangle`. |

Compile a file and run its class:

```bash
javac Question1.java
java Question1
```

---

## Features

- **No external dependencies** – relies only on the JDK.
- **Single class per file** – each file focuses on one concept.
- **Self‑contained `main` methods** – quick experimentation without external setup.
- **Ready for teaching** – can be dropped into a classroom or used as a reference.

---

## Prerequisites

- Java 8 or newer (JDK 8+)
- `javac` and `java` in your `PATH`

---

## Getting started

```bash
git clone https://github.com/shubhyagami/oops-question.git
cd oops-question
```

---

## Build & run

### Compile and run a single example

```bash
javac Question1.java
java Question1
```

Replace `Question1` with any other file name (`Question2.java`, `Question3.java`, `Question4.java`).

### Compile all examples

```bash
javac *.java
```

Then run each class as desired:

```bash
java Question1
java Question2
java Question3
java Question4
```

---

## Run all examples

Save the following script as `run-all.sh`, make it executable, and execute it:

```bash
#!/usr/bin/env bash
for f in *.java; do
  javac "$f" && java "${f%.java}"
done
```

```bash
chmod +x run-all.sh
./run-all.sh
```

---

## Contributing

1. Fork the repository and create a feature branch:

   ```bash
   git checkout -b feature/<your-feature>
   ```

2. Add or modify an example:
   * Keep the focus on a single OOP concept.
   * Use only standard Java APIs.
   * Provide a clear `main` method that demonstrates the concept.

3. Verify your changes locally:

   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```

4. Push your branch and submit a pull request.  
   Include a concise title and description.

---

## Style guidelines

- **Descriptive identifiers** – names should convey intent.
- **Single responsibility** – one class per concept, minimal cross‑file references.
- **Keep it simple** – only the JDK, no external libraries.
- **Comments** – use sparingly; explain only non‑obvious logic.

---

## Changelog

| Date       | Notes                                      |
|------------|--------------------------------------------|
| 2026‑09‑18 | Minor README cleanup – wording refined, sections reorganised. |
| 2026‑09‑17 | Added concise feature list and script for running all examples. |

---

## License

MIT – see the [LICENSE](LICENSE) file.

# oops‑question

A small collection of standalone Java programs, each one illustrating a single object‑oriented concept.  
All files compile with any JDK 8+ and contain a `main` method so you can run them directly from the command line.

![Java](https://img.shields.io/badge/Java-8%2B-brightgreen.svg?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-blue.svg?style=flat-square)

---

## Table of contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting started](#getting-started)
- [How to run](#how-to-run)
- [Run all examples](#run-all-examples)
- [Contributing](#contributing)
- [Style guidelines](#style-guidelines)
- [Changelog](#changelog)
- [License](#license)

---

## Overview

| File           | Concept        | One‑line description |
|----------------|----------------|----------------------|
| `Question1.java` | Encapsulation | A `BankAccount` with private fields and public getters/setters. |
| `Question2.java` | Inheritance    | A `Vehicle → Car → ElectricCar` hierarchy. |
| `Question3.java` | Polymorphism   | `Employee` interface implemented by `Manager` and `Developer`. |
| `Question4.java` | Abstraction    | Abstract `Shape` class extended by `Circle` and `Rectangle`. |

Compile a file and run its class:

```bash
javac Question1.java
java Question1
```

---

## Features

- **No external dependencies** – only the JDK is required.
- **One class per file** – each example focuses on a single concept.
- **Self‑contained `main` methods** – run or experiment without extra setup.
- **Teaching‑ready** – drop these files into a classroom or add them to your learning routine.

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

## How to run

### Compile and run a single example

```bash
javac Question2.java
java Question2
```

Replace `Question2` with any other class name.

### Compile all examples at once

```bash
javac *.java
```

Then run each one individually:

```bash
java Question1
java Question2
java Question3
java Question4
```

---

## Run all examples

If you want to execute every example in a single command, save the following script as `run-all.sh`, make it executable and run it:

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
   * Keep focus on a single OOP concept.
   * Use only standard Java APIs.
   * Provide a clear `main` method that demonstrates the concept.

3. Verify changes locally:

   ```bash
   javac YourNewFile.java
   java YourNewFile
   ```

4. Push the branch and open a pull request.  
   Give the PR a concise title and description.

---

## Style guidelines

- Use descriptive names that convey intent.
- One class per file, minimal cross‑file dependencies.
- Keep it simple – no external libraries.
- Add comments only where the code isn’t obvious.

---

## Changelog

| Date       | Notes |
|------------|-------|
| 2026‑09‑18 | Minor README tweaks and section re‑organisation. |
| 2026‑09‑17 | Added feature list and “run all” script. |

---

## License

MIT – see the [LICENSE](LICENSE) file.

# Visitor Design Pattern — Programming Languages

## 1. Project Description

This project demonstrates the **Visitor Design Pattern** in Java using two programming languages: Java and Python.

The Visitor pattern allows us to add new operations to existing classes without modifying those classes.

In this project, visitors provide information about the syntax and performance of different programming languages.

## 2. Project Structure

The project contains the following classes and interfaces:

- **ProgrammingLanguage** — Element interface that declares the `accept()` method.
- **Java** — Concrete Element representing Java.
- **Python** — Concrete Element representing Python.
- **Visitor** — Visitor interface declaring `visit(Java)` and `visit(Python)`.
- **SyntaxVisitor** — Concrete Visitor that describes the syntax of each language.
- **PerformanceVisitor** — Concrete Visitor that describes the performance of each language.
- **Main** — Creates objects and applies visitors to them.

## 3. How the Visitor Pattern Works

1. The Main class creates Java and Python objects.
2. Both objects are stored in a `ProgrammingLanguage` array.
3. Main creates `SyntaxVisitor` and `PerformanceVisitor`.
4. A loop calls `accept()` on each language object.
5. Inside `accept()`, the language calls `visitor.visit(this)`.
6. The appropriate `visit()` method executes depending on the language type.

This process is called **double dispatch** because the executed method depends on both the element type and the visitor.

For example:

```java
public void accept(Visitor visitor) {
    visitor.visit(this);
}
```

When this method executes inside the Java class, `visit(Java java)` is called. When it executes inside the Python class, `visit(Python python)` is called.

## 4. Clean Code Principles

**1. Single Responsibility Principle**

Each visitor has only one responsibility. `SyntaxVisitor` describes syntax, while `PerformanceVisitor` describes performance.

**2. Meaningful Names**

Class names such as `ProgrammingLanguage`, `SyntaxVisitor`, and `PerformanceVisitor` clearly describe their purposes.

**3. Open/Closed Principle**

New operations can be added by creating new Visitor implementations without modifying the existing language classes.

**4. Avoiding Type Checking**

The project does not use `instanceof` or conditional statements to check language types. Instead, double dispatch automatically selects the appropriate method.

**5. Encapsulation**

The visitors interact with language objects through their public methods. The current implementation does not require access to private fields.

**6. Code Reusability**

The same language objects can be used with different visitors without duplicating the element classes.

## 5. How to Run

Compile all Java files:

```bash
javac *.java
```

Run the application:

```bash
java Main
```

Expected output:

```text
Python syntax is simple
Python is slower
Java syntax is complex
Java is faster
```

## 6. Extensibility

The project can be extended by adding another visitor, such as `PopularityVisitor`, which describes the popularity of each programming language.

The new visitor would implement the existing `Visitor` interface and provide implementations for both `visit(Java)` and `visit(Python)`.

No modifications to the Java or Python classes would be necessary.

However, adding a new programming language would require adding another method to the Visitor interface and implementing it in all existing visitors.

## 7. Conclusion

The project demonstrates the Visitor Design Pattern using two Concrete Elements and two Concrete Visitors.

The main advantage of this pattern is that new operations can be added without modifying the existing element classes. Double dispatch ensures that the correct visitor method is called for each programming language.

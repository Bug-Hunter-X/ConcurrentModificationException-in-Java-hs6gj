# ConcurrentModificationException Example

This repository demonstrates a common error in Java: the `ConcurrentModificationException`. This exception occurs when you modify a collection (like an ArrayList) while iterating over it using an iterator (implicitly used in the for-each loop).

## The Problem

The `ConcurrentModificationExceptionExample.java` file contains code that attempts to remove an element from an ArrayList while iterating over it using a for-each loop.  This directly violates the iterator's contract and throws the exception.

## The Solution

The `ConcurrentModificationExceptionExampleSolution.java` demonstrates several ways to safely modify a list during iteration.  You should use one of these methods to avoid this exception.

## How to run

1. Clone the repository.
2. Compile the Java files using a Java compiler (e.g., `javac ConcurrentModificationExceptionExample.java` and `javac ConcurrentModificationExceptionExampleSolution.java`).
3. Run the compiled class files (e.g., `java ConcurrentModificationExceptionExample` and `java ConcurrentModificationExceptionExampleSolution`).

The original code will throw the exception, while the solution demonstrates safe alternatives.
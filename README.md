# Observer Pattern Implementation in Java

## Overview
This project demonstrates the **Observer Design Pattern** in Java using a **Blog-Reader** example. The Observer pattern allows objects to be notified automatically when changes occur in another object.

- The `Blog` acts as the **Subject**, maintaining a list of registered **Observers (Readers)**.
- `Readers` can **subscribe** (register as observers) or **unsubscribe** (remove themselves from the observer list).
- When a new blog post is published, all subscribed readers are notified **automatically**.
- The implementation follows **clean code principles** and includes **JUnit 5** tests.

## Project Structure
```
your-project/
├── build.gradle
├── settings.gradle
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── assignment2
    │               └── observer
    │                   ├── Observer.java
    │                   ├── Subject.java
    │                   ├── Blog.java
    │                   ├── Reader.java
    │                   └── Main.java
    ├── test
    │   └── java
    │       └── com
    │           └── assignment2
    │               └── observer
    │                   └── BlogTest.java
```

## Installation & Running Tests
1. Ensure **Gradle** is installed.
2. Navigate to the project root directory.
3. Run the following command to execute the tests:
   ```bash
   gradle test
   ```
4. If using an IDE like IntelliJ IDEA or VS Code, you can run tests through the built-in test runner.

## Dependencies
The project uses **JUnit 5** for testing. Ensure the following dependency is included in your `build.gradle` file:

```groovy
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter:5.9.3'
}
```

## How It Works
1. The `Blog` class maintains a list of `Reader` objects (observers).
2. When a new blog post is published, the `notifyObservers` method is triggered, updating all subscribed `Reader` instances.
3. The `Reader` class implements the `Observer` interface, meaning each reader updates its state when notified.
4. Tests in `BlogTest.java` verify that observers receive updates and handle subscriptions/unsubscriptions correctly.

## Author
Developed as part of an **Observer Pattern** assignment for better understanding of design patterns in Java.


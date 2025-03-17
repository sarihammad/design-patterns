# Design Patterns in Java

This repository provides implementations of common design patterns in Java. Each pattern includes a practical example, explanation, and test cases to help developers learn and apply these patterns in real-world projects.

## Table of Contents

- [Introduction](#introduction)
- [Design Patterns Covered](#design-patterns-covered)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Examples](#examples)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Design patterns are reusable solutions to common software design problems. They provide a structured approach to solving design challenges, improving code maintainability, scalability, and reusability.

This repository covers three major categories of design patterns:

1. **Creational Patterns** - Object creation mechanisms.
2. **Structural Patterns** - Class and object composition.
3. **Behavioral Patterns** - Interaction between objects.

## Design Patterns Covered

### Creational Patterns

- **Singleton** - Ensures a class has only one instance.
- **Factory Method** - Creates objects without specifying exact class.
- **Builder** - Constructs complex objects step by step.
- **Prototype** - Clones existing objects.
- **Abstract Factory** - Factory of factories for creating related objects.

### Structural Patterns

- **Adapter** - Bridges between incompatible interfaces.
- **Decorator** - Dynamically adds behavior to objects.
- **Facade** - Provides a simplified interface to a subsystem.
- **Proxy** - Controls access to an object.
- **Bridge** - Decouples abstraction from implementation.
- **Composite** - Represents part-whole hierarchies.

### Behavioral Patterns

- **Strategy** - Defines interchangeable algorithms.
- **Observer** - Notifies multiple objects of changes.
- **Command** - Encapsulates requests as objects.
- **Template Method** - Defines a skeleton of an algorithm.
- **Mediator** - Controls communication between objects.
- **Chain of Responsibility** - Passes requests along a chain of handlers.

## Project Structure

```
design-patterns/
│── src/
│   ├── creational/
│   │   ├── singleton/
│   │   ├── factory/
│   │   ├── builder/
│   │   ├── prototype/
│   │   ├── abstractfactory/
│   ├── structural/
│   │   ├── adapter/
│   │   ├── decorator/
│   │   ├── facade/
│   │   ├── proxy/
│   │   ├── bridge/
│   │   ├── composite/
│   ├── behavioral/
│   │   ├── strategy/
│   │   ├── observer/
│   │   ├── command/
│   │   ├── template/
│   │   ├── mediator/
│   │   ├── chainofresponsibility/
│── test/  (JUnit test cases)
│── README.md
│── pom.xml (Maven dependencies)
│── .gitignore
```

## Getting Started

### Prerequisites

- Java 11 or later
- Maven installed (`mvn -version` to check)
- An IDE (IntelliJ, Eclipse, or VS Code)

### Installation

1. Clone the repository:

```bash
git clone https://github.com/sarihammad/design-patterns.git
cd design-patterns
```

2. Build the project:

```bash
mvn clean install
```

## Usage

1. Navigate to a pattern's directory.
2. Run the main method or test cases.
3. Modify or extend the examples to experiment with different implementations.

Example:

```bash
cd src/main/java/creational/singleton
javac SingletonTest.java
java SingletonTest
```

## Examples

### Singleton Pattern

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
```

Usage:

```java
Singleton s1 = Singleton.getInstance();
Singleton s2 = Singleton.getInstance();
System.out.println(s1 == s2); // true
```

### Factory Pattern

```java
public interface Vehicle {
    void drive();
}

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}

public class VehicleFactory {
    public Vehicle createVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }
}
```

### Observer Pattern

```java
public interface Observer {
    void update(String message);
}

public class NewsChannel implements Observer {
    private String name;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}

public class NewsAgency {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}
```

### Decorator Pattern

```java
public interface Coffee {
    String getDescription();
    double getCost();
}

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 2.0;
    }
}

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " + Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}
```

# Design Patterns in Java

This repository demonstrates the implementation of various design patterns in Java, showcasing advanced Object-Oriented Design (OOD) skills. These patterns provide reusable solutions to common problems in software design, improving code modularity, maintainability, and flexibility.

## Introduction

This project is a comprehensive collection of design pattern implementations in Java. Each pattern is implemented in a way that emphasizes the principles of Object-Oriented Design (OOD) such as encapsulation, inheritance, and polymorphism. By examining these patterns, you will gain insight into how to apply OOD principles to solve complex software design problems effectively.

## Design Patterns Implemented

### Chain of Responsibility

**Purpose:** Allows an object to send a command without knowing which object will handle it, promoting loose coupling.

**OOD Principles:** 
- Encapsulation: Request handling is encapsulated within handler objects.
- Polymorphism: Different handlers can handle requests in their own way.

**Implementation:**
- **Classes:** `Handler`, `ConcreteHandler1`, `ConcreteHandler2`, `Client`

### State

**Purpose:** Allows an object to change its behavior when its state changes, appearing to change its class.

**OOD Principles:** 
- Encapsulation: State transitions and behaviors are encapsulated within state objects.
- Polymorphism: Different states implement different behaviors.

**Implementation:**
- **Classes:** `ATMState`, `HasCard`, `HasPin`, `NoCard`, `NoCash`, `ATMMachine`, `TestATMMachine`

### Adapter

**Purpose:** Allows incompatible interfaces to work together.

**OOD Principles:** 
- Encapsulation: The adapter encapsulates the adaptee and target interface.
- Inheritance: The adapter can extend the target or adaptee class.

**Implementation:**
- **Classes:** `EnemyAttacker`, `EnemyRobot`, `EnemyRobotAdapter`, `TestEnemyAttackers`

### Factory

**Purpose:** Defines an interface for creating an object but lets subclasses alter the type of objects that will be created.

**OOD Principles:** 
- Encapsulation: Object creation is encapsulated within factory methods.
- Polymorphism: Subclasses decide which class to instantiate.

**Implementation:**
- **Classes:** `EnemyShip`, `UFOEnemyShip`, `RocketEnemyShip`, `BigUFOEnemyShip`, `EnemyShipFactory`, `Client`

### Template

**Purpose:** Defines the skeleton of an algorithm in an operation, deferring some steps to subclasses.

**OOD Principles:** 
- Encapsulation: Algorithm structure is encapsulated in the template method.
- Inheritance: Subclasses override specific steps of the algorithm.

**Implementation:**
- **Classes:** `Hoagie`, `ItalianHoagie`, `VeggieHoagie`, `SandwichSculptor`

### Proxy

**Purpose:** Provides a surrogate or placeholder for another object to control access to it.

**OOD Principles:** 
- Encapsulation: Proxy controls access to the real subject.
- Polymorphism: Proxy implements the same interface as the real subject.

**Implementation:**
- **Classes:** `Client`, `ATMProxy`, `GetATMState`

### Singleton

**Purpose:** Ensures a class has only one instance and provides a global point of access to it.

**OOD Principles:** 
- Encapsulation: Single instance is encapsulated within the class.
- Inheritance: Singleton class can be extended for more specific singletons.

**Implementation:**
- **Classes:** `Singleton`, `Client`

### Decorator

**Purpose:** Attaches additional responsibilities to an object dynamically.

**OOD Principles:** 
- Encapsulation: Decorators encapsulate the component to be decorated.
- Inheritance: Decorators and components share a common interface.

**Implementation:**
- **Classes:** `Pizza`, `PlainPizza`, `ToppingDecorator`, `Mozzarella`, `TomatoSauce`, `PizzaMaker`

### Observer

**Purpose:** Defines a one-to-many dependency so that when one object changes state, all its dependents are notified.

**OOD Principles:** 
- Encapsulation: Subjects and observers are decoupled.
- Polymorphism: Different observers can respond to state changes differently.

**Implementation:**
- **Classes:** `Subject`, `Store`, `Observer`, `Customer`, `Application`

### Facade

**Purpose:** Provides a unified interface to a set of interfaces in a subsystem.

**OOD Principles:** 
- Encapsulation: Facade encapsulates the subsystem.
- Inheritance: Facade can be extended to provide additional functionality.

**Implementation:**
- **Classes:** `Facade`

### Command

**Purpose:** Encapsulates a request as an object, allowing for parameterization and queuing of requests.

**OOD Principles:** 
- Encapsulation: Command encapsulates request details.
- Polymorphism: Different commands implement the same interface.

### Strategy

**Purpose:** Defines a family of algorithms, encapsulates each one, and makes them interchangeable.

**OOD Principles:** 
- Encapsulation: Algorithms are encapsulated within strategy objects.
- Polymorphism: Context uses strategies polymorphically.

## Getting Started

To get a copy of the project up and running on your local machine, follow these steps.

### Prerequisites

- Java Development Kit (JDK)
- An Integrated Development Environment (IDE) like IntelliJ IDEA or Eclipse

### Installation

1. Clone the repository
   ```bash
   git clone https://github.com/divyamsavsaviya/object-oriented-design-patterns.git
   ```
2. Open the project in your IDE.
3. Build the project to resolve dependencies.
4. Run the individual pattern implementations to see them in action.

## Usage

Each design pattern is implemented in its own package. To run a specific pattern, navigate to the package and run the `Main` class or a relevant test class.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue to discuss changes.

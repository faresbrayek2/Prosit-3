# Zoo Management System

A simple Java project for managing a zoo, which includes adding, searching, and removing animals from the zoo, as well as comparing two zoos based on the number of animals they contain.

## Table of Contents

- [Description](#description)
- [Key Features](#key-features)
- [Usage](#usage)
- [Contributors](#contributors)
- [License](#license)

## Description

This Java project provides a basic framework for managing a zoo. It consists of three main classes: `Zoo`, `ZooManagement`, and `Animal`. These classes interact to allow users to create and manage a zoo with various animals. The project demonstrates object-oriented design principles and Java programming concepts.

## Key Features

- Object-oriented design with three classes: `Zoo`, `ZooManagement`, and `Animal`.
- Add animals to the zoo, search for animals, and remove them.
- Display zoo information and the list of animals.
- Compare two zoos based on the number of animals they have.

## Usage

1. Create a `Zoo` object by providing a name and city.
2. Add `Animal` objects to the zoo using the `addAnimal` method.
3. Display zoo information using the `displayZoo` method.
4. Display the list of animals using the `displayAnimals` method.
5. Search for animals in the zoo using the `searchAnimal` method.
6. Remove animals from the zoo using the `removeAnimal` method.
7. Check if the zoo is full based on a predefined maximum number of cages using the `isZooFull` method.
8. Compare two zoos based on the number of animals they contain using the `comparerZoo` method.

```java
// Example usage:
Zoo myZoo = new Zoo("My Zoo", "My City");
myZoo.addAnimal(new Animal("Feline", "Lion", 3, true));
myZoo.displayZoo();
myZoo.displayAnimals();
// ...
```

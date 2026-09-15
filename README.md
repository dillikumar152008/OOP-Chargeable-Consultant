# OOP Chargeable Consultant

A Java Object-Oriented Programming project demonstrating the use of an interface, implementation, constructors, and fee calculation through a Consultant class.

## Overview

This project implements a `Chargeable` interface containing the `chargeFee()` method. The `Consultant` class implements this interface and calculates the total consultation fee based on the consultation duration and hourly fee.

The project demonstrates how interfaces can be used to define a common behavior and how classes can provide their own implementation of that behavior.

## Features

- Defines a custom Java interface
- Implements an interface using a class
- Demonstrates method overriding
- Uses a parameterized constructor
- Performs consultation fee calculation
- Displays structured output
- Demonstrates basic Object-Oriented Programming principles

## Project Structure

OOP-Chargeable-Consultant/
│
├── Consultant.java
├── README.md
└── .gitignore

## Program Design

Chargeable
   Interface
       │
       │ implements
       ↓
Consultant
   Class
       │
       ↓
chargeFee()
       │
       ↓
Calculate Total Fee
       │
       ↓
Hours × Fee Per Hour

## Fee Calculation

The total consultation fee is calculated using:

Total Consultation Fee = Consultation Hours × Fee Per Hour

For example:

5 hours × ₹1000/hour = ₹5000

## Technologies Used

- Java
- Object-Oriented Programming
- Java Interfaces
- Git
- GitHub

## How to Run

### 1. Clone the Repository

git clone https://github.com/dillikumar152008/OOP-Chargeable-Consultant.git

### 2. Navigate to the Project Directory

cd OOP-Chargeable-Consultant

### 3. Compile the Java Program

javac Consultant.java

### 4. Run the Program

java Consultant

## Sample Output

Consultation Hours: 5
Fee Per Hour: ₹1000.0
Total Consultation Fee: ₹5000.0

## OOP Concepts Demonstrated

| Concept | Implementation |
|---|---|
| Interface | `Chargeable` |
| Interface Implementation | `Consultant implements Chargeable` |
| Method Overriding | `chargeFee()` |
| Constructor | `Consultant(int hours, double feePerHour)` |
| Object Creation | `new Consultant(5, 1000)` |
| Fee Calculation | `hours × feePerHour` |

## Learning Objective

The objective of this project is to understand how Java interfaces are created and implemented, and how Object-Oriented Programming concepts can be applied to a simple real-world scenario involving consultation services and fee calculation.

## Repository

GitHub Repository:
https://github.com/dillikumar152008/OOP-Chargeable-Consultant
# Burger Kitchen Order System — Facade Pattern

## Overview
This project demonstrates the **Facade Structural Design Pattern** in Java (JDK 17).
It provides a unified, simplified interface (`KitchenFacade`) over a multi-stage restaurant kitchen subsystem composed of inventory checks, grill operations, assembly layering, and packaging.

## Subsystem Classes
- **`InventoryManager`**: Checks ingredient availability and updates stock counts.
- **`GrillStation`**: Manages cooking times and temperatures per patty type.
- **`AssemblyStation`**: Sequences bread toasting, patty placement, and topping application.
- **`PackagingStation`**: Wraps the final product and boxes combo items.

## How to Run
```bash
javac src/subsystem/*.java src/facade/*.java src/Main.java -d out
java -cp out Main
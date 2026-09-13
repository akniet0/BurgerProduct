# Assignment 1 — Builder Pattern: Burger Builder

## Description
This project implements the Builder Creational Design Pattern in Java (JDK 17). It provides a step-by-step construction process for creating customized `Burger` objects with different requirements (Beef Burger vs. Vegan Burger).

## Structure
- **Product**: `Burger.java`
- **Builder Interface**: `BurgerBuilder.java`
- **Concrete Builders**: 
  - `BeefBurgerBuilder.java` (enforces beef patty)
  - `VeganBurgerBuilder.java` (enforces strict plant-based ingredients)
- **Director**: `BurgerDirector.java` (builds preset menu recipes)
- **Client**: `Main.java` (demonstrates builds and validation checks)

## How to Run
1. Open the project in IntelliJ IDEA (or any Java IDE).
2. Ensure JDK 17 is selected.
3. Run `Main.java`.

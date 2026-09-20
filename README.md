# Assignment 2 - Burger Restaurant

---

## Overview

This repository demonstrates the implementation and practical usage of creational design patterns within an evolving fast-food restaurant system:
1. **Builder Pattern (Assignment 1):** Handles step-by-step internal construction and validation of individual burger components (buns, patties, toppings, sauces).
2. **Factory Method (Assignment 2, Part A):** Encapsulates single-product instantiation behind specialized kitchen creators (`BeefBurgerRestaurant`, `VeganBurgerRestaurant`) without coupling base order logic to concrete types.
3. **Abstract Factory (Assignment 2, Part B):** Produces families of related products (`Burger`, `Drink`, `Side`) via unified factory interfaces (`ClassicBeefMealFactory`, `HealthyVeganMealFactory`), ensuring menu and dietary consistency across combo packages.

---

## Project Structure

```text
src/
├── builder/                       
│   ├── BeefBurgerBuilder.java
│   ├── BurgerBuilder.java
│   ├── BurgerDirector.java
│   └── VeganBurgerBuilder.java
├── factorymethod/                 
│   ├── BeefBurgerRestaurant.java  
│   ├── Restaurant.java            
│   └── VeganBurgerRestaurant.java 
├── abstractfactory/               
│   ├── ClassicBeefMealFactory.java
│   ├── HealthyVeganMealFactory.java
│   ├── MealCombo.java             
│   └── MealFactory.java           
├── model/                         
│   ├── BeefBurger.java            
│   ├── Burger.java                
│   ├── Drink.java                 
│   ├── Side.java                  
│   ├── VeganBurger.java           
│   └── items/                     
│       ├── ColaDrink.java
│       ├── FriesSide.java
│       ├── SaladSide.java
│       └── SmoothieDrink.java
└── Main.java                      

```

## How to Run
Open the project in IntelliJ IDEA (or any JDK 17+ environment).

Compile and run src/Main.java.
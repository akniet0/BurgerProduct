# Burger Visitor Pattern (Assignment #6)

Implementation of the **Visitor** behavioral design pattern in Java (JDK 17)

## Project Structure
```text
src/
└── burger/
    ├── elements/
    │   ├── BurgerElement.java          # Element interface
    │   ├── Bun.java                    # Concrete Element
    │   ├── Patty.java                  # Concrete Element
    │   ├── Topping.java                # Concrete Element
    │   └── Burger.java                 # Object Structure (Composite)
    ├── visitors/
    │   ├── BurgerVisitor.java          # Visitor interface
    │   ├── PriceCalculatorVisitor.java # Concrete Visitor 1 (Price in KZT)
    │   └── CalorieCalculatorVisitor.java # Concrete Visitor 2 (Calories in kcal)
    └── Main.java                       # Client driver
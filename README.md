# Burger Product - Bridge Design Pattern

Implementation of the Bridge structural design pattern in Java (JDK 17).

## Domain Overview
- **Abstraction Hierarchy**: `Burger` (Base), `Cheeseburger`, `SpicyBBQBurger`
- **Implementor Hierarchy**: `CookingEngine` (Interface), `FlameGrillEngine`, `SmashGriddleEngine`

By separating the high-level recipe logic from the cooking hardware execution, both hierarchies can evolve independently without causing a combinatorial explosion of subclasses.

## How to Compile and Run
Open terminal in the project root directory:

```bash
# Compile all source files
javac -d out src/implementor/*.java src/abstraction/*.java src/Main.java

# Run the client demonstration
java -cp out Main
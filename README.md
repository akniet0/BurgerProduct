# Burger Order Pricing | Strategy Design Pattern

Implementation of the Strategy behavioral pattern in Java for dynamic burger order pricing.

## Structure

- `BurgerPricingStrategy` (Strategy Interface): Defines the common price calculation contract.
- `StandardPricingStrategy`, `StudentDiscountStrategy`, `HappyHourDiscountStrategy`, `VipMemberDiscountStrategy` (Concrete Strategies): Encapsulate individual discount algorithms.
- `BurgerOrder` (Context): Maintains order data and delegates calculation to the assigned strategy.
- `Main` (Client): Demonstrates runtime strategy switching without conditional logic in the context.
- `BurgerOrderTest`: Comprehensive JUnit 5 test suite verifying algorithm correctness and validation.

## Clean Code Principles Applied 

1. **Single Responsibility Principle:** `BurgerOrder` manages order state; each strategy manages exactly one pricing formula.
2. **Open-Closed Principle:** Adding new promotions (e.g., VIP discount) requires writing a new class without modifying existing classes.
3. **High Cohesion:** Concrete strategies only store constants directly used by their own formula.
4. **Separation of Construction and Use:** `BurgerOrder` receives strategies via injection; it does not instantiate concrete strategies directly.
5. **Clean Tests:** Unit tests follow the Arrange-Act-Assert pattern, run fast, test a single concept per test, and are self-validating.

## How to Run

### In IntelliJ IDEA
1. Open the project folder in IntelliJ IDEA.
2. Right-click the `src` folder -> **Mark Directory as** -> **Sources Root**.
3. Right-click the `test` folder -> **Mark Directory as** -> **Test Sources Root**.
4. Run `Main.java` to see runtime strategy swapping.
5. Run `BurgerOrderTest.java` to run all unit tests.
# Burger Order Pricing — Strategy Design Pattern

Implementation of the Strategy behavioral pattern in Java for dynamic burger order pricing[cite: 1].

## Structure

- `BurgerPricingStrategy` (Strategy Interface): Defines the common price calculation contract[cite: 1].
- `StandardPricingStrategy`, `StudentDiscountStrategy`, `HappyHourDiscountStrategy`, `VipMemberDiscountStrategy` (Concrete Strategies): Encapsulate individual discount algorithms[cite: 1].
- `BurgerOrder` (Context): Maintains order data and delegates calculation to the assigned strategy[cite: 1].
- `Main` (Client): Demonstrates runtime strategy switching without conditional logic in the context[cite: 1].
- `BurgerOrderTest`: Comprehensive JUnit 5 test suite verifying algorithm correctness and validation[cite: 1].

## Clean Code Principles Applied (Chapters 9, 10, 11)

1. **Single Responsibility Principle (Ch. 10):** `BurgerOrder` manages order state; each strategy manages exactly one pricing formula[cite: 1].
2. **Open-Closed Principle (Ch. 10):** Adding new promotions (e.g., VIP discount) requires writing a new class without modifying existing classes[cite: 1].
3. **High Cohesion (Ch. 10):** Concrete strategies only store constants directly used by their own formula[cite: 1].
4. **Separation of Construction and Use (Ch. 11):** `BurgerOrder` receives strategies via injection; it does not instantiate concrete strategies directly[cite: 1].
5. **Clean Tests (Ch. 9):** Unit tests follow the Arrange-Act-Assert pattern, run fast, test a single concept per test, and are self-validating[cite: 1].

## How to Run

### In IntelliJ IDEA
1. Open the project folder in IntelliJ IDEA[cite: 1].
2. Right-click the `src` folder -> **Mark Directory as** -> **Sources Root**.
3. Right-click the `test` folder -> **Mark Directory as** -> **Test Sources Root**.
4. Run `Main.java` to see runtime strategy swapping[cite: 1].
5. Run `BurgerOrderTest.java` to run all unit tests[cite: 1].
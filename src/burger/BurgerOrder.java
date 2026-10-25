package burger;

import java.util.Objects;

public class BurgerOrder {

    private final String burgerName;
    private final double basePrice;
    private BurgerPricingStrategy strategy;

    public BurgerOrder(String burgerName, double basePrice, BurgerPricingStrategy initialStrategy) {
        if (basePrice < 0) {
            throw new IllegalArgumentException("Base price cannot be negative.");
        }
        this.burgerName = Objects.requireNonNull(burgerName, "Burger name cannot be null.");
        this.basePrice = basePrice;
        this.strategy = Objects.requireNonNull(initialStrategy, "Strategy cannot be null.");
    }

    public void setPricingStrategy(BurgerPricingStrategy newStrategy) {
        this.strategy = Objects.requireNonNull(newStrategy, "Strategy cannot be null.");
    }

    public double calculateTotal() {
        return strategy.calculateFinalPrice(basePrice);
    }

    public String getReceipt() {
        return String.format("%s | Base: $%.2f | Applied: %s | Total: $%.2f",
                burgerName, basePrice, strategy.getStrategyName(), calculateTotal());
    }

    public String getBurgerName() {
        return burgerName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public BurgerPricingStrategy getPricingStrategy() {
        return strategy;
    }
}
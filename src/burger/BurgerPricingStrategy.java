package burger;

public interface BurgerPricingStrategy {
    double calculateFinalPrice(double basePrice);
    String getStrategyName();
}
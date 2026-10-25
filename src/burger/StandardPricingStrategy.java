package burger;

public class StandardPricingStrategy implements BurgerPricingStrategy {

    @Override
    public double calculateFinalPrice(double basePrice) {
        return Math.max(0.0, basePrice);
    }

    @Override
    public String getStrategyName() {
        return "Standard Price";
    }
}
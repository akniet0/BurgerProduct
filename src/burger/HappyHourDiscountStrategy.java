package burger;

public class HappyHourDiscountStrategy implements BurgerPricingStrategy {

    private static final double DISCOUNT_RATE = 0.25;

    @Override
    public double calculateFinalPrice(double basePrice) {
        return Math.max(0.0, basePrice * (1.0 - DISCOUNT_RATE));
    }

    @Override
    public String getStrategyName() {
        return "Happy Hour (25% off)";
    }
}
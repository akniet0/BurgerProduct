package burger;

public class StudentDiscountStrategy implements BurgerPricingStrategy {

    private static final double DISCOUNT_RATE = 0.15;

    @Override
    public double calculateFinalPrice(double basePrice) {
        return Math.max(0.0, basePrice * (1.0 - DISCOUNT_RATE));
    }

    @Override
    public String getStrategyName() {
        return "Student Discount (15% off)";
    }
}
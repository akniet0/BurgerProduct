package burger;

public class VipMemberDiscountStrategy implements BurgerPricingStrategy {

    private static final double VOUCHER_DEDUCTION = 2.00;
    private static final double EXTRA_DISCOUNT_RATE = 0.10;

    @Override
    public double calculateFinalPrice(double basePrice) {
        double discounted = (basePrice - VOUCHER_DEDUCTION) * (1.0 - EXTRA_DISCOUNT_RATE);
        return Math.max(0.0, discounted);
    }

    @Override
    public String getStrategyName() {
        return "VIP Reward ($2 voucher + 10% off)";
    }
}
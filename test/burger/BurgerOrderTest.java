package burger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BurgerOrderTest {

    @Test
    @DisplayName("Standard pricing charges full base price")
    void calculateTotal_standardPricing_chargesFullBasePrice() {
        BurgerOrder order = new BurgerOrder("Classic Cheeseburger", 10.00, new StandardPricingStrategy());
        assertEquals(10.00, order.calculateTotal(), 0.001);
    }

    @Test
    @DisplayName("Student discount deducts 15% from base price")
    void calculateTotal_studentDiscount_deductsFifteenPercent() {
        BurgerOrder order = new BurgerOrder("Crispy Chicken Burger", 10.00, new StudentDiscountStrategy());
        assertEquals(8.50, order.calculateTotal(), 0.001);
    }

    @Test
    @DisplayName("Happy hour discount deducts 25% from base price")
    void calculateTotal_happyHour_deductsTwentyFivePercent() {
        BurgerOrder order = new BurgerOrder("Double Smash Burger", 12.00, new HappyHourDiscountStrategy());
        assertEquals(9.00, order.calculateTotal(), 0.001);
    }

    @Test
    @DisplayName("VIP discount deducts $2 voucher and 10% from remainder")
    void calculateTotal_vipDiscount_appliesVoucherAndPercentage() {
        BurgerOrder order = new BurgerOrder("Truffle Swiss Burger", 12.00, new VipMemberDiscountStrategy());
        // (12.00 - 2.00) * 0.90 = 9.00
        assertEquals(9.00, order.calculateTotal(), 0.001);
    }

    @Test
    @DisplayName("Switching pricing strategy dynamically updates order total")
    void setPricingStrategy_dynamicallyChangesCalculation() {
        BurgerOrder order = new BurgerOrder("Classic Cheeseburger", 20.00, new StandardPricingStrategy());
        assertEquals(20.00, order.calculateTotal(), 0.001);

        order.setPricingStrategy(new StudentDiscountStrategy());
        assertEquals(17.00, order.calculateTotal(), 0.001);

        order.setPricingStrategy(new HappyHourDiscountStrategy());
        assertEquals(15.00, order.calculateTotal(), 0.001);
    }

    @Test
    @DisplayName("Constructor throws IllegalArgumentException for negative price")
    void constructor_negativePrice_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () ->
                new BurgerOrder("Invalid Burger", -1.0, new StandardPricingStrategy()));
    }

    @Test
    @DisplayName("Constructor throws NullPointerException when strategy is null")
    void constructor_nullStrategy_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () ->
                new BurgerOrder("Classic Cheeseburger", 10.00, null));
    }
}
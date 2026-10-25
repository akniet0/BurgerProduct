package burger;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Burger Kitchen POS Terminal ===\n");

        // 1. Context created with default strategy
        BurgerOrder order = new BurgerOrder("Double Mushroom Swiss Burger", 12.00, new StandardPricingStrategy());
        System.out.println("1. Initial Order Placed:");
        System.out.println(order.getReceipt());

        // 2. Runtime switch to Student Discount
        System.out.println("\n2. Customer shows Student ID (switching strategy):");
        order.setPricingStrategy(new StudentDiscountStrategy());
        System.out.println(order.getReceipt());

        // 3. Runtime switch to Happy Hour Discount
        System.out.println("\n3. Happy Hour window active (switching strategy):");
        order.setPricingStrategy(new HappyHourDiscountStrategy());
        System.out.println(order.getReceipt());

        // 4. Runtime switch to VIP Member Discount
        System.out.println("\n4. Customer scans VIP loyalty card (switching strategy):");
        order.setPricingStrategy(new VipMemberDiscountStrategy());
        System.out.println(order.getReceipt());
    }
}
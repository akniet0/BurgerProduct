package burger;

import burger.elements.Bun;
import burger.elements.Burger;
import burger.elements.Patty;
import burger.elements.Topping;
import burger.visitors.CalorieCalculatorVisitor;
import burger.visitors.PriceCalculatorVisitor;

public class Main {
    public static void main(String[] args) {
        Burger doubleBeefBurger = new Burger("Astana Double Beef Burger");
        doubleBeefBurger.addIngredient(new Bun("Brioche Bun", 300.0, 260, false));
        doubleBeefBurger.addIngredient(new Patty("Angus Beef", 150, 6.0, 250));
        doubleBeefBurger.addIngredient(new Patty("Angus Beef", 150, 6.0, 250));
        doubleBeefBurger.addIngredient(new Topping("Cheddar Cheese", 250.0, 110));
        doubleBeefBurger.addIngredient(new Topping("Caramelized Onions", 150.0, 60));
        doubleBeefBurger.addIngredient(new Topping("Smoky BBQ Sauce", 100.0, 45));

        PriceCalculatorVisitor priceVisitor = new PriceCalculatorVisitor();
        doubleBeefBurger.accept(priceVisitor);

        CalorieCalculatorVisitor calorieVisitor = new CalorieCalculatorVisitor();
        doubleBeefBurger.accept(calorieVisitor);

        System.out.println("=== Burger Report: " + doubleBeefBurger.getName() + " ===");
        System.out.printf("Total Price:    %.2f KZT%n", priceVisitor.getTotalPrice());
        System.out.printf("Total Calories: %d kcal%n", calorieVisitor.getTotalCalories());
    }
}
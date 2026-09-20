package abstractfactory;

import model.Burger;
import model.Drink;
import model.Side;

public class MealCombo {
    private final Burger burger;
    private final Drink drink;
    private final Side side;


    public MealCombo(MealFactory factory) {
        this.burger = factory.createBurger();
        this.drink = factory.createDrink();
        this.side = factory.createSide();
    }

    public void displayMeal() {
        System.out.println("=== COMBO MEAL SUMMARY ===");
        System.out.println(burger);
        System.out.println(" - Drink: " + drink.getDetails());
        System.out.println(" - Side:  " + side.getDetails());
        System.out.println("==========================\n");
    }
}
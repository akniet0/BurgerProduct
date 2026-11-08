package burger.visitors;

import burger.elements.Bun;
import burger.elements.Patty;
import burger.elements.Topping;

public class CalorieCalculatorVisitor implements BurgerVisitor {
    private int totalCalories = 0;

    @Override
    public void visitBun(Bun bun) {
        totalCalories += bun.getCalories();
    }

    @Override
    public void visitPatty(Patty patty) {
        int pattyCalories = (patty.getWeightGrams() * patty.getCaloriesPer100g()) / 100;
        totalCalories += pattyCalories;
    }

    @Override
    public void visitTopping(Topping topping) {
        totalCalories += topping.getCalories();
    }

    public int getTotalCalories() {
        return totalCalories;
    }
}
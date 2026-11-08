package burger.visitors;

import burger.elements.Bun;
import burger.elements.Patty;
import burger.elements.Topping;

public class PriceCalculatorVisitor implements BurgerVisitor {
    private static final double GLUTEN_FREE_SURCHARGE = 150.0;
    private double totalPrice = 0.0;

    @Override
    public void visitBun(Bun bun) {
        double bunCost = bun.getBasePrice();
        if (bun.isGlutenFree()) {
            bunCost += GLUTEN_FREE_SURCHARGE;
        }
        totalPrice += bunCost;
    }

    @Override
    public void visitPatty(Patty patty) {
        totalPrice += patty.getWeightGrams() * patty.getPricePerGram();
    }

    @Override
    public void visitTopping(Topping topping) {
        totalPrice += topping.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
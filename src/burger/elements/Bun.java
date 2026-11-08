package burger.elements;

import burger.visitors.BurgerVisitor;

public class Bun implements BurgerElement {
    private final String type;
    private final double basePrice;
    private final int calories;
    private final boolean glutenFree;

    public Bun(String type, double basePrice, int calories, boolean glutenFree) {
        this.type = type;
        this.basePrice = basePrice;
        this.calories = calories;
        this.glutenFree = glutenFree;
    }

    public String getType() {
        return type;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    @Override
    public void accept(BurgerVisitor visitor) {
        visitor.visitBun(this);
    }
}
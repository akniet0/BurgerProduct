package burger.elements;

import burger.visitors.BurgerVisitor;

public class Topping implements BurgerElement {
    private final String name;
    private final double price;
    private final int calories;

    public Topping(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public void accept(BurgerVisitor visitor) {
        visitor.visitTopping(this);
    }
}
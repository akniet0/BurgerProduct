package factorymethod;

import model.Burger;

public abstract class Restaurant {
    public abstract Burger createBurger();

    public Burger orderBurger() {
        Burger burger = createBurger();
        System.out.println("Processing order for: " + burger.getCategory());
        return burger;
    }
}
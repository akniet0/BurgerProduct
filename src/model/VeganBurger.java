package model;

import java.util.List;

public class VeganBurger extends Burger {
    public VeganBurger(String bun, String patty, String cheese, List<String> toppings, List<String> sauces) {
        super(bun, patty, cheese, toppings, sauces);
    }

    @Override
    public String getCategory() {
        return "Vegan Burger";
    }
}
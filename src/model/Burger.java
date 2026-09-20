package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Burger {
    private final String bun;
    private final String patty;
    private final String cheese;
    private final List<String> toppings;
    private final List<String> sauces;

    protected Burger(String bun, String patty, String cheese, List<String> toppings, List<String> sauces) {
        this.bun = bun;
        this.patty = patty;
        this.cheese = cheese;
        this.toppings = Collections.unmodifiableList(new ArrayList<>(toppings));
        this.sauces = Collections.unmodifiableList(new ArrayList<>(sauces));
    }

    public String getBun() { return bun; }
    public String getPatty() { return patty; }
    public String getCheese() { return cheese; }
    public List<String> getToppings() { return toppings; }
    public List<String> getSauces() { return sauces; }

    public abstract String getCategory();

    @Override
    public String toString() {
        return "[" + getCategory() + "]\n" +
                " - Bun: " + bun + "\n" +
                " - Patty: " + patty + "\n" +
                " - Cheese: " + (cheese != null ? cheese : "None") + "\n" +
                " - Toppings: " + (toppings.isEmpty() ? "None" : String.join(", ", toppings)) + "\n" +
                " - Sauces: " + (sauces.isEmpty() ? "None" : String.join(", ", sauces));
    }
}
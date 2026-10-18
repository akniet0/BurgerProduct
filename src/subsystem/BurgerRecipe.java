package subsystem;

import java.util.Collections;
import java.util.List;

public class BurgerRecipe {
    private final String name;
    private final String pattyType;
    private final List<String> toppings;

    public BurgerRecipe(String name, String pattyType, List<String> toppings) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Burger name cannot be empty.");
        }
        if (pattyType == null || pattyType.isBlank()) {
            throw new IllegalArgumentException("Patty type cannot be empty.");
        }
        this.name = name;
        this.pattyType = pattyType;
        this.toppings = toppings != null ? List.copyOf(toppings) : Collections.emptyList();
    }

    public String getName() {
        return name;
    }

    public String getPattyType() {
        return pattyType;
    }

    public List<String> getToppings() {
        return toppings;
    }
}
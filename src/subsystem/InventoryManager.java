package subsystem;

import java.util.HashMap;
import java.util.Map;

public class InventoryManager {
    private final Map<String, Integer> stock = new HashMap<>();

    public InventoryManager() {
        stock.put("beef", 10);
        stock.put("chicken", 8);
        stock.put("veggie", 5);
        stock.put("cheddar", 15);
        stock.put("lettuce", 20);
        stock.put("tomato", 12);
        stock.put("pickles", 14);
        stock.put("onion", 10);
        stock.put("bun", 25);
    }

    public boolean checkAndReserveIngredients(BurgerRecipe recipe) {
        if (recipe == null) {
            return false;
        }

        int pattyStock = stock.getOrDefault(recipe.getPattyType().toLowerCase(), 0);
        if (pattyStock <= 0) {
            System.out.println("[InventoryManager] Out of stock for patty: " + recipe.getPattyType());
            return false;
        }

        stock.put(recipe.getPattyType().toLowerCase(), pattyStock - 1);
        stock.put("bun", stock.getOrDefault("bun", 1) - 1);

        System.out.println("[InventoryManager] Ingredients confirmed and reserved for: " + recipe.getName());
        return true;
    }

    public void restock(String ingredient, int quantity) {
        stock.put(ingredient.toLowerCase(), stock.getOrDefault(ingredient.toLowerCase(), 0) + quantity);
        System.out.println("[InventoryManager] Restocked " + ingredient + " by +" + quantity);
    }
}
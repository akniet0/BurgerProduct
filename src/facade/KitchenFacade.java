package facade;

import subsystem.AssemblyStation;
import subsystem.BurgerRecipe;
import subsystem.GrillStation;
import subsystem.InventoryManager;
import subsystem.PackagingStation;

import java.util.List;

public class KitchenFacade {
    private final InventoryManager inventory;
    private final GrillStation grill;
    private final AssemblyStation assembly;
    private final PackagingStation packaging;

    public KitchenFacade() {
        this.inventory = new InventoryManager();
        this.grill = new GrillStation();
        this.assembly = new AssemblyStation();
        this.packaging = new PackagingStation();
    }

    public boolean orderBurger(String itemType, boolean isCombo) {
        System.out.println("[KitchenFacade] Received order request: " + itemType + (isCombo ? " (Combo)" : " (Single)"));
        BurgerRecipe recipe = resolveRecipe(itemType);
        if (recipe == null) {
            System.err.println("[KitchenFacade Error] Menu item not recognized: " + itemType);
            return false;
        }

        boolean reserved = inventory.checkAndReserveIngredients(recipe);
        if (!reserved) {
            System.err.println("[KitchenFacade Error] Order rejected due to insufficient stock.");
            return false;
        }

        grill.heatGrill();
        grill.cookPatty(recipe.getPattyType());
        assembly.assembleBurger(recipe);
        packaging.packageItem(recipe.getName(), isCombo);
        System.out.println(">>> [KitchenFacade] Order finished and ready for pickup! <<<\n");
        return true;
    }

    private BurgerRecipe resolveRecipe(String itemType) {
        if (itemType == null) return null;

        return switch (itemType.trim().toLowerCase()) {
            case "classic", "classic burger" ->
                    new BurgerRecipe("Classic Cheeseburger", "beef", List.of("cheddar cheese", "crisp lettuce", "sliced tomato", "house sauce"));
            case "chicken", "crispy chicken" ->
                    new BurgerRecipe("Crispy Chicken Burger", "chicken", List.of("garlic mayo", "pickled cucumbers", "shredded lettuce"));
            case "veggie", "garden veggie" ->
                    new BurgerRecipe("Garden Veggie Burger", "veggie", List.of("diced onions", "avocado slice", "vegan dressing"));
            default -> null;
        };
    }
}
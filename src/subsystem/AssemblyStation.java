package subsystem;

public class AssemblyStation {

    public void assembleBurger(BurgerRecipe recipe) {
        if (recipe == null) {
            throw new IllegalArgumentException("Recipe cannot be null.");
        }

        System.out.println("[AssemblyStation] Toasting brioche bun base and crown...");
        System.out.println("[AssemblyStation] Placing grilled " + recipe.getPattyType() + " patty on bottom bun.");

        for (String topping : recipe.getToppings()) {
            System.out.println("[AssemblyStation] Layering topping: " + topping);
        }

        System.out.println("[AssemblyStation] Closing with toasted crown bun. " + recipe.getName() + " assembled.");
    }
}
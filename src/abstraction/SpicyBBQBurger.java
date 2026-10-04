package abstraction;

import implementor.CookingEngine;

public class SpicyBBQBurger extends Burger {
    public SpicyBBQBurger(CookingEngine cookingEngine) {
        super("Spicy Texas BBQ Burger", "Sesame Seed Bun", "Double Chuck Beef", cookingEngine);
    }

    @Override
    public void prepareMeal() {
        System.out.println(">>> Starting order: " + name + " <<<");
        cookingEngine.prepareBun(bunType);
        cookingEngine.searPatty(pattyType, 240);
        System.out.println("  [Assembly] Layering jalapeños, smoked BBQ sauce, and crispy onion rings.");
        cookingEngine.applyHeatTreatment();
        System.out.println(">>> " + name + " is ready to serve! <<<\n");
    }
}
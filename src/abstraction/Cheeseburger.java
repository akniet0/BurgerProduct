package abstraction;

import implementor.CookingEngine;

public class Cheeseburger extends Burger {
    public Cheeseburger(CookingEngine cookingEngine) {
        super("Classic Cheddar Cheeseburger", "Brioche Bun", "Angus Beef", cookingEngine);
    }

    @Override
    public void prepareMeal() {
        System.out.println(">>> Starting order: " + name + " <<<");
        cookingEngine.prepareBun(bunType);
        cookingEngine.searPatty(pattyType, 180);
        System.out.println("  [Assembly] Adding aged cheddar slice, pickles, and signature house sauce.");
        cookingEngine.applyHeatTreatment();
        System.out.println(">>> " + name + " is ready to serve! <<<\n");
    }
}
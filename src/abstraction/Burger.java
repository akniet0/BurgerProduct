package abstraction;

import implementor.CookingEngine;
import java.util.Objects;

public abstract class Burger {
    protected CookingEngine cookingEngine;
    protected String name;
    protected String bunType;
    protected String pattyType;

    public Burger(String name, String bunType, String pattyType, CookingEngine cookingEngine) {
        this.name = Objects.requireNonNull(name, "Burger name must not be null");
        this.bunType = Objects.requireNonNull(bunType, "Bun type must not be null");
        this.pattyType = Objects.requireNonNull(pattyType, "Patty type must not be null");
        this.cookingEngine = Objects.requireNonNull(cookingEngine, "CookingEngine must not be null");
    }

    public void setCookingEngine(CookingEngine cookingEngine) {
        this.cookingEngine = Objects.requireNonNull(cookingEngine, "CookingEngine must not be null");
    }

    public abstract void prepareMeal();
}
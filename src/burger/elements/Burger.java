package burger.elements;

import burger.visitors.BurgerVisitor;
import java.util.ArrayList;
import java.util.List;

public class Burger implements BurgerElement {
    private final String name;
    private final List<BurgerElement> ingredients = new ArrayList<>();

    public Burger(String name) {
        this.name = name;
    }

    public void addIngredient(BurgerElement element) {
        ingredients.add(element);
    }

    public String getName() {
        return name;
    }

    public List<BurgerElement> getIngredients() {
        return List.copyOf(ingredients);
    }

    @Override
    public void accept(BurgerVisitor visitor) {
        for (BurgerElement ingredient : ingredients) {
            ingredient.accept(visitor);
        }
    }
}
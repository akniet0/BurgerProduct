import java.util.ArrayList;
import java.util.List;

public class VeganBurgerBuilder implements BurgerBuilder {
    private String bun;
    private String patty;
    private String cheese;
    private final List<String> toppings = new ArrayList<>();
    private final List<String> sauces = new ArrayList<>();

    private static final List<String> NON_VEGAN_ITEMS = List.of(
            "beef", "meat", "chicken", "cheese", "mayo"
    );

    @Override
    public BurgerBuilder setBun(String bun) {
        this.bun = bun;
        return this;
    }

    @Override
    public BurgerBuilder setPatty(String patty) {
        this.patty = patty;
        return this;
    }

    @Override
    public BurgerBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public BurgerBuilder addTopping(String topping) {
        if (topping != null && !topping.isBlank()) {
            this.toppings.add(topping);
        }
        return this;
    }

    @Override
    public BurgerBuilder addSauce(String sauce) {
        if (sauce != null && !sauce.isBlank()) {
            this.sauces.add(sauce);
        }
        return this;
    }

    @Override
    public Burger build() {
        validateVegan();
        return new Burger(bun, patty, cheese, toppings, sauces);
    }

    private void validateVegan() {
        if (bun == null || bun.isBlank()) {
            throw new IllegalStateException("Error: Bun cannot be empty.");
        }
        if (patty == null || patty.isBlank()) {
            throw new IllegalStateException("Error: Patty cannot be empty.");
        }

        checkIsVegan(patty, "patty");
        if (cheese != null) {
            checkIsVegan(cheese, "cheese");
        }
        toppings.forEach(t -> checkIsVegan(t, "topping"));
        sauces.forEach(s -> checkIsVegan(s, "sauce"));
    }

    private void checkIsVegan(String item, String type) {
        for (String badWord : NON_VEGAN_ITEMS) {
            if (item.toLowerCase().contains(badWord)) {
                throw new IllegalStateException(
                        "Error: Cannot put '" + item + "' in a Vegan Burger!"
                );
            }
        }
    }
}
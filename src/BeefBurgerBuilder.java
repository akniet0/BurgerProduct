import java.util.ArrayList;
import java.util.List;

public class BeefBurgerBuilder implements BurgerBuilder {
    private String bun;
    private String patty;
    private String cheese;
    private final List<String> toppings = new ArrayList<>();
    private final List<String> sauces = new ArrayList<>();

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
        validateState();
        return new Burger(bun, patty, cheese, toppings, sauces);
    }

    private void validateState() {
        if (bun == null || bun.isBlank()) {
            throw new IllegalStateException("Error: Bun cannot be empty.");
        }
        if (patty == null || !patty.toLowerCase().contains("beef")) {
            throw new IllegalStateException("Error: A Beef Burger must use a beef patty.");
        }
    }
}
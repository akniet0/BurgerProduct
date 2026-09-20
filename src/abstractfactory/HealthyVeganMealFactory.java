package abstractfactory;

import builder.BurgerDirector;
import builder.VeganBurgerBuilder;
import model.Burger;
import model.Drink;
import model.Side;
import model.items.SaladSide;
import model.items.SmoothieDrink;

public class HealthyVeganMealFactory implements MealFactory {
    private final BurgerDirector director = new BurgerDirector();

    @Override
    public Burger createBurger() {
        return director.makeClassicVeganBurger(new VeganBurgerBuilder());
    }

    @Override
    public Drink createDrink() {
        return new SmoothieDrink();
    }

    @Override
    public Side createSide() {
        return new SaladSide();
    }
}
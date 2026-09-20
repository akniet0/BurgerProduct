package abstractfactory;

import builder.BeefBurgerBuilder;
import builder.BurgerDirector;
import model.Burger;
import model.Drink;
import model.Side;
import model.items.ColaDrink;
import model.items.FriesSide;

public class ClassicBeefMealFactory implements MealFactory {
    private final BurgerDirector director = new BurgerDirector();

    @Override
    public Burger createBurger() {
        return director.makeClassicBeefBurger(new BeefBurgerBuilder());
    }

    @Override
    public Drink createDrink() {
        return new ColaDrink();
    }

    @Override
    public Side createSide() {
        return new FriesSide();
    }
}
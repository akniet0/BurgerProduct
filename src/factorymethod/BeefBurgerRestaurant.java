package factorymethod;

import builder.BeefBurgerBuilder;
import builder.BurgerDirector;
import model.Burger;

public class BeefBurgerRestaurant extends Restaurant {
    private final BurgerDirector director = new BurgerDirector();

    @Override
    public Burger createBurger() {
        return director.makeClassicBeefBurger(new BeefBurgerBuilder());
    }
}
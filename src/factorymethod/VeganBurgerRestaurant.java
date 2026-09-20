package factorymethod;

import builder.BurgerDirector;
import builder.VeganBurgerBuilder;
import model.Burger;

public class VeganBurgerRestaurant extends Restaurant {
    private final BurgerDirector director = new BurgerDirector();

    @Override
    public Burger createBurger() {
        return director.makeClassicVeganBurger(new VeganBurgerBuilder());
    }
}
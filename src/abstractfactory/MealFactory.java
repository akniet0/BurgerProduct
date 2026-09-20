package abstractfactory;

import model.Burger;
import model.Drink;
import model.Side;

public interface MealFactory {
    Burger createBurger();
    Drink createDrink();
    Side createSide();
}
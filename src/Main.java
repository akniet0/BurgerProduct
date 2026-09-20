import abstractfactory.ClassicBeefMealFactory;
import abstractfactory.HealthyVeganMealFactory;
import abstractfactory.MealCombo;
import abstractfactory.MealFactory;
import factorymethod.BeefBurgerRestaurant;
import factorymethod.Restaurant;
import factorymethod.VeganBurgerRestaurant;
import model.Burger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method: ");

        Restaurant beefPlace = new BeefBurgerRestaurant();
        Burger beefOrder = beefPlace.orderBurger();
        System.out.println(beefOrder);
        System.out.println();

        Restaurant veganPlace = new VeganBurgerRestaurant();
        Burger veganOrder = veganPlace.orderBurger();
        System.out.println(veganOrder);
        System.out.println();


        System.out.println("Abstract Factory: ");

        System.out.println("Serving Customer #1 (Classic Beef Combo):");
        MealFactory beefComboFactory = new ClassicBeefMealFactory();
        MealCombo beefCombo = new MealCombo(beefComboFactory);
        beefCombo.displayMeal();

        System.out.println("Serving Customer #2 (Healthy Vegan Combo):");
        MealFactory veganComboFactory = new HealthyVeganMealFactory();
        MealCombo veganCombo = new MealCombo(veganComboFactory);
        veganCombo.displayMeal();
    }
}
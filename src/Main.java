import abstraction.Burger;
import abstraction.Cheeseburger;
import abstraction.SpicyBBQBurger;
import implementor.CookingEngine;
import implementor.FlameGrillEngine;
import implementor.SmashGriddleEngine;

public class Main {
    public static void main(String[] args) {
        CookingEngine flameGrill = new FlameGrillEngine();
        CookingEngine smashGriddle = new SmashGriddleEngine();

        Burger cheeseburger = new Cheeseburger(flameGrill);
        cheeseburger.prepareMeal();

        System.out.println("--- [Customer Request] Change Cheeseburger style to Smash Griddle ---");
        cheeseburger.setCookingEngine(smashGriddle);
        cheeseburger.prepareMeal();

        Burger bbqBurger = new SpicyBBQBurger(flameGrill);
        bbqBurger.prepareMeal();
    }
}
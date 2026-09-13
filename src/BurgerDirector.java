public class BurgerDirector {


    public Burger makeClassicBeefBurger(BurgerBuilder builder) {
        return builder.setBun("White Bread")
                .setPatty("Beef Patty")
                .setCheese("Cheddar Cheese")
                .addTopping("Tomato")
                .addTopping("Onion")
                .addSauce("Ketchup")
                .build();
    }

    public Burger makeClassicVeganBurger(BurgerBuilder builder) {
        return builder.setBun("Whole Bread")
                .setPatty("Tofu Patty")
                .addTopping("Tomato")
                .addTopping("Cucumber")
                .addSauce("Ketchup")
                .build();
    }
}
public class Main {
    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();

        BurgerBuilder beefBuilder = new BeefBurgerBuilder();
        Burger classicBeef = director.makeClassicBeefBurger(beefBuilder);
        System.out.println("Classic Beef Burger:");
        System.out.println(classicBeef);

        BurgerBuilder veganBuilder = new VeganBurgerBuilder();
        Burger classicVegan = director.makeClassicVeganBurger(veganBuilder);
        System.out.println("Classic Vegan Burger:");
        System.out.println(classicVegan);

        Burger customBurger = new BeefBurgerBuilder()
                .setBun("White Bread")
                .setPatty("Beef Patty")
                .addTopping("Pickles")
                .addSauce("Mustard")
                .build();
        System.out.println("Custom Burger:");
        System.out.println(customBurger);


        try {
            new VeganBurgerBuilder()
                    .setBun("White Bread")
                    .setPatty("Beef Patty")
                    .build();
        } catch (IllegalStateException e) {
            System.out.println("Caught expected error: " + e.getMessage());
        }
    }
}
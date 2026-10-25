import facade.KitchenFacade;

public class Main {
    public static void main(String[] args) {
        KitchenFacade kitchen = new KitchenFacade();
        kitchen.orderBurger("classic", true);
        kitchen.orderBurger("crispy chicken", false);
        kitchen.orderBurger("veggie", true);
        kitchen.orderBurger("fish burger", false);
    }
}
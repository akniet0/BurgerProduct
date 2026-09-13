public interface BurgerBuilder {
    BurgerBuilder setBun(String bun);
    BurgerBuilder setPatty(String patty);
    BurgerBuilder setCheese(String cheese);
    BurgerBuilder addTopping(String topping);
    BurgerBuilder addSauce(String sauce);
    Burger build();
}
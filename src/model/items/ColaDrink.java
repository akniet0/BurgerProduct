package model.items;

import model.Drink;

public class ColaDrink implements Drink {
    @Override
    public String getDetails() {
        return "Chilled Classic Cola (500ml)";
    }
}
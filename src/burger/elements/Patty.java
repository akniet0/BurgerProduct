package burger.elements;

import burger.visitors.BurgerVisitor;

public class Patty implements BurgerElement {
    private final String meatType;
    private final int weightGrams;
    private final double pricePerGram;
    private final int caloriesPer100g;

    public Patty(String meatType, int weightGrams, double pricePerGram, int caloriesPer100g) {
        this.meatType = meatType;
        this.weightGrams = weightGrams;
        this.pricePerGram = pricePerGram;
        this.caloriesPer100g = caloriesPer100g;
    }

    public String getMeatType() {
        return meatType;
    }

    public int getWeightGrams() {
        return weightGrams;
    }

    public double getPricePerGram() {
        return pricePerGram;
    }

    public int getCaloriesPer100g() {
        return caloriesPer100g;
    }

    @Override
    public void accept(BurgerVisitor visitor) {
        visitor.visitPatty(this);
    }
}
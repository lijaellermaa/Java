package com.company.exam1;

public class Apple {
    String variety;
    int calories;
    int amount;

    Apple() {

    }

    Apple(String variety, int calories, int amount) {
        this.variety = variety;
        this.calories = calories;
        this.amount = amount;
    }

    public String description() {
        return variety + " " + calories + " " + amount;
    }
}

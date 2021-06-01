package com.company.Homework.TaskA;

public class Banana implements EatableFruit {
    private String color;
    private String whichCountryRaised;

    public Banana(String color, String whichCountryRaised) {
        this.color = color;
        this.whichCountryRaised = whichCountryRaised;
    }

    @Override
    public void isEatable(boolean IS_FRUIT) {
        if (!IS_FRUIT) {
            System.out.println("Monkey can't eat it");
        } else {
            System.out.println("Monkey can eat it");
        }
    }
}

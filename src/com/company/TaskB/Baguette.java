package com.company.TaskB;

public class Baguette extends Bread{
    int length;
    int numberOfLongitudinalScars;

    public Baguette(int length, int numberOfLongitudinalScars) {
        this.length = length;
        this.numberOfLongitudinalScars = numberOfLongitudinalScars;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNumberOfLongitudinalScars() {
        return numberOfLongitudinalScars;
    }

    public void setNumberOfLongitudinalScars(int numberOfLongitudinalScars) {
        this.numberOfLongitudinalScars = numberOfLongitudinalScars;
    }

    void scarring(){
        System.out.println("Scar the baguette");
    }

    @Override
    void pack() {
        System.out.println("Pack baguette");
        System.out.println("Only in an eco-friendly package");
    }
}

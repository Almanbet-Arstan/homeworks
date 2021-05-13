package com.company.TaskB;

public class Lepeshka extends Bread{
    double radius;

    public Lepeshka(Double weight, double radius) {
        if (weight > 200)
            setWeight(weight);
        else {
            System.out.println("Lepeshka poddelka");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void bake() {
        System.out.println("Bake Lepeshka");
    }

    @Override
    void pack() {
        System.out.println("Pack Lepeshka");
    }

    void drawPrints() {
        System.out.println("Draw prints Lepeshka");
    }
    void varnish() {
        System.out.println("Varnish Lepeshka");
    }
}

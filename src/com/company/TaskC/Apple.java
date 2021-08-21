package com.company.TaskC;

public class Apple extends AbstractFruits{
    public Apple(String variety) {
        super(variety);
    }

    public Apple() {
    }

    @Override
    public String toString() {
        return String.format("Apple: %s", getVariety());
    }
}

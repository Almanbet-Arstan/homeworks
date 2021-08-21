package com.company.TaskC;

public class Pear extends AbstractFruits{
    public Pear() {
    }

    public Pear(String variety) {
        super(variety);
    }

    @Override
    public String toString() {
        return String.format("Pear: %s", getVariety());
    }
}

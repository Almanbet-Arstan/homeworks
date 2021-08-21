package com.company.TaskC;

public class Apricot extends AbstractFruits{
    private boolean isWormy;

    public Apricot() {
    }

    public Apricot(String variety, boolean isWormy) {
        super(variety);
        this.isWormy = isWormy;
    }

    public boolean isWormy() {
        return isWormy;
    }

    public void setWormy(boolean wormy) {
        isWormy = wormy;
    }

    @Override
    public String toString() {
        return String.format("Apricot: %s | %s", getVariety(), isWormy ? "Wormy" : "Not wormy");
    }
}
